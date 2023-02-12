package com.mx.accenture.springmvc.example.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@TableGenerator(name = "Course")
public class Course implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_course")
    private int idCourse;
    @Column(name = "name_course")
    private String nameCourse;
    @Column(name = "type_course")
    private String typeCourse;
    @Column(name = "name_teacher")
    private String nameTeacher;
    @Column(name = "number_students")
    private int numberStudents;
    @Column(name = "number_lessons")
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

    public void setNumberStudents(Integer numberStudents) {
        this.numberStudents = numberStudents;
    }

    public int getNumberLessons() {
        return numberLessons;
    }

    public void setNumberLessons(Integer numberLessons) {
        this.numberLessons = numberLessons;
    }
}
