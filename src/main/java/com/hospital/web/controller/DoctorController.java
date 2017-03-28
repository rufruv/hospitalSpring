package com.hospital.web.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/doctor")
public class DoctorController {
	private static final Logger logger = LoggerFactory.getLogger(DoctorController.class);
	@RequestMapping("/login")
	public String goLogin(){
		logger.info("DoctorController - goLogin : {} ", "ENTER SUCCESS!");
		return "public:common/loginForm";
	}
	/*@RequestMapping("/detail/{docID}")
	public String detail(@PathVariable String docID){
		logger.info("DoctorController - goLogin : {} ", "ENTER SUCCESS!");
		return "doctor:doctor/containerDetail";
	}*/
}