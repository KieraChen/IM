package com.controller;

import com.github.pagehelper.PageInfo;
import com.model.IMMovementDetail;
import com.model.POSIdentity;
import com.service.IIMMovementDetailService;
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
 * @since 2019-04-29 10:34
 */

@Controller
@RequestMapping("/transfer")
public class TransferController {

    @Resource
    private IPOSIdentityService iposIdentityService;
    @Resource
    private IIMMovementDetailService iimMovementDetailService;

    @RequestMapping("transferFirst")
    public String transferFirst(){
        return "TransferFirst";
    }

    @RequestMapping("transferSecond")
    public String transferSecond(){
        return "TransferSecond";
    }

    @RequestMapping("transferThird")
    public String transferThird(Model model){
        List list  = new ArrayList();
        list.add(10000001);
        list.add(10000002);
        list.add(10000003);

        List<POSIdentity> posIdentityList = iposIdentityService.selectPOSIdentity(list);
        model.addAttribute("list",posIdentityList);
        return "TransferThird";
    }

    //调拨历史
    @RequestMapping("bTransfer")
    public String bTransfer(Model model, IMMovementDetail imMovementDetail, @RequestParam(value="pn",defaultValue="1")Integer pn){
        imMovementDetail.setlDocType(5);
        PageInfo<IMMovementDetail> imMovementDetailPageInfo = iimMovementDetailService.getIMMovementDetail(imMovementDetail,pn);
        model.addAttribute("pageInfo",imMovementDetailPageInfo);
        model.addAttribute("detail",imMovementDetail);
        return "BTransfer";
    }
}
