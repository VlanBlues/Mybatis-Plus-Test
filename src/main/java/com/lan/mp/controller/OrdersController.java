package com.lan.mp.controller;


import com.lan.mp.entity.Orders;
import com.lan.mp.service.IOrdersService;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lan
 * @since 2020-05-29
 */
@RestController
@RequestMapping("/orders")
public class OrdersController {
    @Resource
    private IOrdersService ordersService;
    
    @RequestMapping("/all")
    public List<Orders> selectAllOrders(){
        return ordersService.selectAllOrders();
    } 
}
