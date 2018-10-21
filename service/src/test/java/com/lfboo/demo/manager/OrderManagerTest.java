package com.lfboo.demo.manager;

import com.lfboo.demo.BaseTest;
import com.lfboo.demo.dto.OrderDTO;
import com.lfboo.demo.service.MUserService;
import org.mockito.Mock;
import org.springframework.test.util.ReflectionTestUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.annotation.Resource;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

/**
 * Created by on 2018/8/27.
 *
 * @author lfb
 */
public class OrderManagerTest extends BaseTest {

    @Resource
    private OrderManager orderManager;

    @Mock
    private MUserService mockMUserService;

    @Test
    public void testAddOrder() {
        ReflectionTestUtils.setField(orderManager, "mUserService", mockMUserService);
        when(mockMUserService.updateOrderNumByUserId(anyLong())).thenReturn(false);

        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setUserId(1L);
        Long now = System.currentTimeMillis()/1000;
        orderDTO.setCreateTime(now);
        orderDTO.setUpdateTime(now);
        orderDTO.setDeleted(false);
        boolean result = orderManager.addOrder(orderDTO);
        Assert.assertTrue(result);
    }
}
