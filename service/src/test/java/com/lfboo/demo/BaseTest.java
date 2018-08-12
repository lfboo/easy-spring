package com.lfboo.demo;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

/**
 * Created by on 2018/8/6.
 *
 * @author lfb
 */
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class BaseTest extends AbstractTestNGSpringContextTests {
}
