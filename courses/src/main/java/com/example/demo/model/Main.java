package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "main_1")
public class Main {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String courseName;
    private int creditNumber;
    private int studentsRegistered;

    public Main() {
    }

    public Main(String courseName, int creditNumber, int studentsRegistered) {
        this.id = id;
        this.courseName = courseName;
        this.creditNumber = creditNumber;
        this.studentsRegistered = studentsRegistered;
    }

    public Long getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCreditNumber() {
        return creditNumber;
    }

    public int getStudentsRegistered() {
        return studentsRegistered;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCreditNumber(int creditNumber) {
        this.creditNumber = creditNumber;
    }

    public void setStudentsRegistered(int studentsRegistered) {
        this.studentsRegistered = studentsRegistered;
    }

}
