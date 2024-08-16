package com.ryy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ryy.domain.Order;
import com.ryy.service.OrderService;
import com.ryy.mapper.OrderMapper;
import org.springframework.stereotype.Service;

/**
* @author 17031
* @description 针对表【order】的数据库操作Service实现
* @createDate 2024-08-16 22:02:27
*/
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order>
    implements OrderService{

}




