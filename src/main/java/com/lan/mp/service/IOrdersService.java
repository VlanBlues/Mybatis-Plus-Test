package com.lan.mp.service;

import com.lan.mp.entity.Orders;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lan
 * @since 2020-05-29
 */
public interface IOrdersService extends IService<Orders> {
    List<Orders> selectAllOrders();
}
