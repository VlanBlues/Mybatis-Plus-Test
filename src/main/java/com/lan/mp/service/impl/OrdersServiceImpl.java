package com.lan.mp.service.impl;

import com.lan.mp.entity.Orders;
import com.lan.mp.mapper.OrdersMapper;
import com.lan.mp.service.IOrdersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lan
 * @since 2020-05-29
 */
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements IOrdersService {

    @Resource
    private OrdersMapper ordersMapper;
    @Override
    public List<Orders> selectAllOrders() {
        return ordersMapper.selectAllOrders();
    }
}
