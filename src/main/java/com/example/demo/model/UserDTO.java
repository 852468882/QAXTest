package com.example.demo.model;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@ExcelIgnoreUnannotated
@ColumnWidth(11)
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    @ExcelProperty(index = 0,value = "编号")
    private Long id;
    @ExcelProperty(index = 1,value = "姓名")
    private String name;
    @ExcelProperty(index = 2,value = "年龄")
    private Integer age;
    @ExcelProperty(index = 3,value = "性别")
    private String sex;
    @ExcelProperty(index = 4,value = "出生日期")
    @ColumnWidth(19)
    //@DateTimeFormat(value = "yyyy-MM-dd HH-mm-ss")
    private Date birthday;
    @ExcelIgnore
    private Boolean isDeleted;
}