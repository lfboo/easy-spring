package com.lfboo.demo.service.impl;

import com.lfboo.demo.service.IndexService;
import org.springframework.stereotype.Service;

/**
 * Created by on 2018/8/5.
 *
 * @author lfb
 */
@Service
public class IndexServiceImpl implements IndexService {
    @Override
    public String sayHello(String name) {
        return "hello, " + name;
    }
}
