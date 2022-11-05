package com.student.controllers;


import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
    
	
	/*
	// Find By Id  Person //
	@RequestMapping(value = "api/v1/person/{id}",method=RequestMethod.GET)
	public String  getById(@PathVariable Integer id,Model model ){
	Person getPerson = personService.findById(id).orElse(null);
	model.addAttribute("person",getPerson);
	 return "update";	
}
	*/
	
	@RequestMapping(value="/api/v1/person/{id}", method = {RequestMethod.PUT,RequestMethod.PUT})
	public String getAllPerson(@PathVariable Integer id, Model model,Person person) {
		
		personService.save(person);
		model.addAttribute("success","successful updated!");
		return "redirect:/ index";
	}
	
}
