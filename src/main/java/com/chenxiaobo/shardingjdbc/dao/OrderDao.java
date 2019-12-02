package com.chenxiaobo.shardingjdbc.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * @Title: OrderDao
 * @Description: OrderDao
 * @Author <a href="mailto:chenxb1993@126.com">陈晓博</a>
 * @Date 2019-12-02 21:26
 * @Version V1.0
 */
@Mapper
@Component
public interface OrderDao {

    int save(@Param("orderId") Long orderId , @Param("goodsId") Long goodsId, @Param("createTime") Date createTime);

}
