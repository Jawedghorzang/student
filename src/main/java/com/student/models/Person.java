package com.student.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name =  "PERSON")
public class Person {

	
	
	@Id
	@GeneratedValue( strategy =  GenerationType.IDENTITY)
	@Column(name ="id")
	private Integer id;
	
	
	@Column(name = "fname")
	private String fname;
	
	@Column(name = "lname")
	private String lname;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "phone")
	private String phone;
	
	
	
	 @ManyToMany(fetch = FetchType.LAZY)
	 @JsonIgnore 
	 @JoinTable(
			 name = "person_course",
			 joinColumns = @JoinColumn(name = "student_id"),
			 inverseJoinColumns = @JoinColumn(name = "course_id"))
	 
	 Set<Course> likedCourses = new HashSet<>();


    public Person() {
		super();
	}

	// Constructor//
	public Person(Integer id, String fname, String lname, String email, String phone, Set<Course> likedCourses) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phone = phone;
		this.likedCourses = likedCourses;
	}
    // getters and setters //

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}



	public String getFname() {
		return fname;
	}



	public void setFname(String fname) {
		this.fname = fname;
	}



	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getLname() {
		return lname;
	}



	public void setLname(String lname) {
		this.lname = lname;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public Set<Course> getLikedCourses() {
		return likedCourses;
	}



	public void setLikedCourses(Set<Course> likedCourses) {
		this.likedCourses = likedCourses;
	}


	 //  toString Method //
	@Override
	public String toString() {
		return "Person [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email 
				+ ", likedCourses=" + likedCourses + "]";
	}
	  

}
