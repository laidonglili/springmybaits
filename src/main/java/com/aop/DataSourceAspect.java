package com.aop;


import com.annotation.ChooseDataSource;
import com.datasource.DynamicDataSourceHolder;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class DataSourceAspect {

    @Pointcut("@annotation(com.annotation.ChooseDataSource)")
    public void pointcut() {

    }

    @Around("pointcut()")
    public Object switchDataSource(ProceedingJoinPoint joinPoint) throws Throwable {
        Object target = joinPoint.getTarget();
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = target.getClass().getDeclaredMethod(signature.getName(), signature.getParameterTypes());
        ChooseDataSource chooseDataSource=method.getAnnotation(ChooseDataSource.class);
        DynamicDataSourceHolder.putDataSourceName(chooseDataSource.value());
        Object result=joinPoint.proceed();
        DynamicDataSourceHolder.restoreDefaultDataSource();
        return result;
    }
}
