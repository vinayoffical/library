package com.library.demo.service;

import com.library.demo.dto.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    static List<Student> students = new ArrayList<>();
    static{
        students.add(new Student(1,"Vinay"));
    }

    public List<Student> getStudents() {
        return students;
    }
}
