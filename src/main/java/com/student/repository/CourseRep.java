package com.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.models.Course;

public interface CourseRep extends JpaRepository<Course, Integer> {

}
