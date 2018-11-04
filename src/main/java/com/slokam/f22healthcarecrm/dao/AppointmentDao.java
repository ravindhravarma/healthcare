package com.slokam.f22healthcarecrm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slokam.f22healthcarecrm.entity.Appointment;

@Repository
public interface AppointmentDao extends JpaRepository<Appointment, Long>{

}
