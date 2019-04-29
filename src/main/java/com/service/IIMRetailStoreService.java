package com.service;

import com.github.pagehelper.PageInfo;
import com.model.IMRetailStore;

/**
 * @author chenqi
 * @desc
 * @since 2019-04-27 15:14
 */
public interface IIMRetailStoreService {
    public PageInfo<IMRetailStore> selectStore(IMRetailStore imRetailStore, Integer pageNow);
}
