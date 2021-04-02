package com.casestudy.caseStudy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.casestudy.caseStudy.entityModels.Company;
import com.casestudy.caseStudy.entityModels.User;
import com.casestudy.caseStudy.services.CompanyServiceImp;

@Controller
public class HomeController {
	
	@Autowired
	CompanyServiceImp cs;
	//display the home page
		@RequestMapping("/home")
		public ModelAndView home() {
			return new ModelAndView("home");
		}
		@RequestMapping("/settings")
		public ModelAndView settings() throws Exception {
			ModelAndView mav =  new ModelAndView("settings");
			Company company = cs.getCompany();
			mav.addObject("company", company);
			return mav;
		}
		@RequestMapping("/saveSettings")
		public ModelAndView saveSettings(@ModelAttribute Company company) throws Exception {
			ModelAndView mav =  new ModelAndView("settings");
			cs.updateCompanyInformation(company, company.getId());
			mav.addObject("company", company);
			return mav;
		}
		
		
	

	    
}
