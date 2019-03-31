package com.service.impl;

import com.dao.OperatorMapper;
import com.model.Operator;
import com.model.OperatorExample;
import com.service.IOperatorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author chenqi
 * @desc
 * @since 2019-03-31 15:48
 */
@Service("operatorService")
public class OperatorServiceImpl implements IOperatorService {
    @Resource
    private OperatorMapper operatorMapper;

    public List<Operator> checkOperator(Operator operator){
        OperatorExample operatorExample = new OperatorExample();
        operatorExample.createCriteria().andSzsignonnameEqualTo(operator.getSzsignonname()).andSzsignonpasswordEqualTo(operator.getSzsignonpassword());
        List<Operator> operatorList = operatorMapper.selectByExample(operatorExample);
        return operatorList;
    }

}
