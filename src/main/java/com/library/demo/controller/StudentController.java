package com.library.demo.controller;

import com.library.demo.dto.Student;
import com.library.demo.entity.StudentEntity;
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
    private StudentService sc;

    @GetMapping
    public ResponseEntity<List<StudentEntity>> getStudent(){
        return ResponseEntity.ok(sc.getStudents());
    }
    @PostMapping
    public ResponseEntity<StudentEntity> addStudent(@RequestBody StudentEntity student){
        sc.saveStudent(student);
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<StudentEntity> getStudent(@PathVariable("id")  Integer id){
        return new ResponseEntity<>(sc.getStudent(id),HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<StudentEntity> updated(@PathVariable("id")  Integer id,@RequestBody StudentEntity student){
        return new ResponseEntity<>(sc.updateStudent(id,student),HttpStatus.OK);
    }
}
