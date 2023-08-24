package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentControler {
	@RequestMapping("/enquiry")
	public String enquiry() {
		return "Enquiry";
	}

	@RequestMapping("/interviewdetails")
	public String interViewDetails() {
		return "InterViewDetails";
	}

	@RequestMapping("/studentregister")
	public String studentRegister() {
		return "Register";
	}

	@RequestMapping("/feesDetails")
	public String feesDetails() {
		return "FeesDetails";
	}

	@RequestMapping("/dailytask")
	public String dailyTask() {
		return "DailyTask";
	}

	@RequestMapping("/studentregistration")
	public String studentRegistration() {
		return "StudentRegistration";
	}

	@RequestMapping("/loginhome")
	public String loginHome() {
		return "LoginHome";
	}

	@RequestMapping("/profile")
	public String profil() {
		return "Profile";
	}
}
