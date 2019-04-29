package com.service;

import com.github.pagehelper.PageInfo;
import com.model.IMStockTakeDetail;

import java.util.List;

/**
 * @author chenqi
 * @desc
 * @since 2019-04-29 23:26
 */
public interface IIMStockTakeDetailService {
    public List<IMStockTakeDetail> getIMStockDetailList();

    public PageInfo<IMStockTakeDetail> getIMStockTakeDetail(IMStockTakeDetail imStockTakeDetail, Integer pageNow);
}
