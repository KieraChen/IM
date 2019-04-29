package com.service.impl;

import com.dao.IMMovementMapper;
import com.github.pagehelper.PageInfo;
import com.model.IMMovement;
import com.model.IMMovementExample;
import com.service.IIMMovemntService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author chenqi
 * @desc
 * @since 2019-04-28 11:11
 */
@Service("imMovementService")
public class IMMovementServiceImpl implements IIMMovemntService {
    @Resource
    private IMMovementMapper imMovementMapper;

    public List<IMMovement> selectIMMovement(){
        IMMovementExample imMovementExample = new IMMovementExample();
        imMovementExample.createCriteria().andLDocTypeBetween(1,2);
        List<IMMovement> imMovementList = imMovementMapper.selectByExample(imMovementExample);
        return imMovementList;
    }
}
