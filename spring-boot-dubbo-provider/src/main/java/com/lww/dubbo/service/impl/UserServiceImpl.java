package com.lww.dubbo.service.impl;


import com.lww.dubbo.entity.User;
import com.lww.dubbo.service.UserService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author lww
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public User findUserById(Long id) {
        User user = new User();
        user.setId(System.currentTimeMillis());
        user.setAddress("广州市天河区棠下村");
        user.setName("lww");
        user.setSex(1);
        user.setAge(30);
        return user;
    }
}
