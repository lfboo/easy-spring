package com.lfboo.demo.service;

import com.lfboo.demo.dao.entity.MOrder;

/**
 * Created by on 2018/8/27.
 *
 * @author lfb
 */
public interface MOrderService {

    Long addOrder(MOrder mOrder);

    MOrder selectById(Long id);

}
