package com.controller;

import com.github.pagehelper.PageInfo;
import com.model.IMRetailStore;
import com.service.IIMRetailStoreService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * @author chenqi
 * @desc
 * @since 2019-04-27 15:08
 */
@Controller
@RequestMapping("/store")
public class IMRetailStoreController {

    @Resource
    private IIMRetailStoreService storeService;

    //门店管理
    @RequestMapping("selectStore")
    public String selectStore(Model model, IMRetailStore store, @RequestParam(value="pn",defaultValue="1")Integer pn){

        PageInfo<IMRetailStore> page = storeService.selectStore(store,pn);

        model.addAttribute("pageInfo", page);
        model.addAttribute("store",store);
        return "StoreMain";
    }

    //添加门店
    @RequestMapping("addStore")
    public String addStore(){
        return "AddStore";
    }

    //编辑门店
    @RequestMapping("editStore")
    public String editStore(){
        return "EditStore";
    }
}
