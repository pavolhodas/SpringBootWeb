package com.example.demo.Course;

import com.example.demo.Adrdess.Model.AddressService;
import com.example.demo.Course.Model.CourseRepository;
import com.example.demo.Course.Model.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseRepository courseRepository;

    @Override
    public void saveCourse(Course course){
        courseRepository.save(course);
    }
}
