package com.dao;

import com.model.IMOrder;
import com.model.IMOrderExample;
import com.model.IMOrderKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IMOrderMapper {
    int countByExample(IMOrderExample example);

    int deleteByExample(IMOrderExample example);

    int deleteByPrimaryKey(IMOrderKey key);

    int insert(IMOrder record);

    int insertSelective(IMOrder record);

    List<IMOrder> selectByExample(IMOrderExample example);

    IMOrder selectByPrimaryKey(IMOrderKey key);

    int updateByExampleSelective(@Param("record") IMOrder record, @Param("example") IMOrderExample example);

    int updateByExample(@Param("record") IMOrder record, @Param("example") IMOrderExample example);

    int updateByPrimaryKeySelective(IMOrder record);

    int updateByPrimaryKey(IMOrder record);
}