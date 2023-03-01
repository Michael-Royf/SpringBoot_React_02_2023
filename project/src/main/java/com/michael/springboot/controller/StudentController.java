package com.michael.springboot.controller;

import com.michael.springboot.entity.Gender;
import com.michael.springboot.entity.Student;
import com.michael.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/students")
public class StudentController {


    @Autowired
    private StudentService studentService;


    @GetMapping
    public List<Student> hello() {
        List<Student> students = new ArrayList<>();
        Student student1 = Student.builder()
                .id(1L)
                .name("Michael")
                .email("michael@gmail.com")
                .gender(Gender.MALE)
                .build();
        Student student2 = Student.builder()
                .id(2L)
                .name("Anna")
                .email("anna@gmail.com")
                .gender(Gender.FEMALE)
                .build();
        students.add(student1);
        students.add(student2);
        return students;
    }


}
