package com.lfboo.demo.service.impl;

import com.lfboo.demo.dao.entity.MUser;
import com.lfboo.demo.service.MUserService;
import org.springframework.stereotype.Service;

/**
 * Created by on 2018/8/27.
 *
 * @author lfb
 */
@Service
public class MUserServiceImpl implements MUserService {
    @Override
    public Long addUser() {
        return null;
    }

    @Override
    public MUser selectById(Long id) {
        return null;
    }

    @Override
    public boolean updateOrderNumByUserId(Long userId) {
        return true;
    }
}
