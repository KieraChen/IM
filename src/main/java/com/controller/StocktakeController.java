package com.controller;

import com.github.pagehelper.PageInfo;
import com.model.IMStockTake;
import com.model.IMStockTakeDetail;
import com.service.IIMStockTakeDetailService;
import com.service.IIMStockTakeService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author chenqi
 * @desc
 * @since 2019-04-29 23:10
 */
@Controller
@RequestMapping("/stocktake")
public class StocktakeController {

    @Resource
    private IIMStockTakeService iimStockTakeService;
    @Resource
    private IIMStockTakeDetailService iimStockTakeDetailService;

    @RequestMapping("stocktakeFirst")
    public String stocktakeFirst(Model model){
        List<IMStockTake> imStockTakeList = iimStockTakeService.getStockTakeList();
        model.addAttribute("list",imStockTakeList);
        return "StocktakeFirst";

    }

    @RequestMapping("stocktakeSecond")
    public String stocktakeSecond(Model model){
        List<IMStockTakeDetail> imStockTakeDetailList = iimStockTakeDetailService.getIMStockDetailList();
        model.addAttribute("list",imStockTakeDetailList);
        return "StocktakeSecond";
    }

    @RequestMapping("bStocktake")
    public String bStocktake(Model model,IMStockTakeDetail imStockTakeDetail,@RequestParam(value="pn",defaultValue="1")Integer pn){
        PageInfo<IMStockTakeDetail> pageInfo = iimStockTakeDetailService.getIMStockTakeDetail(imStockTakeDetail,pn);
        model.addAttribute("detail",imStockTakeDetail);
        model.addAttribute("pageInfo",pageInfo);
        return "BStocktake";
    }





}
