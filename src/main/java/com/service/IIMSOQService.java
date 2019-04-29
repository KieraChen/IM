package com.service;

import com.github.pagehelper.PageInfo;
import com.model.IMSOQ;

/**
 * @author chenqi
 * @desc
 * @since 2019-04-28 15:51
 */
public interface IIMSOQService {
    public PageInfo<IMSOQ> selectIMSOQ(Integer pageNow);
}
