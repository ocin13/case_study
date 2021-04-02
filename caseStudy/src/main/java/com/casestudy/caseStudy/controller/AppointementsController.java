package com.casestudy.caseStudy.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.casestudy.caseStudy.entityModels.Appointment;
import com.casestudy.caseStudy.entityModels.Department;
import com.casestudy.caseStudy.entityModels.Doctor;
import com.casestudy.caseStudy.services.AppointmentService;
import com.casestudy.caseStudy.services.DepartmentService;
import com.casestudy.caseStudy.services.DoctorService;

@Controller
public class AppointementsController {
	
	@Autowired
	AppointmentService as;
	
	@Autowired
	DepartmentService ds;
	
	@Autowired
	DoctorService drs;
	
	
	//show list of appointments
	@RequestMapping("/appointments")
	public ModelAndView  showAppointements() {
		ModelAndView mav = new ModelAndView("appointments");
		List<Appointment> appointmentsList = new ArrayList<Appointment>();
		try {
			appointmentsList = as.getAllAppointments();
			mav.addObject("appointmentsList", appointmentsList);
		}catch(Exception e){
			String message = "no appointment found";
			mav.addObject("message", message);
		}
		return mav;
	}
	
	//show appointment form
	@RequestMapping("/newAppointment")
	public ModelAndView showAppointemtForm() {
		ModelAndView mav = new ModelAndView("appointments_form");
		List<Department> departmentsList = new ArrayList<Department>();
		List<Doctor> doctorsList = new ArrayList<Doctor>(); 
		try {
			departmentsList = ds.getAllDepartments();
			mav.addObject("departmentsList", departmentsList);
			doctorsList = drs.getAllDoctors();
			mav.addObject("doctorsList", doctorsList);
		}catch(Exception e) {
			System.out.print("no depatment found");
		}
		return mav;
	}
	
	//insert new appointment to the database
	@RequestMapping("/addAppointment")
	public ModelAndView addNewAppointment(@ModelAttribute Appointment appointment) {
		ModelAndView mav = new ModelAndView("appointments_form");
		if(appointment == null) {
			mav = new ModelAndView("/appointments_form");
			String message = "register new appointment failed";
			mav.addObject("message", message);
		}else {
			mav = new ModelAndView("appointments_form");
			as.addNewAppointment(appointment);
			String message = "register new appointment completed successefully";
			mav.addObject("message", message);
		}
		return mav;
	}
	
	//show edit appointment form
	@RequestMapping(value="/editAppointment{aptId}", method=RequestMethod.GET)
	public ModelAndView showAppEditForm(@PathVariable("aptId") Integer aptId) {
		ModelAndView mav = new ModelAndView("appointments_form");
		try {
			Appointment appToUpdate = as.getAppointmentById(aptId);
			mav.addObject("appointment", appToUpdate);
		}catch(Exception e) {
			String message = "appointment not found";
			mav.addObject("message", message);
		}
		return mav;
	}
	//edit appointment
	@RequestMapping("/editAppointment")
	public ModelAndView editApp(@ModelAttribute Appointment appointment) {
		ModelAndView mav = new ModelAndView("appointments_form");
		try {
			as.updateAppointmentById(appointment.getAptId(), appointment);
			String message = "appointment updated successefully";
			mav.addObject("message", message);
		}catch(Exception e) {
			String message = "appointment updated failed";
			mav.addObject("message", message);
		}
		return mav;
	}
	
	//delete appointment
	@RequestMapping(value="/deleteAppointment{aptId}", method=RequestMethod.GET)
	public ModelAndView deleteApp(@PathVariable("aptId") Integer aptId) {
		ModelAndView mav = new ModelAndView("appointments");
		List<Appointment> appointmentsList = new ArrayList<Appointment>();
		try {
			as.deleteAppointmentById(aptId);
			appointmentsList = as.getAllAppointments();
			mav.addObject("appointmentsList", appointmentsList);
		}catch(Exception e) {
			System.out.print("delete appointment failed");
		}
		return mav;
	}
}
