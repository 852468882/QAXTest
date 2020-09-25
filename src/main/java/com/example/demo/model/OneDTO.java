package com.example.demo.model;

import com.example.demo.annotation.MyAspect;
import org.springframework.stereotype.Component;

@Component("OD")
public class OneDTO {

    @MyAspect
    public void sout(){
        System.out.println("OneDTO");
    }
}
