package com.lww.dubbo.entity;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author lww
 */
@Data
@Accessors(chain = true)
public class User implements Serializable {
    private long id;
    private String name;
    private int age;
    private int sex;
    private String address;

}
