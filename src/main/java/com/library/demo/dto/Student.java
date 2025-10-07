package com.library.demo.dto;

public class Student {
    private Integer rollNumber;
    private String name;
    public Student(Integer rollNumber,String name){
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public Integer getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }
}
