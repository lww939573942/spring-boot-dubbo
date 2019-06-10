package com.lww.dubbo.service;

import com.lww.dubbo.entity.User;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/**
 * @author lww
 */
@Component
public class UserConsumerService {
    @Reference
    UserService userService;

    public User findUserById(Long id) {
        return userService.findUserById(id);
    }
}
