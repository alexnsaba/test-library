package com.testlibrary.testlibrary.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student{
    private String fullName;
    private String studentNumber;
    private String registrationNumber;
    private int yearOfStudy;
    private String courseName;
    private String departmentName;
}
