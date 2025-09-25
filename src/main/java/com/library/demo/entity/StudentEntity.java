package com.library.demo.entity;

public class StudentEntity {
    private Integer rollNumber;
    private String name;
    public StudentEntity(Integer rollNumber, String name){
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
