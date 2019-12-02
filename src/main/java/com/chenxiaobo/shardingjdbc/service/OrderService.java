package com.chenxiaobo.shardingjdbc.service;

import org.apache.ibatis.annotations.Param;

/**
 * @Title: OrderService
 * @Description: TODO
 * @Author <a href="mailto:chenxb1993@126.com">陈晓博</a>
 * @Date 2019-12-02 21:41
 * @Version V1.0
 */
public interface OrderService {

    int save(Long orderId , Long goodsId);

}