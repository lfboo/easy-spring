package com.lfboo.demo.service.impl;

import com.lfboo.demo.dao.entity.MOrder;
import com.lfboo.demo.dao.mapper.MOrderMapper;
import com.lfboo.demo.service.MOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by on 2018/8/27.
 *
 * @author lfb
 */
@Service
public class MOrderServiceImpl implements MOrderService {

    @Resource
    private MOrderMapper mOrderMapper;

    @Override
    public Long addOrder(MOrder mOrder) {
        return mOrderMapper.insert(mOrder);
    }

    @Override
    public MOrder selectById(Long id) {
        return null;
    }
}
