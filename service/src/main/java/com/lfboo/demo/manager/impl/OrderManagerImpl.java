package com.lfboo.demo.manager.impl;

import com.lfboo.demo.dao.entity.MOrder;
import com.lfboo.demo.dto.OrderDTO;
import com.lfboo.demo.manager.OrderManager;
import com.lfboo.demo.service.MOrderService;
import com.lfboo.demo.service.MUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by on 2018/8/27.
 *
 * @author lfb
 */
@Service
public class OrderManagerImpl implements OrderManager {

    @Resource
    private MOrderService mOrderService;

    @Resource
    private MUserService mUserService;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean addOrder(OrderDTO orderDTO) {
        MOrder mOrder = new MOrder();
        mOrder.setUserId(orderDTO.getUserId());
        mOrder.setCreateTime(orderDTO.getCreateTime());
        mOrder.setUpdateTime(orderDTO.getUpdateTime());
        mOrder.setDeleted(orderDTO.isDeleted() ? (byte) 1 : (byte) 0);
        Long lastInsertId = mOrderService.addOrder(mOrder);
        System.out.println(lastInsertId);
        boolean result = mUserService.updateOrderNumByUserId(mOrder.getUserId());
        System.out.println(result);

        return true;
    }
}
