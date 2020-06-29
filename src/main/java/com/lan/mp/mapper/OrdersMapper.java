package com.lan.mp.mapper;

import com.lan.mp.entity.Orders;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.core.annotation.Order;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lan
 * @since 2020-05-29
 */
public interface OrdersMapper extends BaseMapper<Orders> {
    List<Orders> selectAllOrders();
}
