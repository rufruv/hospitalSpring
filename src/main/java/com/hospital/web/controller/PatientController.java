package com.hospital.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hospital.web.domain.Patient;
import com.hospital.web.mapper.PatientMapper;
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
@Controller
@RequestMapping("/patient")
public class PatientController {
	private static final Logger logger = LoggerFactory.getLogger(PatientController.class);
	@Autowired Patient patient;
	@Autowired PatientMapper mapper;
	@RequestMapping("/join")
	public String Join(){
		logger.info("PatientController - goJoin : {} ", "ENTER SUCCESS!");
		return "public:patient/registerForm";
	}
	@RequestMapping("/login")
	public String Login(){
		logger.info("PatientController - goLogin : {} ", "ENTER SUCCESS!");
		return "public:common/loginForm";
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String goLogin(@RequestParam("id") String id, @RequestParam("password") String password ,Model model) throws Exception{
		logger.info("PatientController - goLogin() {}", "POST");
		logger.info("PatientController - id, pw : {}", id+","+password);
		patient.setPatID(id);
		patient.setPatPass(password);
		CRUD.Service ex = new CRUD.Service() {
			
			@Override
			public Object execute(Object o) throws Exception {
				logger.info("===ID ? : {}===", o);
				return mapper.exist(id);
			}
		};
		Integer count = (Integer) ex.execute(id);
		logger.info("ID exist? : {}", count);
		
		String movePlace = "";
		if(count == 0){
			logger.info("DB RESULT : {}", "ID not exist");
			movePlace = "public:common/loginForm";
		}else{
			CRUD.Service service = new CRUD.Service() {
				
				@Override
				public Object execute(Object o) throws Exception {
					return mapper.selectById(id);
				}
			};
			patient = (Patient) service.execute(patient);
			
			if(patient.getPatPass().equals(password)){
				logger.info("DB RESULT : {}", "success");
				model.addAttribute("name", patient.getPatName());
				model.addAttribute("job", patient.getPatJob());
				model.addAttribute("gen", patient.getPatGen());
				model.addAttribute("phoneNO", patient.getPatPhone());
				model.addAttribute("addr", patient.getPatAddr());
				model.addAttribute("doctor", patient.getDocID());
				movePlace = "patient:patient/containerDetail";
			}else{
				logger.info("DB RESULT : {}", "password not match");
				movePlace = "public:common/loginForm";
			}
			
		}
		return movePlace;
	}
	@RequestMapping("/doctor/{docID}")
	public String getDoctorInfo(@PathVariable String docID){
		logger.info("patientController - getDoctorInfo : {} ", "ENTER SUCCESS!");
		logger.info("patientController - docID = : {} ", docID);
		return "patient:patient/doctorInfo";
	}
}
