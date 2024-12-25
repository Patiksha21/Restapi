package com.example.springrest.springrest.services;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;
import com.example.springrest.entities.Course;

@Service
public class CourseServiceimpl implements CourseService {

    // List to hold courses
    private List<Course> list;

    // Constructor to initialize the course list
    public CourseServiceimpl() {
        list = new ArrayList<>();
        list.add(new Course(145, "Java Core Course", "This course is for Java developers."));
        list.add(new Course(4343, "Spring Boot Course", "Creating REST API using Spring Boot."));
    }

    // Implement the method from CourseService interface
    @Override
    public List<Course> getCourses() {
        return list;
    }

    // Implement the method to get a course by ID
    @Override
    public Course getCourse(long courseId) {
        for (Course course : list) {
            if (course.getId() == courseId) {
                return course;
            }
        }
        return null; // Return null if no course with the given ID is found
    }

    // Implement the method to add a new course
    @Override
    public Course addCourse(Course course) {
        list.add(course); // Add the course to the list
        return course; // Return the added course
    }

    // Implement the method to update an existing course
    @Override
    public Course updateCourse(Long courseId, Course updatedCourse) {
        for (Course existingCourse : list) {
            if (existingCourse.getId() == courseId) {
                existingCourse.setTitle(updatedCourse.getTitle()); // Update the title
                existingCourse.setDescription(updatedCourse.getDescription()); // Update the description
                return existingCourse; // Return updated course
            }
        }
        return null; // Return null if no course with the given ID is found
    }

    // Implement the method to delete a course by ID
    @Override
    public boolean deleteCourse(Long courseId) {
        for (Course course : list) {
            if (course.getId() == courseId) {
                list.remove(course); // Remove the course from the list
                return true; // Return true indicating the course was deleted
            }
        }
        return false; // Return false if no course with the given ID is found
    }
}

