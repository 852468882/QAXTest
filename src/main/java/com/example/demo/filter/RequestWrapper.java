package com.example.demo.filter;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.io.IOUtils;

import javax.servlet.ReadListener;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Map;

public class RequestWrapper extends HttpServletRequestWrapper {

    /**
     * Constructs a request object wrapping the given request.
     *
     * @param request The request to wrap
     * @throws IllegalArgumentException if the request is null
     */
    public RequestWrapper(HttpServletRequest request) {
        super(request);
        Map<String, String[]> parameterMap = request.getParameterMap();
        System.out.println(JSONObject.toJSONString(parameterMap));
    }

    /**
     * 对于请求参数是K=V格式的通过HttpServletRequest.getParameterMap就可以直接获取。
     * 但是对于JSON格式的参数，我们需要从request的inputStream中读取。
     */
    @Override
    public ServletInputStream getInputStream() throws IOException {
        ServletInputStream inputStream = super.getInputStream();
        //获取JSON字符串
        String s = IOUtils.toString(inputStream, "UTF-8");
        //操作


        //返回
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(s.getBytes("UTF-8"));
        return new RequestCachingInputStream(byteArrayInputStream);
    }

}
