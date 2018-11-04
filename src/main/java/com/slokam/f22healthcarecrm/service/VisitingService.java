package com.slokam.f22healthcarecrm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.f22healthcarecrm.dao.VisitingDao;
import com.slokam.f22healthcarecrm.entity.Visiting;

@Service
public class VisitingService {
	@Autowired
	private VisitingDao vdao;
	
	public void saveVisiting(Visiting v){
		vdao.save(v);
	}
}
