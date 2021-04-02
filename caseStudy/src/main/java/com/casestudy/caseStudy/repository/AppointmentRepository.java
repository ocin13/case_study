package com.casestudy.caseStudy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casestudy.caseStudy.entityModels.Appointment;

public interface AppointmentRepository extends JpaRepository <Appointment, Integer>{

}
