package com.service.impl;

import com.dao.UserMapper;
import com.model.User;
import com.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private UserMapper userDao;

    public User selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }
}
