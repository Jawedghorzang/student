package com.student.controllers;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.student.models.Course;
import com.student.services.CourseService;

@Controller
public class CourseController {
 
	@Autowired
	CourseService courseService;
	
	   // Create a new Course /
	@PostMapping("api/v1/course")
	public String savePerson(Model model, Course course) {
		courseService.save(course);
		model.addAttribute("successu","Course successful saved!");
		return "index";
	}
	
	
	// Register a Person for a course //
	
	@PostMapping("api/v1/{course_id}/person/{person_id}")
	public String registerPersonForCourse(@PathVariable Integer course_id,@PathVariable Integer person_id) {
		
		
		return "index";
	}
	
	@GetMapping("api/v1/course/{id}")
	@ResponseBody
	public Optional<Course> findById(@PathVariable Integer id){
		return courseService.findById(id);
	}
	
	@GetMapping("api/v1/course/getAll")
	@ResponseBody
	public List<Course> getAll(){
		return courseService.getAll();
	}
	
	
}
