package com.slokam.f22healthcarecrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.f22healthcarecrm.entity.Disease;
import com.slokam.f22healthcarecrm.service.DiseaseService;

@RestController
@RequestMapping("disease")
public class DiseaseController {
	@Autowired
	private DiseaseService ds;
	
	@PostMapping
	public void saveDisease(@RequestBody Disease d){
		ds.saveDisease(d);
	}
}
