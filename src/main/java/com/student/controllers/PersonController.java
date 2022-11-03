package com.student.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.student.models.Person;
import com.student.services.PersonService;

@Controller
public class PersonController {

	   @Autowired
	   PersonService personService;
	
	@PostMapping("/api/v1/person")
	public String  savePerson(Person person,Model model)  {
		
		personService.save(person);
		model.addAttribute("success","The Person saved successful!");
		return "/index";
	}
}
