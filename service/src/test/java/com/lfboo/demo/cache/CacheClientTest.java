package com.lfboo.demo.cache;

import com.lfboo.demo.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.collections.Maps;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by on 2018/9/18.
 *
 * @author lfb
 */
public class CacheClientTest extends BaseTest {

    @Resource
    private CacheClient cacheClient;

    private String CACHE_KEY = "test_cache_key";

    private int CACHE_TIME = 30;

    private Map<String,Object> CACHE_DATA = Maps.newHashMap();

    @BeforeClass
    public void setUp() {
        CACHE_DATA.put("name", "hzlvfeibiao");
        CACHE_DATA.put("age", 30);
    }

    @Test
    public void testSetAndGet() {
        cacheClient.set(CACHE_KEY, CACHE_DATA, CACHE_TIME);
        Map<String,Object> data = cacheClient.get(CACHE_KEY);
        Assert.assertTrue(data.get("name").equals(CACHE_DATA.get("name")));
        Assert.assertTrue(data.get("age").equals(CACHE_DATA.get("age")));
    }
}
