package com.ryy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ryy.domain.Dish;
import com.ryy.service.DishService;
import com.ryy.mapper.DishMapper;
import org.springframework.stereotype.Service;

/**
* @author 17031
* @description 针对表【dish(菜品)】的数据库操作Service实现
* @createDate 2024-08-15 15:29:19
*/
@Service
public class DishServiceImpl extends ServiceImpl<DishMapper, Dish>
    implements DishService{

}




