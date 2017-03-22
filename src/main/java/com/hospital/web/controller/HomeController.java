package com.hospital.web.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.hospital.web.composite.Complex;
import com.hospital.web.domain.ContextDTO;

@Controller
@SessionAttributes("context")
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	// @Autowired ContextDTO context;
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(HttpSession session) {
		ContextDTO context = new ContextDTO();
		logger.info("Welcome", "home");
		context.setPath(Complex.context());
		context.setCss(Complex.context()+"/resources/css");
		context.setImg(Complex.context()+"/resources/img");
		context.setJs(Complex.context()+"/resources/js");
		session.setAttribute("context", context);
		return "index";
	}
	@RequestMapping(value="/home")
	public String home(){
		return "common/main";
	}
}
