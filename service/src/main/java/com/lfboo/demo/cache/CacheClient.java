package com.lfboo.demo.cache;

import com.lfboo.demo.annotation.NeedLog;

/**
 * Created by on 2018/9/17.
 *
 * @author lfb
 */
public interface CacheClient {

    @NeedLog
    <T> void set(String key, T value, int expireTime);

    <T> T get(String key);

    Long ttl(String key);

}
