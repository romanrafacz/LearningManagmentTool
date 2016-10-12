package com.lms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lms.domain.Schedule;
import com.lms.repository.CourseRepository;
import com.lms.repository.ScheduleRepository;

@Controller
public class CourseController {
	
	@Autowired
	private CourseRepository courseRepository;
	private ScheduleRepository scheduleRepository;
	
	@RequestMapping("/course")
	public String showAllCourses(Model model){
		model.addAttribute("courses", courseRepository.findAll());
		return "course/allCourses";
	}
	
	@RequestMapping("/course/{courseCode}")
	public String showIndividualCoure(Model model, @PathVariable String courseCode){
		model.addAttribute("course", courseRepository.findOne(courseCode));
		//model.addAttribute("schedule", scheduleRepository.searchScheduleByCourseCode(courseCode));
		return "course/individualCourse";
	}

}
