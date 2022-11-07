package com.student.services;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.student.models.Course;
import com.student.repository.CourseRep;

@Service
public class CourseService {

	@Autowired
	CourseRep courseRep;
	
	
	public void save(Course course) {
		courseRep.save(course);
	}
	
	public Optional<Course> findById(Integer id){
		return courseRep.findById(id);
	}

	public List<Course> getAll() {
               return courseRep.findAll();
	}

}
