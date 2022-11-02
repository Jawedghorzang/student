package com.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.models.Person;

public interface PersonRep extends JpaRepository<Person, Integer> {

}
