package com.mx.accenture.springmvc.example.service;

import com.mx.accenture.springmvc.example.dao.CourseRepository;
import com.mx.accenture.springmvc.example.dto.CourseDTO;
import com.mx.accenture.springmvc.example.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;
import java.util.List;

@Service
public class CourseServiceImpl implements ICourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<CourseDTO> listCourse() {
        List<Course> cursos = courseRepository.find();
        List<CourseDTO> customersDTO=cursos.stream()
                .map((customer)-> mapCourseToCourseDTO(customer))
                .collect(Collectors.toList());
        return customersDTO;
    }

    @Override
    public void deleteCourse(int idCourse) {
        courseRepository.delete(idCourse);
    }

    private CourseDTO mapCourseToCourseDTO(Course course){
        CourseDTO filteredCustomer = new CourseDTO(course.getIdCourse(), course.getNameCourse(), course.getTypeCourse(),
                course.getNameTeacher(), course.getNumberStudents(), course.getNumberLessons());
        return filteredCustomer;
    }

}