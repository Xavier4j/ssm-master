package com.dzw.service.impl;

import com.dzw.service.UserService;
import com.dzw.dao.UserDao;
import com.dzw.pojo.Boss;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceimpl implements UserService {


    @Resource
    private UserDao userDao;

    @Override
    public Boolean updateUserinfo(Boss boss) {

        return userDao.update(boss) > 0;
    }

    @Override
    public Boolean deletUser(Boss boss) {

        return userDao.delete(boss) > 0;
    }
}
