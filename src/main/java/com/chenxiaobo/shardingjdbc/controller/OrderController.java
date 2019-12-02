package com.chenxiaobo.shardingjdbc.controller;

import com.chenxiaobo.shardingjdbc.service.OrderService;
import com.sun.javafx.collections.MappingChange;
import lombok.extern.slf4j.Slf4j;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @Title: OrderController
 * @Description: TODO
 * @Author <a href="mailto:mailto:chenxb1993@126.com">陈晓博</a>
 * @Date 2019-12-02 21:40
 * @Version V1.0
 */
@Slf4j
@Api(tags = "OrderController", description = "功能")
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @ApiOperation(value = "")
    @PostMapping("/save")
    public Integer save(@RequestParam("orderId") Long orderId , @RequestParam("goodsId") Long goodsId){
        return orderService.save(orderId,goodsId);
    }
}
