package com.lan.mp.service.impl;

import com.lan.mp.entity.User;
import com.lan.mp.mapper.UserMapper;
import com.lan.mp.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lan
 * @since 2020-05-29
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
