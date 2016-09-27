package com.lms.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="instructor")
public class Instructor implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="instructor_id")
	private Integer instructorId;
	
	@Column(name="instructor_first_name")
	private String instructorFirstName;
	
	@Column(name="instructor_last_name")
	private String instructorLastName;
	
	@Column(name="instructor_email")
	private String instructorEmail;
	
	public Instructor(){}

	public String getInstructorFirstName() {
		return instructorFirstName;
	}

	public void setInstructorFirstName(String instructorFirstName) {
		this.instructorFirstName = instructorFirstName;
	}

	public String getInstructorLastName() {
		return instructorLastName;
	}

	public void setInstructorLastName(String instructorLastName) {
		this.instructorLastName = instructorLastName;
	}

	public String getInstructorEmail() {
		return instructorEmail;
	}

	public void setInstructorEmail(String instructorEmail) {
		this.instructorEmail = instructorEmail;
	}

	public void setInstructorId(Integer instructorId) {
		this.instructorId = instructorId;
	}

	

}
