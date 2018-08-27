package com.lfboo.demo;

import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.BeforeMethod;

/**
 * Created by on 2018/8/6.
 *
 * @author lfb
 */
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class BaseTest extends AbstractTestNGSpringContextTests {

    @BeforeMethod
    public void initMocks() {
        MockitoAnnotations.initMocks(this);
    }
}
