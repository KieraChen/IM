package com.dao;

import com.model.IMMovementDetail;
import com.model.IMMovementDetailExample;
import com.model.IMMovementDetailKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IMMovementDetailMapper {
    int countByExample(IMMovementDetailExample example);

    int deleteByExample(IMMovementDetailExample example);

    int deleteByPrimaryKey(IMMovementDetailKey key);

    int insert(IMMovementDetail record);

    int insertSelective(IMMovementDetail record);

    List<IMMovementDetail> selectByExample(IMMovementDetailExample example);

    IMMovementDetail selectByPrimaryKey(IMMovementDetailKey key);

    int updateByExampleSelective(@Param("record") IMMovementDetail record, @Param("example") IMMovementDetailExample example);

    int updateByExample(@Param("record") IMMovementDetail record, @Param("example") IMMovementDetailExample example);

    int updateByPrimaryKeySelective(IMMovementDetail record);

    int updateByPrimaryKey(IMMovementDetail record);
}