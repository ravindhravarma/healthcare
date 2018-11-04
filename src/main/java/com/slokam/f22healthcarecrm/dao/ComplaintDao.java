package com.slokam.f22healthcarecrm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slokam.f22healthcarecrm.entity.Complaint;

@Repository
public interface ComplaintDao extends JpaRepository<Complaint, Long>{

}
