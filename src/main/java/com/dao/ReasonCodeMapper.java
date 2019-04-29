package com.dao;

import com.model.ReasonCode;
import com.model.ReasonCodeExample;
import com.model.ReasonCodeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReasonCodeMapper {
    int countByExample(ReasonCodeExample example);

    int deleteByExample(ReasonCodeExample example);

    int deleteByPrimaryKey(ReasonCodeKey key);

    int insert(ReasonCode record);

    int insertSelective(ReasonCode record);

    List<ReasonCode> selectByExample(ReasonCodeExample example);

    ReasonCode selectByPrimaryKey(ReasonCodeKey key);

    int updateByExampleSelective(@Param("record") ReasonCode record, @Param("example") ReasonCodeExample example);

    int updateByExample(@Param("record") ReasonCode record, @Param("example") ReasonCodeExample example);

    int updateByPrimaryKeySelective(ReasonCode record);

    int updateByPrimaryKey(ReasonCode record);
}