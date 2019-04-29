package com.service.impl;

import com.dao.POSIdentityMapper;
import com.model.POSIdentity;
import com.model.POSIdentityExample;
import com.service.IPOSIdentityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.security.PrivateKey;
import java.util.List;

/**
 * @author chenqi
 * @desc
 * @since 2019-04-28 22:14
 */
@Service("posIdentityService")
public class POSIdentityServiceImpl implements IPOSIdentityService {
    @Resource
    private POSIdentityMapper posIdentityMapper;

    public List<POSIdentity> selectPOSIdentity(List ids){
        POSIdentityExample posIdentityExample = new POSIdentityExample();
        posIdentityExample.createCriteria().andSzPOSItemIDIn(ids);
        List<POSIdentity> posIdentityList = posIdentityMapper.selectByExample(posIdentityExample);
        return posIdentityList;
    }

}
