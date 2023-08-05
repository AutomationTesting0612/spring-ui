package com.spring.orm1.springOrm1.controller;


import com.spring.orm1.springOrm1.entity.Student;
import com.spring.orm1.springOrm1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public String getStudents(Model model){
        model.addAttribute("students", studentService.getAllStudent());
        return "students";
    }

    @GetMapping("/students/new")
    public String createStudent(Model model){
        Student student= new Student();
        model.addAttribute("student", student);
        return "create_student";
    }

    @PostMapping("/students")
    public String add(@ModelAttribute("student") Student student){
       studentService.addStudent(student);
       return "redirect:/students";

    }

    @PutMapping("/students")
    public String update(@ModelAttribute("student") Student student){
        studentService.addStudent(student);
        return "redirect:/students";

    }

    @DeleteMapping("/students")
    public String delete(@ModelAttribute("student") Student student){
        studentService.addStudent(student);
        return "redirect:/students";

    }

//    @GetMapping("/students/edit/{id}")
//    public String editStudentForm(@PathVariable Long id, Model model) {
//        model.addAttribute("student", studentService.getStudentById(id));
//        return "edit_student";
//    }

//    @PostMapping("/students/{id}")
//    public String updateStudent(@PathVariable Long id,
//                                @ModelAttribute("student") Student student,
//                                Model model) {
//
//        // get student from database by id
//        Student existingStudent = studentService.getStudentById(id);
//        existingStudent.setId(id);
//        existingStudent.setFirstName(student.getFirstName());
//        existingStudent.setLastName(student.getLastName());
//        existingStudent.setEmail(student.getEmail());
//
//        // save updated student object
//        studentService.updateStudent(existingStudent);
//        return "redirect:/students";
//    }

    // handler method to handle delete student request

//    @GetMapping("/students/{id}")
//    public String deleteStudent(@PathVariable Long id) {
//        studentService.(id);
//        return "redirect:/students";
//    }
}
