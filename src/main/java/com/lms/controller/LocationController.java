package com.lms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lms.repository.LocationRepository;

@Controller
public class LocationController {
	
	@Autowired
	private LocationRepository locationRepository;
	
	@RequestMapping("/location")
	public String showLocation(Model model){
		model.addAttribute("locations", locationRepository.findAll());
		return "location/location";
	}

}
