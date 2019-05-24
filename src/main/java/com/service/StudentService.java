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
@Transactional(transactionManager = "transactionManager2")
public class StudentService {
    @Autowired
    StudentMapper studentMapper;
    @ChooseDataSource("dataSource2")
    public Student selectByStudentId(Integer id) {
        return studentMapper.selectById(id);
    }

}
