package com.service;

import com.annotation.ChooseDataSource;
import com.mapper.StudentMapper;
import com.mapper.UserMapper;
import com.model.Student;
import com.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional(transactionManager = "transactionManager1")
public class UserService {
    @Autowired
    UserMapper userMapper;

    @ChooseDataSource("dataSource1")
    public User selectByUserId(Integer id) {
        return userMapper.selectById(id);
    }
}
