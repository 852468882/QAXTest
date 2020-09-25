package com.example.demo.filter;

import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.IOException;

@Order(1) //过滤器的顺序，假设我们有多个过滤器，这个注解就是规定过滤器的顺序。
@WebFilter(urlPatterns = "/*",filterName = "Tfilter")
public class Tfilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //filter对象只会创建一次，init方法也只会执行一次。
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        RequestWrapper requestWrapper = new RequestWrapper((HttpServletRequest) request);
        System.out.println("过滤器开始过滤请求");
        chain.doFilter(requestWrapper,response);
        response.setCharacterEncoding("UTF-8");
    }

    @Override
    public void destroy() {
        //在销毁Filter时自动调用(程序关闭或者主动销毁Filter)。
    }
}
