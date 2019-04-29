package com.controller;

import com.github.pagehelper.PageInfo;
import com.model.IMSOQ;
import com.model.POSIdentity;
import com.service.IIMOrderService;
import com.service.IIMSOQService;
import com.service.IPOSIdentityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author chenqi
 * @desc
 * @since 2019-04-28 15:46
 */
@Controller
@RequestMapping("/order")
public class OrderController {
    @Resource
    private IIMSOQService iimSOQService;
    @Resource
    private IIMOrderService iimOrderService;
    @Resource
    private IPOSIdentityService iposIdentityService;



    @RequestMapping("imSOQ")
    public String selectIMSOQ(Model model,@RequestParam(value="pn",defaultValue="1")Integer pn){
        PageInfo<IMSOQ> page = iimSOQService.selectIMSOQ(pn);
        model.addAttribute("pageInfo", page);
        return "IMSOQMain";
    }

    @RequestMapping("selectIMOrder")
    public String selectIMOrder(Model model){
        List list  = new ArrayList();
        list.add(10000001);
        list.add(10000002);
        list.add(10000003);
        List<POSIdentity> posIdentityList = iposIdentityService.selectPOSIdentity(list);
        model.addAttribute("list",posIdentityList);
        return "IMOrderSecond";
    }

    @RequestMapping("addIMOrder")
    public String addIMOrder(){
        return "IMOrderFirst";
    }


}
