package com.example.springrest.springrest.services;

import java.util.List;
import com.example.springrest.entities.Course;

public interface CourseService {
    public List<Course> getCourses();
    public Course getCourse(long courseId); // Use "Course" instead of "course"
    public Course addCourse(Course course);
    public Course updateCourse(Long courseId, Course course);
    public boolean deleteCourse(Long courseId);
}

