package com.lfboo.demo.dao.typehandler;

import com.alibaba.fastjson.JSON;
import com.lfboo.demo.common.dto.Probability;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by on 2018/10/7.
 *
 * @author lfb
 */
@MappedJdbcTypes(JdbcType.VARCHAR)
@MappedTypes(Probability.class)
public class ProbabilityTypeHandler extends BaseTypeHandler<List<Probability>> {

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, List<Probability> parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(i, JSON.toJSONString(parameter));
    }

    @Override
    public List<Probability> getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return ProbabilityParser.parse(rs.getString(columnName));
    }

    @Override
    public List<Probability> getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return ProbabilityParser.parse(rs.getString(columnIndex));
    }

    @Override
    public List<Probability> getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return ProbabilityParser.parse(cs.getString(columnIndex));
    }
}
