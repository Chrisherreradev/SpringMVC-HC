package com.mx.accenture.springmvc.example.service;

import com.mx.accenture.springmvc.example.dto.CourseDTO;
import com.mx.accenture.springmvc.example.model.Course;

import java.util.List;

public interface ICourseService {

    public List<CourseDTO> listCourse();

    public void deleteCourse(int idCourse);

}