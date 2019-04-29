package com.dao;

import com.model.IMStockTakeItem;
import com.model.IMStockTakeItemExample;
import com.model.IMStockTakeItemKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IMStockTakeItemMapper {
    int countByExample(IMStockTakeItemExample example);

    int deleteByExample(IMStockTakeItemExample example);

    int deleteByPrimaryKey(IMStockTakeItemKey key);

    int insert(IMStockTakeItem record);

    int insertSelective(IMStockTakeItem record);

    List<IMStockTakeItem> selectByExample(IMStockTakeItemExample example);

    IMStockTakeItem selectByPrimaryKey(IMStockTakeItemKey key);

    int updateByExampleSelective(@Param("record") IMStockTakeItem record, @Param("example") IMStockTakeItemExample example);

    int updateByExample(@Param("record") IMStockTakeItem record, @Param("example") IMStockTakeItemExample example);

    int updateByPrimaryKeySelective(IMStockTakeItem record);

    int updateByPrimaryKey(IMStockTakeItem record);
}