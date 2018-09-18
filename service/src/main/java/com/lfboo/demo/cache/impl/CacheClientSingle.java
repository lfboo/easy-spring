package com.lfboo.demo.cache.impl;

import com.lfboo.demo.cache.CacheClient;
import com.lfboo.demo.util.SerializeUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.annotation.Resource;
import java.util.function.Function;

/**
 * Created by on 2018/9/17.
 *
 * @author lfb
 */
@Component
public class CacheClientSingle implements CacheClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(CacheClientSingle.class);

    @Resource
    private JedisPool jedisPool;

    private <V> V doInRedis(Function<Jedis, V> function) {
        Jedis jedis = jedisPool.getResource();
        try {
            return function.apply(jedis);
        } catch (Exception e) {
            LOGGER.error("redis operation exception", e);
        } finally {
            jedis.close();
        }
        return null;
    }


    @Override
    public <T> void set(String key, T value, int expireTime) {
        doInRedis(jedis -> {
            String res = jedis.set(key.getBytes(), SerializeUtil.serialize(value), "NX".getBytes(), "EX".getBytes(), expireTime);
            return StringUtils.isNotBlank(res);
        });
    }

    @Override
    public <T> T get(String key) {
        return doInRedis(jedis -> {
            byte[] bytes = jedis.get(key.getBytes());
            return SerializeUtil.deserialize(bytes);
        });
    }

    @Override
    public Long ttl(String key) {
        return doInRedis(jedis -> jedis.ttl(key.getBytes()));
    }
}
