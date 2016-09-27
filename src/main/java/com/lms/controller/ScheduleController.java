package com.lms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lms.repository.ScheduleRepository;

@Controller
public class ScheduleController {
	
	@Autowired
	private ScheduleRepository scheduleRepository;
	
	@RequestMapping("/schedule")
	public String showSchedule(Model model){
		String platform = "Platform";
		String middleware = "Middleware";
		String ibm_security = "IBM Security";
		String storage = "Storage";
		String vsphere = "Vsphere";
		String powersystems = "PowerSystems";
		model.addAttribute("schedule", scheduleRepository.findAll());
		model.addAttribute("platform", platform);
		model.addAttribute("ibm_security", ibm_security);
		model.addAttribute("storage", storage);
		model.addAttribute("vsphere", vsphere);
		model.addAttribute("powersystems", powersystems);
		model.addAttribute("middleware", middleware);
		return "schedule/schedule";
	}
	
	@RequestMapping("/schedule/{category}")
	public String showScheduleByCategory(Model model, @PathVariable String category ){
		String platform = "Platform";
		String middleware = "Middleware";
		String ibm_security = "IBM Security";
		String storage = "Storage";
		String vsphere = "vSphere";
		String powersystems = "Power Systems";
		model.addAttribute("schedule", scheduleRepository.searchScheduleByCategory(category));
		model.addAttribute("platform", platform);
		model.addAttribute("ibm_security", ibm_security);
		model.addAttribute("storage", storage);
		model.addAttribute("vsphere", vsphere);
		model.addAttribute("powersystems", powersystems);
		model.addAttribute("middleware", middleware);
		return "schedule/schedule";
	}

}
