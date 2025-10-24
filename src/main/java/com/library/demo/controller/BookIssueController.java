package com.library.demo.controller;

import com.library.demo.dto.Student;
import com.library.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bookIssue")
public class BookIssueController {
    @Autowired
    StudentService studentService;
//
//    @GetMapping("/students")
//    public List<Student> getStudents(){
//        return studentService.getStudents();
//    }
}
