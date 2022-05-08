package com.testlibrary.testlibrary.service;

import com.testlibrary.testlibrary.entity.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@Slf4j
public class StudentService {
    public List<Student> findAllStudents() {
        log.info("Inside findAllStudents method of StudentService");
        List<Student> students = new ArrayList<>();
        Student[] studentsArray = new Student[3];

        studentsArray[0] = new Student();
        studentsArray[1] = new Student();
        studentsArray[2] = new Student();

        studentsArray[0].setStudentNumber("216004565");
        studentsArray[0].setCourseName("Software Engineering");
        studentsArray[0].setDepartmentName("Networks");
        studentsArray[0].setFullName("Niyonsaba Alex");
        studentsArray[0].setYearOfStudy(4);
        studentsArray[0].setRegistrationNumber("16/U/10344/EVE");

        studentsArray[1].setStudentNumber("216004564");
        studentsArray[1].setCourseName("Computer Science");
        studentsArray[1].setDepartmentName("Computer Science");
        studentsArray[1].setFullName("Mutungi Denis Sharp");
        studentsArray[1].setYearOfStudy(3);
        studentsArray[1].setRegistrationNumber("16/U/10344/PS");

        studentsArray[2].setStudentNumber("216004560");
        studentsArray[2].setCourseName("Information Systems");
        studentsArray[2].setDepartmentName("IT");
        studentsArray[2].setFullName("Okoth Brian");
        studentsArray[2].setYearOfStudy(2);
        studentsArray[2].setRegistrationNumber("16/U/10344");

        students.addAll(Arrays.asList(studentsArray));

        return students;
    }
}
