package com.dao;

import com.model.IMStorageLocation;
import com.model.IMStorageLocationExample;
import com.model.IMStorageLocationKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IMStorageLocationMapper {
    int countByExample(IMStorageLocationExample example);

    int deleteByExample(IMStorageLocationExample example);

    int deleteByPrimaryKey(IMStorageLocationKey key);

    int insert(IMStorageLocation record);

    int insertSelective(IMStorageLocation record);

    List<IMStorageLocation> selectByExample(IMStorageLocationExample example);

    IMStorageLocation selectByPrimaryKey(IMStorageLocationKey key);

    int updateByExampleSelective(@Param("record") IMStorageLocation record, @Param("example") IMStorageLocationExample example);

    int updateByExample(@Param("record") IMStorageLocation record, @Param("example") IMStorageLocationExample example);

    int updateByPrimaryKeySelective(IMStorageLocation record);

    int updateByPrimaryKey(IMStorageLocation record);
}