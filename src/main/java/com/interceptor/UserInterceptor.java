package com.interceptor;


import com.alibaba.fastjson.JSON;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
public class UserInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println(request.getContentType());
        response.setContentType("application/json;charset=utf-8");
        PrintWriter writer=response.getWriter();
        Map<String,Object> res=new HashMap<>();
        res.put("code",0);
        res.put("msg","this request is intercepted");
        writer.write(JSON.toJSONString(res));
        Cookie cookie=new Cookie("token","123456");
        response.addCookie(cookie);

        return false;

    }
}
