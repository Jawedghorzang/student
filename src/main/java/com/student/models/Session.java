package com.student.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Session {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	@Column(name ="id")
	private Integer id;
	
	/* Many To One Relationship between SESSION and COURSE*/
	@ManyToOne
	@JoinColumn(name="course_id", nullable=false)
	private Course course;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date startDateTime;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date endDateTime;

	// Constructor//
	public Session(Integer id, Course course, Date startDateTime, Date endDateTime) {
		super();
		this.id = id;
		this.course = course;
		this.startDateTime = startDateTime;
		this.endDateTime = endDateTime;
	}
	
		//getters and setters//
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Date getStartDateTime() {
		return startDateTime;
	}

	public void setStartDateTime(Date startDateTime) {
		this.startDateTime = startDateTime;
	}

	public Date getEndDateTime() {
		return endDateTime;
	}

	public void setEndDateTime(Date endDateTime) {
		this.endDateTime = endDateTime;
	}

	 //toString //
	
	@Override
	public String toString() {
		return "Session [id=" + id + ", course=" + course + ", startDateTime=" + startDateTime + ", endDateTime="
				+ endDateTime + "]";
	}
	
	

   
	
	
}
