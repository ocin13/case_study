package com.casestudy.caseStudy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casestudy.caseStudy.entityModels.Appointment;

public interface AppointmentRepository extends JpaRepository <Appointment, Integer>{
	public List<Appointment> findByDoctorDocId(Integer id);
	public Appointment findByUserName(String username);
	public List<Appointment> findByDepName(String depName);
	
}
