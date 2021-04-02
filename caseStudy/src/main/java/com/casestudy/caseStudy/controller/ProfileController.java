package com.casestudy.caseStudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProfileController {
	
	@RequestMapping("/profile")
	public ModelAndView showProfile() {
		ModelAndView mav = new ModelAndView("profile");
		return mav;
	}
	
	@RequestMapping("edit_profile")
	public ModelAndView showeditProfileForm() {
		ModelAndView mav = new ModelAndView("profile");
		return mav;
	}
}
