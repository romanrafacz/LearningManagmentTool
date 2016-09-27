package com.lms.domain;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="course")
public class Course implements Serializable {
	
	
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="course_id")
//	private Integer courseId;
	
//	@OneToOne(mappedBy = "course", fetch = FetchType.LAZY)
//	@Fetch(FetchMode.SELECT)
//	private String courseCode;
	@Id
	@Column(name="course_code")
	private String courseCode;
	
	@Column(name="course_title")
	private String courseTitle;
	
	@Column(name="description")
	private String description;
	
	@Column(name="duration")
	private float duration;
	
	@Column(name="abstract")
	private String abstractInfo;
	
	@Column(name="vendor")
	private String vendor;
	
	@Column(name="topic")
	private String topic;
	
	@Column(name="objective")
	private String objective;
	
	@Column(name="overview")
	private String overview;
	
	@Column(name="duration_unit")
	private String durationUnit;

	@Column(name="prerequisits")
	private String prerequisits;
	
	@Column(name="currency")
	private String currency;
	
	//schedule relationship of for start/end dates
//	@OneToMany(mappedBy = "scheduleCode", fetch = FetchType.EAGER)
//	private Set<Schedule> schedule;
	
//	@Column(name="create_on")
//	private Timestamp createOn;
//	
//	@Column(name="last_modified")
//	private Timestamp lastModified;
	
	public Course(){}


	public String getCourseCode() {
		return courseCode;
	}



	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}



	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getDuration() {
		return duration;
	}

	public void setDuration(float duration) {
		this.duration = duration;
	}

	public String getAbstractInfo() {
		return abstractInfo;
	}

	public void setAbstractInfo(String abstractInfo) {
		this.abstractInfo = abstractInfo;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getObjective() {
		return objective;
	}

	public void setObjective(String objective) {
		this.objective = objective;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public String getDurationUnit() {
		return durationUnit;
	}

	public void setDurationUnit(String durationUnit) {
		this.durationUnit = durationUnit;
	}

	public String getPrerequisits() {
		return prerequisits;
	}

	public void setPrerequisits(String prerequisits) {
		this.prerequisits = prerequisits;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}


	
	

	
	


}
