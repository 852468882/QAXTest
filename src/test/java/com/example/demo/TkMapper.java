package com.example.demo;

import com.example.demo.entity.BcAdvanceWarning;
import com.example.demo.mapper.BcAdvanceWarningMapper;
import com.example.demo.mapper.UserTableMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TkMapper {

    @Resource
    UserTableMapper userTableMapper;
    @Resource
    BcAdvanceWarningMapper bcAdvanceWarningMapper;


    @Test
    public void Select(){
        BcAdvanceWarning bcAdvanceWarning = new BcAdvanceWarning();
        bcAdvanceWarning.setBudgetTypeCode("project");
        bcAdvanceWarning.setBudgetSubjectCode("");
        List<BcAdvanceWarning> select = bcAdvanceWarningMapper.select(bcAdvanceWarning);
        System.out.println(select);

    }

}
