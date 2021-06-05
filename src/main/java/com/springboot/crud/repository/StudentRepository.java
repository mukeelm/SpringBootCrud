package com.springboot.crud.repository;
import org.springframework.data.repository.CrudRepository;
import com.springboot.crud.model.Student;
public interface StudentRepository extends CrudRepository<Student, Integer>
{
}
