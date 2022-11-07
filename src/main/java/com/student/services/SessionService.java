package com.student.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.models.Session;
import com.student.repository.SessionRepo;

@Service
public class SessionService {

	
	@Autowired
	SessionRepo sessionRepo;
	
	
	public void savePersonForCourse(Session session) {
		sessionRepo.save(session);
	}
	
}
