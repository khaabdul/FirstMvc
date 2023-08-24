package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/login")
	private String login() {
		return "Login";

	}

	@RequestMapping("/register")
	private String register() {
		return "Register";

	}

	@RequestMapping("/courses")
	private String courses() {
		return "Courses";

	}

	@RequestMapping("/home")
	private String home() {
		return "home1";

	}
}
