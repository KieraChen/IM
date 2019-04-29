package com.service.impl;

import com.dao.IMMovementDetailMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.model.IMMovementDetail;
import com.model.IMMovementDetailExample;
import com.service.IIMMovementDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author chenqi
 * @desc
 * @since 2019-04-28 11:13
 */
@Service("imMovementDetailService")
public class IMMovementDetailServiceImpl implements IIMMovementDetailService {
    @Resource
    private IMMovementDetailMapper imMovementDetailMapper;

//    //查询用户
//    public PageInfo<Operator> selectOperator(Operator operator,Integer pageNow){
//        OperatorExample operatorExample = new OperatorExample();
//        if(operator.getSzSignOnName() != null && !"".equals(operator.getSzSignOnName())){
//            String str = "%"+operator.getSzSignOnName()+"%";
//            operatorExample.createCriteria().andSzSignOnNameLike(str);
//        }
//        PageHelper.startPage(pageNow,10);
//        List<Operator> operatorList = operatorMapper.selectByExample(operatorExample);
//        PageInfo<Operator> page = new PageInfo<Operator>(operatorList);
//        return page;
//    }

    public List<IMMovementDetail> selectIMMovementDetail(IMMovementDetail imMovementDetail){
        IMMovementDetailExample imMovementDetailExample = new IMMovementDetailExample();
        IMMovementDetailExample.Criteria criteria =  imMovementDetailExample.createCriteria();
        criteria.andLDocTypeBetween(1,2);
        if(imMovementDetail.getSzDocumentNmbr() != null && !"".equals(imMovementDetail.getSzDocumentNmbr())){
            criteria.andSzDocumentNmbrEqualTo(imMovementDetail.getSzDocumentNmbr());
        }
        List<IMMovementDetail> imMovementDetailList = imMovementDetailMapper.selectByExample(imMovementDetailExample);
        return imMovementDetailList;
    }

    public PageInfo<IMMovementDetail> getIMMovementDetail(IMMovementDetail imMovementDetail,Integer pageNow){
        IMMovementDetailExample imMovementDetailExample = new IMMovementDetailExample();
        IMMovementDetailExample.Criteria criteria =  imMovementDetailExample.createCriteria();
        if(imMovementDetail.getlDocType() != null && !"".equals(imMovementDetail.getlDocType())){
            criteria.andLDocTypeEqualTo(imMovementDetail.getlDocType());
        }
        if(imMovementDetail.getSzDocumentNmbr() != null && !"".equals(imMovementDetail.getSzDocumentNmbr())){
            criteria.andSzDocumentNmbrEqualTo(imMovementDetail.getSzDocumentNmbr());
        }
        if(imMovementDetail.getSzPOSItemID() != null && !"".equals(imMovementDetail.getSzPOSItemID())){
            criteria.andSzPOSItemIDEqualTo(imMovementDetail.getSzPOSItemID());
        }
        PageHelper.startPage(pageNow,10);
        List<IMMovementDetail> imMovementDetailList = imMovementDetailMapper.selectByExample(imMovementDetailExample);
        PageInfo<IMMovementDetail> page = new PageInfo<IMMovementDetail>(imMovementDetailList);
        return  page;
    }

}
