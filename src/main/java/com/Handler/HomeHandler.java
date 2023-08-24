package com.Handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Entity.HomeBean;
import com.Service.HomeService;

@Controller
public class HomeHandler {
	@Autowired
	HomeService homeService;

	@RequestMapping(path = "/loginhandler", method = RequestMethod.POST)
	public String loginHandler(@ModelAttribute HomeBean homeBean, HttpServletResponse response, Model model,
			HttpSession httpSession, HttpSession session) {
		httpSession.setAttribute("studentObj", homeBean);
		homeService.matchLogin(homeBean, response, session);
		model.addAttribute("error", "Please Enter Proper Id And Password");
		return "Login";

	}

	@RequestMapping(path = "/regesterhandler", method = RequestMethod.POST)
	public String regesterHandler(@ModelAttribute HomeBean homeBean, Model model, HttpServletResponse response,
			HttpServletRequest request) {
		homeService.insert(homeBean, response, request);
		model.addAttribute("error", "Password and Confrom Password Not Match");
		return "Register";

	}
}
