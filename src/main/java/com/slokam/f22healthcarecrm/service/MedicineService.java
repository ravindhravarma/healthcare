package com.slokam.f22healthcarecrm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.f22healthcarecrm.dao.MedicineDao;
import com.slokam.f22healthcarecrm.entity.Medicine;

@Service
public class MedicineService {
	@Autowired
	private MedicineDao mdao;

	public void saveMedicine(Medicine m) {
		mdao.save(m);
	}
	public List<Object[]> getPatientByMedicine(String medicinename){
		return mdao.getPatientdetailsByMedicene(medicinename);
	}
}
