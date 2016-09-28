package com.lms.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lms.domain.Enrollment;
import com.lms.domain.Schedule;
import com.lms.repository.EnrollmentRepository;
import com.lms.repository.ScheduleRepository;

@Controller
public class EnrollmentController {
	
	@Autowired
	private ScheduleRepository scheduleRepository;
	private EnrollmentRepository enrollmentRepository;
	
	@RequestMapping("/enroll/{scheduleCode}")
	public String enrollmentPage(Model model, @PathVariable String scheduleCode, Enrollment enrollment){
		model.addAttribute("schedule", scheduleRepository.searchScheduleByScheduleCode(scheduleCode) );
		return "enrollment/enrollmentPage";
	}
	
	@RequestMapping(value="/enroll/add", method=RequestMethod.POST)
	public String addEnrollment(@Valid Enrollment enrollment,  BindingResult bindingResult, Model model){
		model.addAttribute("name", enrollment.getFirstName());
		model.addAttribute("lastname", enrollment.getLastName());
		model.addAttribute("email", enrollment.getEmail());
		return "enrollment/confirmationPage";
	}

}
