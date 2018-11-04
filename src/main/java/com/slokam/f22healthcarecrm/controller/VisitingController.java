package com.slokam.f22healthcarecrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.f22healthcarecrm.entity.Visiting;
import com.slokam.f22healthcarecrm.service.VisitingService;

@RestController
@RequestMapping("visiting")
public class VisitingController {
	@Autowired
	private VisitingService vs;
	@PostMapping
	public void saveVisiting(@RequestBody Visiting v){
		vs.saveVisiting(v);
	}
}
