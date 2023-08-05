package com.spring.orm1.springOrm1;

import com.spring.orm1.springOrm1.entity.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringOrm1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringOrm1Application.class, args);

		Student student = new Student();
		student.setAddress("test");

	}

}
