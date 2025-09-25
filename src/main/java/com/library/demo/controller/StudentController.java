package com.library.demo.controller;

import com.library.demo.dto.Student;
import com.library.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {
    @Autowired
    StudentService sc;
    @Value("${env}")
    private String props;

    @GetMapping("/props")
    public String getProps(){
        return props;
    }


    static List<Student> students = new ArrayList<>();
    static{
        students.add(new Student(1,"Vinay"));
    }
    @GetMapping
    public ResponseEntity<List<Student>> getStudent(){
        return ResponseEntity.ok(sc.getStudents());
    }
    @PostMapping
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
        students.add(student);
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

}
