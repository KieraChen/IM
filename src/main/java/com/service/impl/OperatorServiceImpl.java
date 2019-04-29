package com.service.impl;

import com.dao.OperatorMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
        operatorExample.createCriteria().andSzSignOnNameEqualTo(operator.getSzSignOnName()).andSzSignOnPasswordEqualTo(operator.getSzSignOnPassword());
        List<Operator> operatorList = operatorMapper.selectByExample(operatorExample);
        return operatorList;
    }

    //查询用户
    public PageInfo<Operator> selectOperator(Operator operator,Integer pageNow){
        OperatorExample operatorExample = new OperatorExample();
        if(operator.getSzSignOnName() != null && !"".equals(operator.getSzSignOnName())){
            String str = "%"+operator.getSzSignOnName()+"%";
            operatorExample.createCriteria().andSzSignOnNameLike(str);
        }
        PageHelper.startPage(pageNow,10);
        List<Operator> operatorList = operatorMapper.selectByExample(operatorExample);
        PageInfo<Operator> page = new PageInfo<Operator>(operatorList);
        return page;
    }

    public int deleteOperator(List<Integer> lOperatorIDs){
        int i = 0;
        if(lOperatorIDs.size() != 0){
            for (int id : lOperatorIDs) {
                i = operatorMapper.deleteByPrimaryKey(id);
            }
        }
        return i;
    }

}
