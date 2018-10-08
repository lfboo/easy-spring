package com.lfboo.demo.dao.mapper;

import com.lfboo.demo.dao.entity.MLottery;
import org.apache.ibatis.annotations.Param;

/**
 * Created by on 2018/10/7.
 *
 * @author lfb
 */
public interface MLotteryMapper {

    int insert(MLottery mLottery);

    MLottery getById(@Param("id") long id);

}
