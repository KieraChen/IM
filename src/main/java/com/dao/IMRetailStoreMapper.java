package com.dao;

import com.model.IMRetailStore;
import com.model.IMRetailStoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IMRetailStoreMapper {
    int countByExample(IMRetailStoreExample example);

    int deleteByExample(IMRetailStoreExample example);

    int deleteByPrimaryKey(Integer lRetailStoreLookUpID);

    int insert(IMRetailStore record);

    int insertSelective(IMRetailStore record);

    List<IMRetailStore> selectByExample(IMRetailStoreExample example);

    IMRetailStore selectByPrimaryKey(Integer lRetailStoreLookUpID);

    int updateByExampleSelective(@Param("record") IMRetailStore record, @Param("example") IMRetailStoreExample example);

    int updateByExample(@Param("record") IMRetailStore record, @Param("example") IMRetailStoreExample example);

    int updateByPrimaryKeySelective(IMRetailStore record);

    int updateByPrimaryKey(IMRetailStore record);
}