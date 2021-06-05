package com.springboot.crud.service;

import com.springboot.crud.model.Student;

import java.util.List;

public interface StudentService {

    public List<Student> getAllStudent();

    public Student getStudentById(int id);

    public void saveOrUpdate(Student student);

    public void delete(int id);

}
