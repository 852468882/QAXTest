package com.example.demo.controller;

import com.alibaba.excel.read.metadata.ReadSheet;
import com.example.demo.model.BudgetAdjustApproveDTO;
import com.example.demo.model.UserDTO;
import com.example.demo.util.excel.EasyExcelUtil;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@Api(tags = "测试用Controller")
public class TestContorller {

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    @ApiOperation(value = "测试方法", notes = "方法备注", httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "budgetAdjustApproveDTO", value = "对象", dataType = "BudgetAdjustApproveDTO", required = true),
            @ApiImplicitParam(name = "loginId", value = "登录ID",paramType = "header", required = true)
    })
    @ApiResponses({
            @ApiResponse(code = 404, message = "路径不对")
    })
    public String testMethod(@RequestBody BudgetAdjustApproveDTO budgetAdjustApproveDTO, @RequestHeader String loginId){
        return "hello";
    }

    @RequestMapping(value = "/export", method = RequestMethod.GET)
    public void export(HttpServletResponse response, HttpServletRequest request){
        UserDTO userDTO1 = new UserDTO(1L,"name1",20,"m",new Date(),false);
        UserDTO userDTO2 = new UserDTO(2L,"name2",20,"f",new Date(),false);
        List<UserDTO> list = new ArrayList<>();
        list.add(userDTO1);
        list.add(userDTO2);

        EasyExcelUtil.writerExcel("11",response,request,list,UserDTO.class);
    }

    @RequestMapping(value = "/import", method = RequestMethod.POST)
    public void importExcel(MultipartFile excel) throws Exception {
        /*ArrayList<UserDTO> userList = EasyExcelUtil.readerExcel(excel, UserDTO.class);
        userList.forEach(userDTO -> System.out.println(userDTO));*/

        /*List<Integer> nums = new ArrayList<>();
        nums.add(0);
        ArrayList<UserDTO> userList2 = EasyExcelUtil.readExcelWithSheets(excel,nums,UserDTO.class);
        userList2.forEach(userDTO -> System.out.println(userDTO));*/

        List<ReadSheet> readSheets = new ArrayList<>();
        ReadSheet readSheet1 = new ReadSheet();
        readSheet1.setSheetNo(0);                   //第一个sheet
        readSheet1.setAutoTrim(true);
        readSheet1.setHeadRowNumber(1);             //从第2行开始读取

        ReadSheet readSheet2 = new ReadSheet();
        readSheet2.setSheetNo(1);                   //第二个sheet
        readSheet2.setAutoTrim(true);
        readSheet2.setHeadRowNumber(3);             //从第4行开始读取

        readSheets.add(readSheet1);
        readSheets.add(readSheet2);

        ArrayList<UserDTO> userList3 = EasyExcelUtil.readExcelWithCustomSheet(excel, readSheets, UserDTO.class);
        userList3.forEach(userDTO -> System.out.println(userDTO));
    }
}
