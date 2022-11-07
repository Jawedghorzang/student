package com.student.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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
	
	public Page<Person> getPersons(int pageNumber,int pageSize){
		Pageable page  = PageRequest.of(pageNumber, pageSize);
		return personRep.findAll(page);
	}


	public List<Person> findAll() {
	
		return personRep.findAll();
	}

}
