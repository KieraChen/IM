package com.dao;

import com.model.POSIdentity;
import com.model.POSIdentityExample;
import com.model.POSIdentityKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface POSIdentityMapper {
    int countByExample(POSIdentityExample example);

    int deleteByExample(POSIdentityExample example);

    int deleteByPrimaryKey(POSIdentityKey key);

    int insert(POSIdentity record);

    int insertSelective(POSIdentity record);

    List<POSIdentity> selectByExample(POSIdentityExample example);

    POSIdentity selectByPrimaryKey(POSIdentityKey key);

    int updateByExampleSelective(@Param("record") POSIdentity record, @Param("example") POSIdentityExample example);

    int updateByExample(@Param("record") POSIdentity record, @Param("example") POSIdentityExample example);

    int updateByPrimaryKeySelective(POSIdentity record);

    int updateByPrimaryKey(POSIdentity record);
}