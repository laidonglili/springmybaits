package com;

import com.alibaba.fastjson.JSON;
import com.model.Company;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Test {

    private static final Logger logger = Logger.getLogger("com.Test");

    public static void main(String[] args) {
//        ApplicationContext cxt = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
//        StudentService studentService = cxt.getBean(StudentService.class);
//        UserService userService = cxt.getBean(UserService.class);
//        Student student = studentService.selectByStudentId(3);
//        User user = userService.selectByUserId(1);
//        System.out.println(student + "" + user);
//        Map<String, Object> map = new HashMap<>();
//        map.put("username", "laidong");
//        map.put("password", "dong!1996");
//        String mapJoin = Joiner.on("&").withKeyValueSeparator("=").join(map);
//        System.out.println(mapJoin);
//        Company company = new Company();
//        company.setName("21CN");
//        company.setType(1);
//        company.setBirth(new Date());
//        System.out.println(JSON.toJSONString(company));
//        try {
//            Path path=Paths.get("D:","dl-ip.txt");
//            List<String> list=Files.readAllLines(path);
//            System.out.println(list);
//        } catch ( IOException e) {
//            e.printStackTrace();
//        }

//        logger.log(Level.WARNING, "hello world!");
//        logger.log(Level.INFO, "hello world!");
//        logger.log(Level.OFF,"hello world!");
//        logger.log(Level.SEVERE,"hello world!");
         Thread.dumpStack();
         Runtime time=Runtime.getRuntime();
        System.out.println(time.totalMemory()/1024/1024);
    }
}
