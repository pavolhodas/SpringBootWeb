package com.example.demo.Course.Model;

import com.example.demo.Course.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Long> {
}
