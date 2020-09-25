package com.example.demo;

import com.example.demo.entity.User;
import com.example.demo.model.UserDTO;
import com.example.demo.util.DtoEntityUtil;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class DozerTest {

    @Test
    public void simpleClass(){
        UserDTO userDTO = new UserDTO();
        userDTO.setId(1L);
        userDTO.setName("jiangwen");
        userDTO.setAge(18);
        userDTO.setSex("male");
        userDTO.setBirthday(new Date());
        userDTO.setIsDeleted(false);

        User user = DtoEntityUtil.trans(userDTO, User.class);
        System.out.println(user.toString());


    }

}
