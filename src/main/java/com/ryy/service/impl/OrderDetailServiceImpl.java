package com.ryy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ryy.domain.OrderDetail;
import com.ryy.service.OrderDetailService;
import com.ryy.mapper.OrderDetailMapper;
import org.springframework.stereotype.Service;

/**
* @author 17031
* @description 针对表【order_detail】的数据库操作Service实现
* @createDate 2024-08-16 22:02:34
*/
@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail>
    implements OrderDetailService{

}




