package com.hospital.web.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hospital.web.domain.Command;
import com.hospital.web.domain.Person;
import com.hospital.web.mapper.Mapper;


@Controller
public class PersonController {
	private static final Logger logger = LoggerFactory.getLogger(PersonController.class);
	Command command;
	@Autowired Mapper mapper;
	
	@RequestMapping(value="/register/{type}",method=RequestMethod.POST)
	public String register(@PathVariable String type, @RequestBody Map<String,Object>map) throws Exception {
		logger.info("PersonController register() {}", "OK");
		if(type.equals("")){type="patient";}
		map.put("type", type);
		Person<?> person=command.process(map).getPersonInfo();
		int result=0;
		switch (type) {
		case "patient":
			result=mapper.registPatient(person);
			break;
		case "doctor":
			result=mapper.registDoctor(person);
			break;
		case "nurse":
			result=mapper.registNurse(person);
			break;
		default:
			break;
		}
		String move="";
		move=result==1?"public:common/loginForm":"redirect:common/main";
		return move;
	}
	@RequestMapping("/detail/{docID}")
	public String detail(@PathVariable String docID){
		logger.info("DoctorController - goLogin : {} ", "ENTER SUCCESS!");
		if(docID.equals("")){return "redirect:/{permission}/login";}
		return "doctor:doctor/containerDetail";
	}
}