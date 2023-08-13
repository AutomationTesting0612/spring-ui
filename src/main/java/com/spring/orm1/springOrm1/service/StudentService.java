package com.spring.orm1.springOrm1.service;

import com.spring.orm1.springOrm1.entity.Student;
import com.spring.orm1.springOrm1.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student addStudent(Student student) {

      return studentRepository.save(student);

    }

    public List<Student> getAllStudent() {

        return studentRepository.findAll();

    }

    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }
}
