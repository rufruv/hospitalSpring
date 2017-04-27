package com.hospital.web.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import com.hospital.web.composite.Complex;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	// @Autowired ContextDTO context;
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
		logger.info("Welcome {} !!", "home");
		model.addAttribute("context", Complex.ContextFactory.create());
		logger.info("경로:{} !!", Complex.ContextFactory.create());
		return "index";
	}
	@RequestMapping(value="/home")
	public String home(){
		logger.info("Welcome {} !!", "main");
		return "public:common/container";
	}
	@RequestMapping(value="/permission/form")
	public String login(){
		return "common/permission.jsp"; 
	}
}
