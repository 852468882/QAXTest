package com.example.demo.service.impl;

import com.example.demo.model.TestDTO;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Lazy
    @Autowired
    TestDTO testDTO;

    @Override
    public void sout() {
        //System.out.println("没使用Lazy注解");
        System.out.println("使用Lazy注解");
        System.out.println(testDTO.getCreateName());
    }
}
