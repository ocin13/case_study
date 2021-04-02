package com.casestudy.caseStudy.services;

import java.util.List;

import com.casestudy.caseStudy.entityModels.Appointment;



public interface AppointmentService {
	public boolean addNewAppointment(Appointment appointment);
	//get all Appointments from the data base
	public List<Appointment> getAllAppointments();
	//get specific Appointment using id
	public Appointment getAppointmentById(Integer id);

	//update Appointment information
	public boolean updateAppointmentById(Integer id, Appointment appointment);
	//delete Appointment from the database 
	public boolean deleteAppointmentById(Integer id);
}
