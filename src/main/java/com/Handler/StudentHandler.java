package com.Handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.Entity.AnswerBean;
import com.Entity.DailyTaskBean;
import com.Entity.EnquiryBean;
import com.Entity.FeesReceiptBean;
import com.Entity.InterviewDetailBean;
import com.Entity.RegisterBean;
import com.Service.StudentService;

@Controller
public class StudentHandler {
	@Autowired
	StudentService service;

	@PostMapping("/enquirY")
	public String enquiryData(@ModelAttribute EnquiryBean enquiryBean, HttpSession session, HttpServletRequest request,
			HttpServletResponse response, Model model) {
		service.enquirySave(enquiryBean, session, request, response);
		model.addAttribute("succefull", "Submited !!!!!");
		return "Enquiry";

	}

	@PostMapping("/interviewQ")
	public String interviewDetails(@ModelAttribute InterviewDetailBean interviewDetailBean, HttpServletRequest request,
			HttpSession httpSession, HttpServletResponse response) {
		service.interviewDetailsSave(interviewDetailBean, request, httpSession, response);
		return "InterViewDetails";

	}

	@PostMapping("/feesrec")
	public String feesReceipt(@ModelAttribute FeesReceiptBean feesReceiptBean, HttpServletRequest request,
			HttpSession session, HttpServletResponse response) {
		service.feesRecepitSave(feesReceiptBean, request, session, response);
		return "FeesDetails";

	}

	@PostMapping("/dailyTask")
	public String dailyTask(@ModelAttribute DailyTaskBean dailyTaskBean, HttpServletRequest request,
			HttpSession httpSession, HttpServletResponse response) {
		service.dailyTaskSave(dailyTaskBean, request, httpSession, response);
		return "DailyTask";

	}

	@PostMapping("/answer")
	public String Answer(@ModelAttribute AnswerBean answerBean, HttpServletRequest request, HttpSession httpSession,
			HttpServletResponse response) {
		service.answerSave(answerBean, request, httpSession, response);
		return "loginhome";

	}

	@PostMapping("/studentregister")
	public String studentRegister(@ModelAttribute RegisterBean registerBean,
			/* @RequestParam("imageData") CommonsMultipartFile seleced, */
			@RequestParam("profilephoto") CommonsMultipartFile clicked, HttpSession session, HttpServletRequest request,
			HttpServletResponse response) {

		registerBean.setProfileImage(clicked.getBytes());
		/*
		 * if (registerBean.getProfileImage() == null) {
		 * registerBean.setProfileImage(clicked.getBytes()); }
		 */

		service.studentRegisterSave(registerBean, session, request, response);
		return "StudentRegistration";

	}

	@PostMapping("/logout")
	public String studentLogout(HttpSession session) {
		service.logout(session);
		return "home1";

	}

}
