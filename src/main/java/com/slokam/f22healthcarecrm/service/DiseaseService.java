package com.slokam.f22healthcarecrm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.f22healthcarecrm.dao.DiseaseDao;
import com.slokam.f22healthcarecrm.entity.Disease;

@Service
public class DiseaseService {
	@Autowired
	private DiseaseDao ddao;

	public void saveDisease(Disease d) {
		ddao.save(d);
	}
	

}
