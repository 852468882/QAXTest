package com.example.demo;

import com.example.demo.model.MapKeyDTO;
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
        invalidStaffList.add("1");
        invalidStaffList.add("2");
        invalidStaffList.add("3");
        invalidStaffList.add("4");
        invalidStaffList.add("5");
        invalidStaffList.add("6");
        invalidStaffList.forEach(i -> {
            if (i.equals("3"))
                return;
            System.out.println(i);
        });
    }

    @Test
    public void t5(){
        MapKeyDTO u1 = new MapKeyDTO();
        u1.setName("name");
        u1.setSex("M");

        MapKeyDTO u2 = new MapKeyDTO();
        u2.setName("name");
        u2.setSex("M");

        Map<MapKeyDTO, String> map = new HashMap<>();
        map.put(u1,"第一个");
        map.put(u2,"第二个");
        System.out.println(map);
        System.out.println(map.containsKey(u2));
    }

    @Test
    public void t6(){
        MapKeyDTO m1 = new MapKeyDTO();
        m1.setName("name");
        m1.setSex("M");

        MapKeyDTO m2 = new MapKeyDTO();
        m2.setName("name");
        m2.setSex("M");

        System.out.println(m1 == m2);
        System.out.println(m1.equals(m2));
        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());
    }
}
