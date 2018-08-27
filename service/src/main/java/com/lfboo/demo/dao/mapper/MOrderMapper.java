package com.lfboo.demo.dao.mapper;

import com.lfboo.demo.dao.entity.MOrder;
import com.lfboo.demo.dao.entity.MUser;

/**
 * Created by on 2018/8/27.
 *
 * @author lfb
 */
public interface MOrderMapper {

    Long insert(MOrder record);

    int deleteByPrimaryKey(Long id);

    int updateByPrimaryKey(MOrder record);

    MOrder selectByPrimaryKey(Long id);

}
