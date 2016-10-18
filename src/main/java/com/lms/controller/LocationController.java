package com.lms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lms.repository.LocationRepository;
import com.lms.repository.ScheduleRepository;

@Controller
public class LocationController {
	
	@Autowired
	private LocationRepository locationRepository;
	private ScheduleRepository scheduleRepository;
	
	@RequestMapping("/location")
	public String showLocation(Model model){
		model.addAttribute("locations", locationRepository.findAll());
		return "location/location";
	}
	
	@RequestMapping("/location/{locationCode}")
	public String showCoure(Model model, @PathVariable String locationCode){
		
		//just a test variable
		String loco = locationCode;
		model.addAttribute("loco", locationCode);
		//model.addAttribute("schedule", scheduleRepository.searchScheduleByLocationCode(locationCode));
		//model.addAttribute("schedule", scheduleRepository.findAll());
		model.addAttribute("location", locationRepository.findOne(locationCode));
		return "location/locationWithSchedule";
	}

}
