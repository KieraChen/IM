package com.service.impl;

import com.dao.IMSOQMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.model.IMSOQ;
import com.model.IMSOQExample;
import com.service.IIMSOQService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author chenqi
 * @desc
 * @since 2019-04-28 15:52
 */
@Service("imSOQService")
public class IMSOQServiceImpl implements IIMSOQService {
    @Resource
    private IMSOQMapper imSOQMapper;


    public PageInfo<IMSOQ> selectIMSOQ(Integer pageNow){

        IMSOQExample imsoqExample = new IMSOQExample();
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");//设置日期格式
        String date = df.format(new Date());
        imsoqExample.createCriteria().andSzDateEqualTo(date);
        PageHelper.startPage(pageNow,10);
        List<IMSOQ> imsoqList = imSOQMapper.selectByExample(imsoqExample);
        PageInfo<IMSOQ> page = new PageInfo<IMSOQ>(imsoqList);
        return page;
    }
}
