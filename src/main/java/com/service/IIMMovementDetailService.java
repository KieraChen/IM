package com.service;

import com.github.pagehelper.PageInfo;
import com.model.IMMovementDetail;

import java.util.List;

/**
 * @author chenqi
 * @desc
 * @since 2019-04-28 11:13
 */
public interface IIMMovementDetailService {
    public List<IMMovementDetail> selectIMMovementDetail(IMMovementDetail imMovementDetail);

    public PageInfo<IMMovementDetail> getIMMovementDetail(IMMovementDetail imMovementDetail, Integer pageNow);
}
