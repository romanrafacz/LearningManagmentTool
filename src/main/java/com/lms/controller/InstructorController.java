package com.lms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lms.domain.Instructor;
import com.lms.repository.InstructorRepository;

@Controller
public class InstructorController {
	
	@Autowired
	private InstructorRepository instructorRepository;
	
	@RequestMapping("/instructor")
	public String showInstructor(Model model){
		Instructor plump = instructorRepository.findOne(1);
		plump.getInstructorFirstName();
		model.addAttribute("instructors", instructorRepository.findAll());
		model.addAttribute("plump", plump);
		return "instructor/instructor";
	}

}
