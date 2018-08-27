package com.lfboo.demo.service.impl;

import com.lfboo.demo.service.IndexService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by on 2018/8/5.
 *
 * @author lfb
 */
@Service
public class IndexServiceImpl implements IndexService {

    @Transactional(rollbackFor = Exception.class)
    @Override
    public String sayHello(String name) {
        return "hello, " + name;
    }
}
