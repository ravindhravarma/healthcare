package com.slokam.f22healthcarecrm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slokam.f22healthcarecrm.entity.Disease;

@Repository
public interface DiseaseDao extends JpaRepository<Disease, Long>{

}
