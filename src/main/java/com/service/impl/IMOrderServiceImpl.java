package com.service.impl;

import com.dao.IMOrderMapper;
import com.service.IIMOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author chenqi
 * @desc
 * @since 2019-04-28 15:52
 */
@Service("imOrderService")
public class IMOrderServiceImpl implements IIMOrderService {

    @Resource
    private IMOrderMapper imOrderMapper;


}
