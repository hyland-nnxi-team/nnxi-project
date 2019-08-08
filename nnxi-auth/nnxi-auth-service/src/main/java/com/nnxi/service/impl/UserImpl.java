package com.nnxi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nnxi.mapper.UserMapper;
import com.nnxi.model.User;
import com.nnxi.service.IUserService;
//import org.apache.dubbo.config.annotation.Service;
//
//@Service(interfaceClass = IUserService.class)
public class UserImpl extends ServiceImpl<UserMapper, User> implements IUserService {
}
