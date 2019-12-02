package com.chenxiaobo.shardingjdbc.service.impl;

import com.chenxiaobo.shardingjdbc.dao.OrderDao;
import com.chenxiaobo.shardingjdbc.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * @Title: OrderServiceImpl
 * @Description: TODO
 * @Author <a href="mailto:mailto:chenxb1993@126.com">陈晓博</a>
 * @Date 2019-12-02 21:41
 * @Version V1.0
 */
@Slf4j
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public int save(Long orderId, Long goodsId) {
        return orderDao.save(orderId,goodsId,new Date());
    }
}