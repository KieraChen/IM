package com.service.impl;

import com.dao.IMStockTakeDetailMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.model.IMStockTakeDetail;
import com.model.IMStockTakeDetailExample;
import com.service.IIMStockTakeDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author chenqi
 * @desc
 * @since 2019-04-29 23:12
 */
@Service("imStockTakeDetailService")
public class IMStockTakeDetailServiceImpl implements IIMStockTakeDetailService {
    @Resource
    private IMStockTakeDetailMapper imStockTakeDetailMapper;

    public List<IMStockTakeDetail> getIMStockDetailList(){
        IMStockTakeDetailExample imStockTakeDetailExample = new IMStockTakeDetailExample();
        imStockTakeDetailExample.createCriteria().andSzDocumentNmbrEqualTo("GP08010041");
        List<IMStockTakeDetail> imStockTakeDetailList = imStockTakeDetailMapper.selectByExample(imStockTakeDetailExample);
        return imStockTakeDetailList;
    }

    public PageInfo<IMStockTakeDetail> getIMStockTakeDetail(IMStockTakeDetail imStockTakeDetail,Integer pageNow){
        IMStockTakeDetailExample imStockTakeDetailExample = new IMStockTakeDetailExample();
        IMStockTakeDetailExample.Criteria criteria = imStockTakeDetailExample.createCriteria();
        if(imStockTakeDetail.getSzDocumentNmbr() != null && !"".equals(imStockTakeDetail.getSzDocumentNmbr())){
            criteria.andSzDocumentNmbrEqualTo(imStockTakeDetail.getSzDocumentNmbr());
        }
        if(imStockTakeDetail.getSzPosItemID() != null && !"".equals(imStockTakeDetail.getSzPosItemID())){
            criteria.andSzPosItemIDEqualTo(imStockTakeDetail.getSzPosItemID());
        }
        PageHelper.startPage(pageNow,10);
        List<IMStockTakeDetail> imStockTakeDetailList = imStockTakeDetailMapper.selectByExample(imStockTakeDetailExample);
        PageInfo<IMStockTakeDetail> page  = new PageInfo<IMStockTakeDetail>(imStockTakeDetailList);
        return page;
    }

}

