package com.lfboo.demo.service;

import com.lfboo.demo.dao.entity.MOrder;
import com.lfboo.demo.dao.entity.MUser;

/**
 * Created by on 2018/8/27.
 *
 * @author lfb
 */
public interface MUserService {

    Long addUser();

    MUser selectById(Long id);

    boolean updateOrderNumByUserId(Long userId);

}
