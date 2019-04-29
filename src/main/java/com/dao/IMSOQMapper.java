package com.dao;

import com.model.IMSOQ;
import com.model.IMSOQExample;
import com.model.IMSOQKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IMSOQMapper {
    int countByExample(IMSOQExample example);

    int deleteByExample(IMSOQExample example);

    int deleteByPrimaryKey(IMSOQKey key);

    int insert(IMSOQ record);

    int insertSelective(IMSOQ record);

    List<IMSOQ> selectByExample(IMSOQExample example);

    IMSOQ selectByPrimaryKey(IMSOQKey key);

    int updateByExampleSelective(@Param("record") IMSOQ record, @Param("example") IMSOQExample example);

    int updateByExample(@Param("record") IMSOQ record, @Param("example") IMSOQExample example);

    int updateByPrimaryKeySelective(IMSOQ record);

    int updateByPrimaryKey(IMSOQ record);
}