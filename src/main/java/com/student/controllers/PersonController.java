package com.student.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.student.models.Person;
import com.student.services.PersonService;

@Controller
public class PersonController {

	   @Autowired
	   PersonService personService;
	
	   //CREATE PERSON//
	@PostMapping("/api/v1/person")
	public String  savePerson(Person person,Model model)  {
		
		personService.save(person);
		model.addAttribute("success","The Person saved successful!");
		return "/index";
	}
	
	// Find By Id //
	@RequestMapping("api/v1/person/all")
	@ResponseBody
	public List<Person> getAll( ){
		return personService.getAll();
}
	
	
	

	
	
}
