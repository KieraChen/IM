package com.dao;

import com.model.IMStockTake;
import com.model.IMStockTakeExample;
import com.model.IMStockTakeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IMStockTakeMapper {
    int countByExample(IMStockTakeExample example);

    int deleteByExample(IMStockTakeExample example);

    int deleteByPrimaryKey(IMStockTakeKey key);

    int insert(IMStockTake record);

    int insertSelective(IMStockTake record);

    List<IMStockTake> selectByExample(IMStockTakeExample example);

    IMStockTake selectByPrimaryKey(IMStockTakeKey key);

    int updateByExampleSelective(@Param("record") IMStockTake record, @Param("example") IMStockTakeExample example);

    int updateByExample(@Param("record") IMStockTake record, @Param("example") IMStockTakeExample example);

    int updateByPrimaryKeySelective(IMStockTake record);

    int updateByPrimaryKey(IMStockTake record);
}