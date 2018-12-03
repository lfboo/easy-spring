package com.lfboo.demo.dao;

import com.google.common.collect.Lists;
import com.lfboo.demo.BaseTest;
import com.lfboo.demo.common.dto.Probability;
import com.lfboo.demo.dao.entity.MLottery;
import com.lfboo.demo.dao.mapper.MLotteryMapper;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by on 2018/10/7.
 *
 * @author lfb
 */
public class MLotteryMapperTest extends BaseTest {

    @Resource
    private MLotteryMapper mLotteryMapper;

    @Test
    public void testInsert() {
        MLottery mLottery = new MLottery();
        mLottery.setName("测试抽奖1");
        List<Probability> probabilityList = Lists.newArrayList();
        Probability probability1 = new Probability(BigDecimal.valueOf(0.1), BigDecimal.valueOf(0.9), 50d);
        Probability probability2 = new Probability(BigDecimal.valueOf(1), BigDecimal.valueOf(2), 40d);
        Probability probability3 = new Probability(BigDecimal.valueOf(2.1), BigDecimal.valueOf(5), 10d);
        probabilityList.add(probability1);
        probabilityList.add(probability2);
        probabilityList.add(probability3);

        mLottery.setProbabilities(probabilityList);
        long now = System.currentTimeMillis()/1000;
        mLottery.setCreateTime(now);
        mLottery.setUpdateTime(now);
        int count = mLotteryMapper.insert(mLottery);
        Assert.assertTrue(count > 0);
    }

    @Test
    public void testGetById() {
        MLottery mLottery = mLotteryMapper.getById(1L);
        Assert.assertTrue(null != mLottery);
    }

    @Test
    public void testUpdateProbabilityById() {
        List<Probability> probabilities = Lists.newArrayList();
        Probability probability1 = new Probability(BigDecimal.valueOf(0.2),BigDecimal.valueOf(0.5),70);
        Probability probability2 = new Probability(BigDecimal.valueOf(0.6),BigDecimal.valueOf(1),30);
        probabilities.add(probability1);
        probabilities.add(probability2);
        boolean res = mLotteryMapper.updateProbabilityById(1L, probabilities);
        Assert.assertTrue(res);
    }
}
