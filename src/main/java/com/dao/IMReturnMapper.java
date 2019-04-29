package com.dao;

import com.model.IMReturn;
import com.model.IMReturnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IMReturnMapper {
    int countByExample(IMReturnExample example);

    int deleteByExample(IMReturnExample example);

    int deleteByPrimaryKey(Long lSequenceNumber);

    int insert(IMReturn record);

    int insertSelective(IMReturn record);

    List<IMReturn> selectByExample(IMReturnExample example);

    IMReturn selectByPrimaryKey(Long lSequenceNumber);

    int updateByExampleSelective(@Param("record") IMReturn record, @Param("example") IMReturnExample example);

    int updateByExample(@Param("record") IMReturn record, @Param("example") IMReturnExample example);

    int updateByPrimaryKeySelective(IMReturn record);

    int updateByPrimaryKey(IMReturn record);
}