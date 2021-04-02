package com.casestudy.caseStudy.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casestudy.caseStudy.entityModels.Patient;
import com.casestudy.caseStudy.repository.PatientRepository;

@Service
public class PatientServiceImp implements PatientService {
	
	@Autowired
	PatientRepository pr;
	
	@Override
	public boolean addNewPatient(Patient patient) {
		// insert new patient to the database
		boolean status = false;
		try {
			pr.save(patient);
			status = true;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			status = false;
		}
		return status;
	}

	@Override
	public List<Patient> getAllPatients() {
		// fetch list of patients from the database 
		List<Patient> patientsList = new ArrayList<Patient>();
		try {
			patientsList = pr.findAll();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			patientsList = null;
		}
		return patientsList;
	}

	@Override
	public Patient getPatientById(Integer id) {
		// get patient using id value
		Patient foundPatient = pr.getOne(id);
		if(foundPatient != null) {
			System.out.println("patient with id: " + id + " found");
		}else {
			System.out.println("patient with id: " + id + " not found");
		}
		
		return foundPatient;
	}

	@Override
	public boolean updatePatientById(Integer id, Patient patient) {
		// update patient using id value
		boolean status = false;
		Patient patientToUpdate = pr.getOne(id);
		if(patientToUpdate != null) {
			System.out.println("patient with id: " + id + " found");
			if(patient.getFirstName() != null) patientToUpdate.setFirstName(patient.getFirstName());
			if(patient.getLastName() != null) patientToUpdate.setLastName(patient.getLastName());
			if(patient.getUserName() != null) patientToUpdate.setUserName(patient.getUserName());
			if(patient.getPassword()!= null) patientToUpdate.setPassword(patient.getPassword());
			if(patient.getDateOfBirth() != null) patientToUpdate.setDateOfBirth(patient.getDateOfBirth());
			if(patient.getGender() != null) patientToUpdate.setGender(patient.getGender());
			if(patient.getApt()!= null) patientToUpdate.setApt(patient.getApt());
			if(patient.getStreet() != null) patientToUpdate.setStreet(patient.getStreet());
			if(patient.getCity()!= null) patientToUpdate.setCity(patient.getCity());
			if(patient.getState() != null) patientToUpdate.setState(patient.getState());
			if(patient.getPhone() != null) patientToUpdate.setPhone(patient.getPhone());
			if(patient.getEmail() != null) patientToUpdate.setEmail(patient.getEmail());
			pr.save(patientToUpdate);
			status = true;
		}else {
			System.out.println("patient with id: " + id + " not found");
			status = false;
		}
		return status;
	}

	@Override
	public boolean deletePatientById(Integer id) {
		//delete patient using id value
		boolean status = false;
		try {
			pr.deleteById(id);
			status = true;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			status = false;
		}finally {
			return status;
		}
	}
	
}
