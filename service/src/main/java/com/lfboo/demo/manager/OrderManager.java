package com.lfboo.demo.manager;

import com.lfboo.demo.annotation.NeedLog;
import com.lfboo.demo.dto.OrderDTO;

/**
 * Created by on 2018/8/27.
 *
 * @author lfb
 */
public interface OrderManager {

    @NeedLog
    boolean addOrder(OrderDTO orderDTO);

}
