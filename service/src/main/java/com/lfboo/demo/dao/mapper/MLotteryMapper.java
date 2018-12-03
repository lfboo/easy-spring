package com.lfboo.demo.dao.mapper;

import com.lfboo.demo.annotation.DebugParam;
import com.lfboo.demo.common.dto.Probability;
import com.lfboo.demo.dao.entity.MLottery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by on 2018/10/7.
 *
 * @author lfb
 */
public interface MLotteryMapper {

    int insert(MLottery mLottery);

    @DebugParam
    MLottery getById(@Param("id") long id);

    boolean updateProbabilityById(@Param("id") long id, @Param("probabilities")List<Probability> probabilities);

}
