package com.service;

import com.model.POSIdentity;

import java.util.List;

/**
 * @author chenqi
 * @desc
 * @since 2019-04-28 22:13
 */
public interface IPOSIdentityService {
    public List<POSIdentity> selectPOSIdentity(List ids);
}
