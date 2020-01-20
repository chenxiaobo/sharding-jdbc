package com.chenxiaobo.shardingjdbc;

import com.chenxiaobo.shardingjdbc.dao.OrderDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * @Title: OrderDaoTest
 * @Description: TODO
 * @Author <a href="mailto:chenxb1993@126.com">陈晓博</a>
 * @Date 2019-12-02 21:30
 * @Version V1.0
 */
@SpringBootTest(classes = ShardingJdbcApplication.class)
@RunWith(SpringRunner.class)
public class OrderDaoTest {

    @Autowired
    private OrderDao orderDao;


    @Test
    public void testInsert(){

        orderDao.save(1232413429L,1233243L,new Date());

    }


}
