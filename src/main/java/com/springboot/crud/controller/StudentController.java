package com.springboot.crud.controller;

import com.springboot.crud.model.Student;
import com.springboot.crud.service.StudentServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RestController
public class StudentController {
    @Autowired
    StudentServiceImpl studentService;


    @GetMapping("/student")
    private List<Student> getAllStudent() {
        return studentService.getAllStudent();
    }


    @GetMapping("/student/{id}")
    private Student getStudent(@PathVariable("id") int id) {
        return studentService.getStudentById(id);
    }


    @DeleteMapping("/student/{id}")
    private void deleteStudent(@PathVariable("id") int id) {
        studentService.delete(id);
    }


    @PostMapping("/student")
    private Long saveStudent(@RequestBody Student student) {
        log.info("Enter saveStudent Method::::::::");
        studentService.saveOrUpdate(student);
        return student.getId();
    }
}
