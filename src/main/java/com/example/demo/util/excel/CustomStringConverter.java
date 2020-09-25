package com.example.demo.util.excel;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;

public class CustomStringConverter implements Converter<String> {

    /**
     * java中的数据格式
     */
    @Override
    public Class supportJavaTypeKey() {
        return String.class;
    }

    /**
     * Excel中的数据格式
     */
    @Override
    public CellDataTypeEnum supportExcelTypeKey() {
        return CellDataTypeEnum.STRING;
    }

    /**
     * 这里读的时候会调用
     */
    @Override
    public String convertToJavaData(CellData cellData, ExcelContentProperty contentProperty, GlobalConfiguration globalConfiguration) throws Exception {
        return "自定义的字符：" + cellData.getStringValue();
    }

    /**
     * 这里是写的时候会调用
     */
    @Override
    public CellData convertToExcelData(String value, ExcelContentProperty contentProperty, GlobalConfiguration globalConfiguration) throws Exception {
        return new CellData("自定义的字符：" + value);
    }
}
