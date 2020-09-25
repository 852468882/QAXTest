package com.example.demo.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
public class User {
    private Long id;
    private String name;
    private String nickName;
    private Integer age;
    private String sex;
    private Date birthday;
}
