package com.mx.accenture.springmvc.example.dto;

import java.io.Serializable;

public class CourseDTO implements Serializable {
    private int idCourse;
    private String nameCourse;
    private String typeCourse;
    private String nameTeacher;
    private int numberStudents;
    private int numberLessons;

    public int getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public String getTypeCourse() {
        return typeCourse;
    }

    public void setTypeCourse(String typeCourse) {
        this.typeCourse = typeCourse;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    public int getNumberStudents() {
        return numberStudents;
    }

    public void setNumberStudents(int numberStudents) {
        this.numberStudents = numberStudents;
    }

    public int getNumberLessons() {
        return numberLessons;
    }

    public void setNumberLessons(int numberLessons) {
        this.numberLessons = numberLessons;
    }

    public CourseDTO(int idCourse, String nameCourse, String typeCourse, String nameTeacher, int numberStudents, int numberLessons) {
        this.idCourse = idCourse;
        this.nameCourse = nameCourse;
        this.typeCourse = typeCourse;
        this.nameTeacher = nameTeacher;
        this.numberStudents = numberStudents;
        this.numberLessons = numberLessons;

    }
}


