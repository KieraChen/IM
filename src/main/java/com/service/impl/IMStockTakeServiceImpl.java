package com.service.impl;

import com.dao.IMStockTakeMapper;
import com.model.IMStockTake;
import com.model.IMStockTakeExample;
import com.service.IIMStockTakeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author chenqi
 * @desc
 * @since 2019-04-29 23:12
 */
@Service("imStockTakeService")
public class IMStockTakeServiceImpl implements IIMStockTakeService {
    @Resource
    private IMStockTakeMapper imStockTakeMapper;

    public List<IMStockTake> getStockTakeList(){
        IMStockTakeExample imStockTakeExample = new IMStockTakeExample();
        imStockTakeExample.createCriteria().andSzDocumentNmbrLike("GP0801004%");
        List<IMStockTake> imStockTakeList = imStockTakeMapper.selectByExample(imStockTakeExample);
        return imStockTakeList;
    }
}
