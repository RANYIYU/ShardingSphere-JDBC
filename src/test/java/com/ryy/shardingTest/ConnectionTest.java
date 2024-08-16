package com.ryy.shardingTest;

import com.ryy.domain.Dish;
import com.ryy.domain.Order;
import com.ryy.domain.OrderDetail;
import com.ryy.domain.Testbroadcast;
import com.ryy.service.OrderDetailService;
import com.ryy.service.OrderService;
import com.ryy.service.TestbroadcastService;
import com.ryy.service.impl.DishServiceImpl;
import com.ryy.service.impl.TestbroadcastServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.LongStream;


@SpringBootTest
public class ConnectionTest {

    @Autowired
    private DishServiceImpl dishService;
    @Autowired
    private TestbroadcastServiceImpl testbroadcastService;
    @Autowired
    private OrderService orderService;
    @Autowired
    private OrderDetailService orderDetailService;

    @Test
    void testConnection() {
        dishService.list();
    }

    @Test
    void testInsert() {
        // 添加10个数据
        List<Dish> dishes = new ArrayList<>();
        LongStream.range(0, 10).forEach(i -> dishes.add(new Dish().setName("测试" + i)));
        // 分片规则：id % 2
        dishService.saveBatch(dishes);
    }

    @Test
    void testInsertBroadcast() {
        // 添加10个数据
        List<Testbroadcast> broadcasts = new ArrayList<>();
        LongStream.range(0, 10).forEach(i -> broadcasts.add(new Testbroadcast().setName("都插入数据" + i)));
        testbroadcastService.saveBatch(broadcasts);
    }

    @Test
    void testBindingTable() {
        // 添加一笔订单
        Order order = new Order().setName("我是订单");
        orderService.save(order);
         order.getId();
        // 订单具有10个订单详情
        LongStream.range(0, 10).forEach(i -> orderDetailService.save(
                new OrderDetail().setOrderId(order.getId()).setName("我是订单详情" + i)));
    }

    @Test
    void testSelectBindingTable() {
        // 查询 1824504617480785922 这笔订单

    }

    @Test
    void testSelect() {
        dishService.save(new Dish().setId(1L).setName("测试"));
    }
}
