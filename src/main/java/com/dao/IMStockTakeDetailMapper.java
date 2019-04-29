package com.dao;

import com.model.IMStockTakeDetail;
import com.model.IMStockTakeDetailExample;
import com.model.IMStockTakeDetailKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IMStockTakeDetailMapper {
    int countByExample(IMStockTakeDetailExample example);

    int deleteByExample(IMStockTakeDetailExample example);

    int deleteByPrimaryKey(IMStockTakeDetailKey key);

    int insert(IMStockTakeDetail record);

    int insertSelective(IMStockTakeDetail record);

    List<IMStockTakeDetail> selectByExample(IMStockTakeDetailExample example);

    IMStockTakeDetail selectByPrimaryKey(IMStockTakeDetailKey key);

    int updateByExampleSelective(@Param("record") IMStockTakeDetail record, @Param("example") IMStockTakeDetailExample example);

    int updateByExample(@Param("record") IMStockTakeDetail record, @Param("example") IMStockTakeDetailExample example);

    int updateByPrimaryKeySelective(IMStockTakeDetail record);

    int updateByPrimaryKey(IMStockTakeDetail record);
}