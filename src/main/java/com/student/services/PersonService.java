package com.student.services;

import java.util.List;
import java.util.Optional;

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


	public Optional<Person> findById(Integer id) {
		return   personRep.findById(id);
	}
	
	public List<Person> getAll(){
	return	personRep.findAll();
	}

}
