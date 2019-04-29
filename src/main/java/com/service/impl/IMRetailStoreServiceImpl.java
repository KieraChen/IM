package com.service.impl;

import com.dao.IMRetailStoreMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.model.IMRetailStore;
import com.model.IMRetailStoreExample;
import com.service.IIMRetailStoreService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author chenqi
 * @desc
 * @since 2019-04-27 15:15
 */
@Service("imRetailStoreService")
public class IMRetailStoreServiceImpl implements IIMRetailStoreService {
    @Resource
    private IMRetailStoreMapper imRetailStoreMapper;

    public PageInfo<IMRetailStore> selectStore(IMRetailStore imRetailStore,Integer pageNow){
        IMRetailStoreExample imRetailStoreExample = new IMRetailStoreExample();
        if(imRetailStore.getlRetailStoreLookUpID() != null && !"".equals(imRetailStore.getlRetailStoreLookUpID())){
            imRetailStoreExample.createCriteria().andLRetailStoreLookUpIDEqualTo(imRetailStore.getlRetailStoreLookUpID());
        }
        PageHelper.startPage(pageNow,10);
        List<IMRetailStore> imRetailStoreList = imRetailStoreMapper.selectByExample(imRetailStoreExample);
        PageInfo<IMRetailStore> page = new PageInfo<IMRetailStore>(imRetailStoreList);
        return page;
    }

}
