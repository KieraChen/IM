package com.service;

import com.model.IMStockTake;

import java.util.List;

/**
 * @author chenqi
 * @desc
 * @since 2019-04-29 23:25
 */
public interface IIMStockTakeService {
    public List<IMStockTake> getStockTakeList();
}
