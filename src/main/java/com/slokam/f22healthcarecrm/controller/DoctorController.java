package com.slokam.f22healthcarecrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.f22healthcarecrm.entity.Doctor;
import com.slokam.f22healthcarecrm.service.DoctorService;

@RestController
@RequestMapping("doctor")
public class DoctorController {
	@Autowired
	private DoctorService dos;
	
	@PostMapping
	public void saveDoctor(@RequestBody Doctor d){
		dos.saveDoctor(d);
	}
}
