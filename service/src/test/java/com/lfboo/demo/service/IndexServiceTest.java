package com.lfboo.demo.service;

import com.lfboo.demo.BaseTest;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.annotation.Resource;

/**
 * Created by on 2018/8/5.
 *
 * @author lfb
 */
public class IndexServiceTest extends BaseTest {
    @Resource
    private IndexService indexService;

    private static final Logger LOGGER = LoggerFactory.getLogger(IndexServiceTest.class);

    @Test
    public void testSayHello() {
        LOGGER.warn("step into test say hello...");
        Assert.assertTrue(StringUtils.isNotEmpty(indexService.sayHello("netease")));
    }
}
