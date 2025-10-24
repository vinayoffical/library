package com.library.demo.service;

//import com.library.demo.dao.StudentDao;
import com.library.demo.dao.StudentRepository;
import com.library.demo.dto.Student;
import com.library.demo.entity.StudentEntity;
import com.library.demo.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
//    @Autowired
//    private StudentDao studentDao;
//    static List<Student> students = new ArrayList<>();
//    static{
//        students.add(new Student(1,"Vinay"));
//    }

    @Autowired
    private StudentRepository studentRepository;

    public List<StudentEntity> getStudents() {
        return studentRepository.findAll();
    }

    public void saveStudent(StudentEntity student) {
       // StudentEntity studentEntity=new StudentEntity(student.getRollNumber(),student.getName());
        //studentDao.saveStudent(studentEntity);
        studentRepository.save(student);
    }

    public StudentEntity getStudent(Integer id) {
        return studentRepository.findById(id).get();
    }

    public StudentEntity updateStudent(Integer id, StudentEntity student) {
       Optional<StudentEntity> studentEntityOptional= studentRepository.findById(id);
        if(studentEntityOptional.isEmpty()){
            throw new ResourceNotFoundException("Student Not present with Id= "+ id);
        }
        return studentRepository.save(student);
    }
}
