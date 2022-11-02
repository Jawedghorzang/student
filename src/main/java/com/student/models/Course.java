package com.student.models;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "COURSE")
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	 
	/* Many To Many Relationship between  COURSE table and PERSON*/
	@ManyToMany(mappedBy = "likedCourses")
	Set<Person>  likes;
	
	/* One To Many Relationship between COURSE table and SESSION*/
	@OneToMany(mappedBy = "course")
	Set<Session> session; 
	
	
	private String name;
	private String description;
	private String study_points;
	
	 /* Constructor */
	public Course(Integer id, Set<Person> likes, Set<Session> session, String name, String description,
			String study_points) {
		super();
		this.id = id;
		this.likes = likes;
		this.session = session;
		this.name = name;
		this.description = description;
		this.study_points = study_points;
	}

	//  getters and setters //
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Set<Person> getLikes() {
		return likes;
	}

	public void setLikes(Set<Person> likes) {
		this.likes = likes;
	}

	public Set<Session> getSession() {
		return session;
	}

	public void setSession(Set<Session> session) {
		this.session = session;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStudy_points() {
		return study_points;
	}

	public void setStudy_points(String study_points) {
		this.study_points = study_points;
	}
	
	
	
	 //  toString Method //
	@Override
	public String toString() {
		return "Course [id=" + id + ", likes=" + likes + ", session=" + session + ", name=" + name + ", description="
				+ description + ", study_points=" + study_points + "]";
	}

		
	
}
