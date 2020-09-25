package com.example.demo.util.excel;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import lombok.Data;

import java.util.ArrayList;
import java.util.Map;

/**
 * 监听器，每解析一行会回调invoke方法；
 * 整个excel解析结束会执行doAfterAllAnalysed方法
 * @param <T>
 */
@Data
public class GeneralExcelListener<T> extends AnalysisEventListener<T> {

    private ArrayList<T> datas = new ArrayList<>();

    private Map<Integer, String> headMap;

    /**
     * 读取表头信息
     * @param headMap 表头信息
     * @param context
     */
    @Override
    public void invokeHeadMap(Map<Integer, String> headMap, AnalysisContext context) {
        this.headMap = headMap;
    }

    /**
     * 一行一行去读取excle内容
     * @param data  当前行数据
     */
    @Override
    public void invoke(T data, AnalysisContext context) {
        datas.add(data);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {

    }


}