package com.spring.orm1.springOrm1.repository;

import com.spring.orm1.springOrm1.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
