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
        List<Course> courses = courseRepository.find();
        List<CourseDTO> coursesDTO=courses.stream()
                .map((course)-> mapCourseToCourseDTO(course))
                .collect(Collectors.toList());
        return coursesDTO;
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