package com.lww.dubbo.controller;

import com.lww.dubbo.service.UserConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lww
 */
@RestController
public class UserController {

    @Autowired
    private UserConsumerService userConsumerService;


    @RequestMapping("/findUserById")
    public Object findUserById(Long id){

        return userConsumerService.findUserById(id);
    }
}
