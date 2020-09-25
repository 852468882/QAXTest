package com.example.demo;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.function.Supplier;

@SpringBootTest
public class SupplierTest {

    @Test
    public void t1(){
        Supplier supplier = () -> {
            System.out.println("执行指定方法1");
            return null;
        };

        supplier.get();
        supplier.get();
        supplier.get();
    }

    @Test
    public void t2(){

    }
}
