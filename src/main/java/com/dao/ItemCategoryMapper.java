package com.dao;

import com.model.ItemCategory;
import com.model.ItemCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemCategoryMapper {
    int countByExample(ItemCategoryExample example);

    int deleteByExample(ItemCategoryExample example);

    int deleteByPrimaryKey(String szItemCategoryTypeCode);

    int insert(ItemCategory record);

    int insertSelective(ItemCategory record);

    List<ItemCategory> selectByExample(ItemCategoryExample example);

    ItemCategory selectByPrimaryKey(String szItemCategoryTypeCode);

    int updateByExampleSelective(@Param("record") ItemCategory record, @Param("example") ItemCategoryExample example);

    int updateByExample(@Param("record") ItemCategory record, @Param("example") ItemCategoryExample example);

    int updateByPrimaryKeySelective(ItemCategory record);

    int updateByPrimaryKey(ItemCategory record);
}