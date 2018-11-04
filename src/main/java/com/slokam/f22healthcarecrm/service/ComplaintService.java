package com.slokam.f22healthcarecrm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.f22healthcarecrm.dao.ComplaintDao;
import com.slokam.f22healthcarecrm.entity.Complaint;

@Service
public class ComplaintService {
	@Autowired
	private ComplaintDao cdao;
	
	public void saveComplaint(Complaint c){
		cdao.save(c);
	}
	
}
