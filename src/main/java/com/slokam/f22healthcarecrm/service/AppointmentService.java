package com.slokam.f22healthcarecrm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.f22healthcarecrm.dao.AppointmentDao;
import com.slokam.f22healthcarecrm.entity.Appointment;

@Service
public class AppointmentService {
	@Autowired
	private AppointmentDao adao;
	public void saveAppointment(Appointment a){
		adao.save(a);
	}
}
