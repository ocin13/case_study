package com.casestudy.caseStudy.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Paths;
import java.util.List;


import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.casestudy.caseStudy.entityModels.Doctor;
import com.casestudy.caseStudy.services.DoctorService;
import com.casestudy.caseStudy.services.DoctorServiceImp;





@Controller
public class DoctorsController {
	
	public static String uploadDirectory = System.getProperty("user.dir") + "/uploads";
	
	@Autowired
	DoctorServiceImp ds;
	
	//display doctors page
		@RequestMapping("/doctors")
		public ModelAndView showDoctorsList() {
			ModelAndView mav = new ModelAndView("doctors");
			List<Doctor> doctorsList = ds.getAllDoctors();
			mav.addObject("doctorsList", doctorsList);
			return mav;
		}
		//display new doctor form
		@GetMapping("/newDoctor")
		public ModelAndView showDoctorForm() {
			ModelAndView mav = new ModelAndView("doctor_form");
			return mav;
		}
		//insert new doctor to the database 
		@PostMapping("/addDoctor")
		public @ResponseBody ModelAndView createDoctor(@Valid Doctor doctor,
				@RequestParam("firstName") String firstName, @RequestParam("lastName")  String lastName, @RequestParam("speciality") String speciality,
				@RequestParam("userName")  String userName,@RequestParam("email")  String email,
				@RequestParam("password")  String password,@RequestParam("dateOfBirth")  String dateOfBirth,
				@RequestParam("gender")  String gender,@RequestParam("street")  String street,
				@RequestParam("apt")  String apt,@RequestParam("city")  String city,
				@RequestParam("state")  String state,@RequestParam("zip")  Integer zip,
				@RequestParam("phone")  Long phone,final @RequestParam("file") MultipartFile file) {
			    ModelAndView mav = new ModelAndView("doctor_form");
			try {
				HttpHeaders headers = new HttpHeaders();
				if (doctor == null) {
					mav =  new ModelAndView("doctor_form");
					
				}
				
				String fileName = file.getOriginalFilename();
				String filePath = Paths.get(uploadDirectory, fileName).toString();
				String fileType = file.getContentType();
				long size = file.getSize();
				String fileSize = String.valueOf(size);

				
				// Save the file locally
				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(new File(filePath)));
				stream.write(file.getBytes());
				stream.close();

				doctor.setFirstName(firstName);
				doctor.setLastName(lastName);
				doctor.setSpeciality(speciality);
				doctor.setUserName(userName);
				doctor.setEmail(email);
				doctor.setPassword(password);
				doctor.setDateOfBirth(dateOfBirth);
				doctor.setGender(gender);
				doctor.setStreet(street);
				doctor.setApt(apt);
				doctor.setCity(city);
				doctor.setState(state);
				doctor.setZip(zip);
				doctor.setPhone(phone);
				doctor.setFileName(fileName);
				doctor.setFilePath(filePath);
				doctor.setFileType(fileType);
				doctor.setFileSize(fileSize);
				
				boolean status = ds.addNewDoctor(doctor);
				if (status) {
					
					headers.add("Employe Saved With Image - ", fileName);
					mav =  new ModelAndView("doctor_form");
					String message = "new doctor registered successfully";
					mav.addObject("message", message);
					
				}
			} catch (Exception e) {
				e.printStackTrace();
				mav = new ModelAndView("doctor_form");
				String message = "new doctor register failed";
				mav.addObject("message", message);
			}
			return mav;
		}
		
		//delete an existing doctor from the database
		@RequestMapping(value = "/deleteDoctor{docId}", method = RequestMethod.GET)
		public ModelAndView delete(@PathVariable("docId") Integer docId) {
			ModelAndView mav = new ModelAndView("doctors");
			ds.deleteDoctorById(docId);
			List<Doctor> doctorsList = ds.getAllDoctors();
			mav.addObject("doctorsList", doctorsList);
			return mav;
		}
	
		//show edit form
		@RequestMapping(value = "/editDoctor{docId}", method = RequestMethod.GET)
		public ModelAndView edit(@PathVariable("docId") Integer docId) {
			ModelAndView mav = new ModelAndView("doctor_form");
				Doctor doctorToUpdate = ds.getDoctorById(docId);
				mav.addObject("doctor", doctorToUpdate);
			
			return mav;
		}
		
		//register new updated doctor information
		@RequestMapping(value = "/editDoctor", method = RequestMethod.POST)
		public ModelAndView editDoctor(@ModelAttribute Doctor doctor) {
			ModelAndView mav = new ModelAndView("doctor_form");
			ds.updateDoctorById(doctor.getDocId(), doctor);
			String message = "Doctor updated successfully";
			mav.addObject("message", message);
			return mav;
		}
}