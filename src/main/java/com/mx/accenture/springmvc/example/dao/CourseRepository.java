package com.mx.accenture.springmvc.example.dao;

import com.mx.accenture.springmvc.example.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository <Course, Integer> {
    List<Course> findAll();
}
