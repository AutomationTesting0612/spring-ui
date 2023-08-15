package com.spring.orm1.springOrm1.service;


import com.spring.orm1.springOrm1.entity.Student;
import com.spring.orm1.springOrm1.entity.User;
import com.spring.orm1.springOrm1.repository.StudentRepository;
import com.spring.orm1.springOrm1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUser() {

        return userRepository.findAll();

    }
}
