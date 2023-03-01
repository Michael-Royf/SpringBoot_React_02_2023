package com.michael.springboot.service.impl;

import com.michael.springboot.repository.StudentRepository;
import com.michael.springboot.service.StudentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private ModelMapper mapper;






}
