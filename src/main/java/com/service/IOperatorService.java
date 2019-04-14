package com.service;

import com.github.pagehelper.PageInfo;
import com.model.Operator;

import java.util.List;

/**
 * @author chenqi
 * @desc
 * @since 2019-03-31 15:48
 */
public interface IOperatorService {
    public List<Operator> checkOperator(Operator operator);

    public PageInfo<Operator> selectOperator(Operator operator, Integer pageNow);

    public int deleteOperator(List<Integer> lOperatorIDs);
}
