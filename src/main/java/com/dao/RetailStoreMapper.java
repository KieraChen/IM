package com.dao;

import com.model.RetailStore;
import com.model.RetailStoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RetailStoreMapper {
    int countByExample(RetailStoreExample example);

    int deleteByExample(RetailStoreExample example);

    int deleteByPrimaryKey(Integer lRetailStoreID);

    int insert(RetailStore record);

    int insertSelective(RetailStore record);

    List<RetailStore> selectByExample(RetailStoreExample example);

    RetailStore selectByPrimaryKey(Integer lRetailStoreID);

    int updateByExampleSelective(@Param("record") RetailStore record, @Param("example") RetailStoreExample example);

    int updateByExample(@Param("record") RetailStore record, @Param("example") RetailStoreExample example);

    int updateByPrimaryKeySelective(RetailStore record);

    int updateByPrimaryKey(RetailStore record);
}