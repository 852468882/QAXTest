package com.example.demo.aspect;

import com.alibaba.fastjson.JSONArray;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TestAspect {

    @Pointcut("@annotation(com.example.demo.annotation.MyAspect)")
    private void pointCut(){}

    @Around("pointCut()")
    private Object testAop(ProceedingJoinPoint point) throws Throwable {
        System.out.println("======AopAspectJ执行环绕通知开始=========");
        Object obj = point.proceed();
        Object[] args = point.getArgs();
        //方法名
        String methodName = point.getSignature().getName();
        //对象
        Object target = point.getTarget();
        //类名
        String className = target.getClass().getName();
        System.out.println("类："+className+"；方法："+methodName+"；参数："+ JSONArray.toJSONString(args));
        System.out.println("======AopAspectJ执行环绕通知结束=========");
        return obj;
    }
}
