package com.student.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.student.models.Session;

public interface SessionRepo extends JpaRepository<Session,Integer> {


	 
}
