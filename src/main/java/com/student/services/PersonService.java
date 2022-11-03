package com.student.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.models.Person;
import com.student.repository.PersonRep;

@Service
public class PersonService {

	@Autowired
	PersonRep personRep;
	
	
	public void save(Person person) {
		personRep.save(person);
	}

}
