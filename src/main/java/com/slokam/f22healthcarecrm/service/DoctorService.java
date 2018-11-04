package com.slokam.f22healthcarecrm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.f22healthcarecrm.dao.DoctorDao;
import com.slokam.f22healthcarecrm.entity.Doctor;

@Service
public class DoctorService {
	@Autowired
	private DoctorDao dod;

	public void saveDoctor(Doctor d) {
		dod.save(d);
	}
}
