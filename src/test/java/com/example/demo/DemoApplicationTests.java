package com.example.demo;

import com.example.demo.model.OneDTO;
import com.example.demo.model.TestDTO;
import com.example.demo.model.TowDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DemoApplicationTests {

    @Autowired
    TestDTO testDTO;
    @Autowired
    OneDTO oneDTO;
    @Autowired
    TowDto towDTO;

    @Test
    public void contextLoads() {
        System.out.println(oneDTO.toString());
        System.out.println(towDTO.toString());
    }

    @Test
    public void t1(){
        System.out.println(testDTO.getCreateName());
    }

    @Test
    public void t2(){
        oneDTO.sout();
    }

    @Test
    public void t3(){
        System.out.println(towDTO.getName());
    }

    @Test
    public void t4(){

    }

}
