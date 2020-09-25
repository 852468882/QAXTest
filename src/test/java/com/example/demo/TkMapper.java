package com.example.demo;

import com.example.demo.entity.UserTableEntity;
import com.example.demo.mapper.UserTableMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TkMapper {

    @Resource
    UserTableMapper userTableMapper;


    @Test
    public void Select(){
        UserTableEntity userTableEntity = new UserTableEntity();

    }

}
