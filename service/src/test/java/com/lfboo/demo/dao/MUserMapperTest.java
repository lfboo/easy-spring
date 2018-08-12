package com.lfboo.demo.dao;

import com.lfboo.demo.BaseTest;
import com.lfboo.demo.dao.entity.MUser;
import com.lfboo.demo.dao.mapper.MUserMapper;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.annotation.Resource;

/**
 * Created by on 2018/8/13.
 *
 * @author lfb
 */
public class MUserMapperTest extends BaseTest {

    @Resource
    private MUserMapper mUserMapper;

    private Long id;

    @BeforeClass
    public void before() {
        id = 1L;
    }

    @Test
    public void testSelectById() {
        MUser mUser = mUserMapper.selectByPrimaryKey(id);
        Assert.assertNotNull(mUser);
    }
}
