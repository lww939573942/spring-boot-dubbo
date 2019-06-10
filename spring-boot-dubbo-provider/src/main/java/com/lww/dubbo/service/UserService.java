package com.lww.dubbo.service;


import com.lww.dubbo.entity.User;

/**
 * @author lww
 */
public interface UserService {
    User findUserById(Long id);
}
