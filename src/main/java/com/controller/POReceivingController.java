package com.controller;

import com.github.pagehelper.PageInfo;
import com.model.IMMovement;
import com.model.IMMovementDetail;
import com.service.IIMMovementDetailService;
import com.service.IIMMovemntService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author chenqi
 * @desc
 * @since 2019-04-28 11:08
 */
@Controller
@RequestMapping("/poReceiving")
public class POReceivingController {
    @Resource
    private IIMMovemntService iimMovemntService;
    @Resource
    private IIMMovementDetailService iimMovementDetailService;


    //收货单头
    @RequestMapping("poReceivingHeader")
    public  String selectPOReceivingHeader(Model model){
        List<IMMovement> imMovementList = iimMovemntService.selectIMMovement();
        model.addAttribute("list",imMovementList);
        return "POReceivingHeader";
    }
    //收货单详细
    @RequestMapping("poReceivingDetail")
    public  String selectPOReceivingDetail(Model model, IMMovementDetail imMovementDetail){
        List<IMMovementDetail> imMovementDetailList = iimMovementDetailService.selectIMMovementDetail(imMovementDetail);
        model.addAttribute("list",imMovementDetailList);
        return "POReceivingDetail";
    }

    //收货历史
    @RequestMapping("bPOReceiving")
    public String bPOReceiving(Model model, IMMovementDetail imMovementDetail, @RequestParam(value="pn",defaultValue="1")Integer pn){
        imMovementDetail.setlDocType(1);
        PageInfo<IMMovementDetail> imMovementDetailPageInfo = iimMovementDetailService.getIMMovementDetail(imMovementDetail,pn);
        model.addAttribute("pageInfo",imMovementDetailPageInfo);
        model.addAttribute("detail",imMovementDetail);
        return "BPOReceiving";
    }

}
