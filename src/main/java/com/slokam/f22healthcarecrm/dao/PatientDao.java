package com.slokam.f22healthcarecrm.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.slokam.f22healthcarecrm.entity.Patient;

@Repository
public interface PatientDao extends JpaRepository<Patient, Long>{
	@Query("select p.name,d.name,c.description,me.name,m.quantity,m.howtoUse from Complaint c join c.disease "
			+ "di join c.visiting v join v.appointment a join a.patient p join v.doctor d join c.mclist m "
			+ "join m.medicne me where di.name = ?1")
	public List<Object[]> getPatientByDisease(String diname);
}
