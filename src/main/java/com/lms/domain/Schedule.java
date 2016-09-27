package com.lms.domain;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.lms.domain.Course;


@Entity
@Table(name="schedule")
public class Schedule implements Serializable {
	
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="schedule_id")
	private Integer scheduleId;
	
	@Id
	@Column(name="schedule_code")
	private String scheduleCode;
	
	@Column(name="start_date")
	private Date startDate;
	
	@Column(name="end_date")
	private Date endDate;
	
	@OneToOne(fetch = FetchType.LAZY)
    //@Fetch(FetchMode.SELECT)
    @JoinColumn(name = "course_code", nullable = false)
	private Course course;
	
	@Column(name="course_url")
	private String courseUrl;
	
	@Column(name="category")
	private String category;
	
	@Column(name="subcategory")
	private String subcategory;
	
	@Column(name="status")
	private String status;
	
	@Column(name="guaranteed_course")
	private Boolean guaranteedCorse;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="location_code",nullable = true)
	private Location location;
	
//	@Column(name="created_on")
//	private Timestamp createdOn;
//	
//	@Column(name="last_modified")
//	private Timestamp lastModified;
	
	@OneToOne(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="instructor_id",nullable = true)
	private Instructor instructor;
	
	@Column(name="title")
	private String title;
	
	public Schedule(){}

	public String getScheduleCode() {
		return scheduleCode;
	}

	public void setScheduleCode(String scheduleCode) {
		this.scheduleCode = scheduleCode;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStarDate(Date starDate) {
		this.startDate = starDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}


	public String getCourseUrl() {
		return courseUrl;
	}

	public void setCourseUrl(String courseUrl) {
		this.courseUrl = courseUrl;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSubcategory() {
		return subcategory;
	}

	public void setSubcategory(String subcategory) {
		this.subcategory = subcategory;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Boolean getGuaranteedCorse() {
		return guaranteedCorse;
	}

	public void setGuaranteedCorse(Boolean guaranteedCorse) {
		this.guaranteedCorse = guaranteedCorse;
	}

	

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getScheduleId() {
		return scheduleId;
	}
	

}
