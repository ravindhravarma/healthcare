package com.slokam.f22healthcarecrm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.f22healthcarecrm.dao.PatientDao;
import com.slokam.f22healthcarecrm.entity.Patient;

@Service
public class PatientService {
	@Autowired
	private PatientDao pdao;

	public void savePatient(Patient p) {
		pdao.save(p);
	}
	public List<Object[]> getPatientByDisease(String dname){
		return pdao.getPatientByDisease(dname);
	}
}
