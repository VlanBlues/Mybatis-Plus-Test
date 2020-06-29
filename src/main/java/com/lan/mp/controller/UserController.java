package com.lan.mp.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lan.mp.entity.User;
import com.lan.mp.service.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.sql.Wrapper;
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
@RequestMapping("/user/")
public class UserController {
    @Resource
    private IUserService userService;
    @RequestMapping("all")
    public List<User> getAllUser(){
        return userService.list();
    }

    @RequestMapping("byState")
    public List<User> getUserByState(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("state","0");
        return userService.list(queryWrapper);
    }
}
