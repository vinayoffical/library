package com.library.demo.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class StudentEntity {
    @Id
    @Column
    private Integer rollNumber;
    @Column
    private String name;

    public StudentEntity() {
    }

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

    public void setRollNumber(Integer rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setName(String name) {
        this.name = name;
    }
}
