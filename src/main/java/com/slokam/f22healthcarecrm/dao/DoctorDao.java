package com.slokam.f22healthcarecrm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slokam.f22healthcarecrm.entity.Doctor;

@Repository
public interface DoctorDao extends JpaRepository<Doctor, Long>{

}
