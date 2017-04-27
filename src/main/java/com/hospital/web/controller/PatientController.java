package com.hospital.web.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.web.domain.Info;
import com.hospital.web.domain.Patient;
import com.hospital.web.domain.Person;
import com.hospital.web.mapper.Mapper;
import com.hospital.web.service.CRUD;
/**
 * =====================================
 * @file: Patient Controller
 * @date: 2017-03-28
 * @author: Jeon YH
 * @story:
 * @method:
 * join()
 * login()
 * =====================================
 * */
@RestController
@RequestMapping("/patient")
public class PatientController {
	private static final Logger logger = LoggerFactory.getLogger(PatientController.class);
	@Autowired Mapper mapper;
	@RequestMapping("/join")
	public String Join(){
		logger.info("PatientController - goJoin : {} ", "ENTER SUCCESS!");
		return "public:patient/registerForm";
	}
	
	@RequestMapping("/doctor/{docID}")
	public String getDoctorInfo(@PathVariable String docID){
		logger.info("patientController - getDoctorInfo : {} ", "ENTER SUCCESS!");
		logger.info("patientController - docID = : {} ", docID);
		return "patient:patient/doctorInfo";
	}
}
