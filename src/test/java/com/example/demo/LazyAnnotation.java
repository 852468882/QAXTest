package com.example.demo;

import com.example.demo.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class LazyAnnotation {
    @Autowired
    TestService testService;

    @Test
    public void t1(){
        testService.sout();
    }
}