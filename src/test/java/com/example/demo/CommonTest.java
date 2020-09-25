package com.example.demo;

import com.example.demo.model.OneDTO;
import com.example.demo.model.TestDTO;
import lombok.SneakyThrows;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
public class CommonTest {

    @Test
    public void t1(){
        Map<String, String> map = new HashMap<>();
        Set<Map.Entry<String, String>> entries = map.entrySet();
    }

    @SneakyThrows
    @Test
    public void t2(){
        String s1 = "hello";
        String s2 = "你好";
        System.out.println(s1.length()+"..."+s1.getBytes().length);
        System.out.println(s2.length()+"..."+s2.getBytes("utf8").length);


    }

    @Test
    public void testIsEmpty(){
        String s3 = "";
        System.out.println();

        List<String> list = new ArrayList<>();
        System.out.println(list.size());
    }

    @Test
    public void testAOP(){
        OneDTO oneDTO = new OneDTO();
        oneDTO.sout();
    }

    @Test
    public void t3(){
        TestDTO testDTO = new TestDTO();
        List<String> strings = testDTO.getStrings();
        System.out.println(1);
    }

    @Test
    public void t4(){
        List<String> invalidStaffList = new ArrayList<>();
        /*invalidStaffList.add("1");
        invalidStaffList.add("2");*/
        System.out.println(invalidStaffList.toString());
    }

}
