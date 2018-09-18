package com.lfboo.demo.cache;

/**
 * Created by on 2018/9/17.
 *
 * @author lfb
 */
public interface CacheClient {

    <T> void set(String key, T value, int expireTime);

    <T> T get(String key);

    Long ttl(String key);

}
