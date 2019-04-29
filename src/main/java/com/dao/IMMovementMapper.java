package com.dao;

import com.model.IMMovement;
import com.model.IMMovementExample;
import com.model.IMMovementKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IMMovementMapper {
    int countByExample(IMMovementExample example);

    int deleteByExample(IMMovementExample example);

    int deleteByPrimaryKey(IMMovementKey key);

    int insert(IMMovement record);

    int insertSelective(IMMovement record);

    List<IMMovement> selectByExample(IMMovementExample example);

    IMMovement selectByPrimaryKey(IMMovementKey key);

    int updateByExampleSelective(@Param("record") IMMovement record, @Param("example") IMMovementExample example);

    int updateByExample(@Param("record") IMMovement record, @Param("example") IMMovementExample example);

    int updateByPrimaryKeySelective(IMMovement record);

    int updateByPrimaryKey(IMMovement record);
}