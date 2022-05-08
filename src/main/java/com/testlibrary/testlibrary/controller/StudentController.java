package com.testlibrary.testlibrary.controller;

import com.testlibrary.testlibrary.entity.Student;
import com.testlibrary.testlibrary.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@Slf4j
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping
    public ResponseEntity<List<Student>> findAllStudents(){
        log.info("Inside findAllStudents method of StudentController");
        return ResponseEntity.status(HttpStatus.OK).body(studentService.findAllStudents());
    }
}
