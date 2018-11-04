package com.slokam.f22healthcarecrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.f22healthcarecrm.entity.Patient;
import com.slokam.f22healthcarecrm.service.PatientService;

@RestController
@RequestMapping("patient")
public class PatientController {
	@Autowired
	private PatientService ps;
	
	@PostMapping
	public void savePatient(@RequestBody Patient p){
		ps.savePatient(p);
	}
	@GetMapping("/byDisease/{name}")
	public List<Object[]> getPatientByDisease(@PathVariable(name="name") String Dname){
		return ps.getPatientByDisease(Dname);
	}
}
