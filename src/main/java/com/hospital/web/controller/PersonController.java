package com.hospital.web.controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.web.domain.Admin;
import com.hospital.web.domain.Command;
import com.hospital.web.domain.Doctor;
import com.hospital.web.domain.Enums;
import com.hospital.web.domain.Info;
import com.hospital.web.domain.Nurse;
import com.hospital.web.domain.Patient;
import com.hospital.web.domain.Person;
import com.hospital.web.mapper.Mapper;
import com.hospital.web.service.IGetService;
import com.hospital.web.service.PersonService;

import lombok.experimental.PackagePrivate;

 
@RestController
public class PersonController {
	private static final Logger logger = LoggerFactory.getLogger(PersonController.class);
	@Autowired Mapper mapper;
	@Autowired Patient patient;
	@Autowired PersonService personService;
	//@SuppressWarnings("rawtypes")
	@RequestMapping(value="/post/patient",method=RequestMethod.POST,consumes="application/json")
	public @ResponseBody Map<?,?> register(
			@RequestBody Patient p) throws Exception {
		logger.info("PersonController register() {}", "OK");
		Map<String, String>map=new HashMap<>();
		//if(group.equals("")){group="patient";}
		String move="";
		int result=0;
		//String name=paramMap.get("name");
	/*	switch (group) {
		case "patient":
			
			//map=personService.postPatient(target);
			//map.put("name", name);
			break;
		case "doctor":
			//map=personService.postDoctor(target);
			break;
		case "nurse":
			//map=personService.postNurse(target);
			break;
		case "admin" :
			//map=personService.postAdmin(target);
			break;
		default:
			break;
		}*/
		map.put("name", p.getName());
		return map;
	}
	
	@RequestMapping("/get/{group}/{target}")
	public @ResponseBody Object get(
			@PathVariable("group") String group,
			@PathVariable("target") String target) throws Exception{
		logger.info("PersonController - goLogin : {} ", "ENTER SUCCESS!");
		Object o=null;
		Map<String, Object>map=new HashMap<>();
		switch (group) {
		case "patient":
			logger.info("group.eqauls({})", group);
			o=personService.getPatient();
			/*patient.setId("hong");
			patient.setName("홍길동");
			patient.setPass("1234");*/
			map.put("group", patient.getGroup());
			map.put("key", Enums.PATIENT.val());
			map.put("value", target);
			o=personService.getPatient(map);
			logger.info("group.eqauls({})", group);
			break;
		case "doctor":
			logger.info("환자 조회 결과 이름 ({})", ((Patient) o).getName());
			o=personService.getDoctor();	
			break;
		case "nurse":
			logger.info("group.eqauls({})", group);
			o=personService.getNurse();
			break;
		case "admin":
			logger.info("group.eqauls({})", group);
			o=personService.getAdmin();
			break;

		default:
			break;
		}
		return o;
	}

	@RequestMapping(value="/login", method=RequestMethod.POST,consumes="application/json")
	public @ResponseBody Map<?, ?> login(@RequestBody Map<String, String>paramMap) throws Exception{
		Map<String, Object>map=new HashMap<>();
		logger.info("PersonController() {} ", "ENTER");
		String id=paramMap.get("id");
		String pass=paramMap.get("pass");
		System.out.println("넘어온 id"+id);
		System.out.println("넘어온 pass"+pass);
		
		String[] gArr={"Patient/pat_id/"+id,
					  "Doctor/doc_id/"+id,
					  "Nurse/nur_id/"+id,
					  "Admin/adm_id/"+id};
		String target="";
		int rs=0;
		
		for(int i=0;i<gArr.length;i++){
			paramMap.put("group", gArr[i].split("/")[0]);
			paramMap.put("idType", gArr[i].split("/")[1]);
			paramMap.put("id", gArr[i].split("/")[2]);
			logger.info("PersonController() {} ", gArr[1]);
			rs=personService.exist(paramMap);
			logger.info("PersonController() {} ", rs);
			if(rs!=0){
				target=gArr[i];
				logger.info("PersonController() {} ", target);
				break;
			}
		}
		if(target.equals("")){
			map.put("result", "fail");
		}else{
			map.put("result", "success");
			String[] group=target.split("/");
			switch (group[0]) {
			case "Patient":
					map.put("group", group[0]);
					map.put("key",group[1]);
					map.put("value", group[2]);
					/*IGetService findPatient=(rsmap)->mapper.findPatient(map);
					Patient patient=(Patient) findPatient.excute(map);*/
					Patient patient=personService.getPatient(map);
					map.put("patient",patient);
					map.put("group","고객");
				break;
			case "Doctor":
				paramMap.put("group", "Doctor");
				paramMap.put("idType", "doc_id");
				personService.exist(paramMap);
				break;
			case "Nurse":
				paramMap.put("group", "Nurse");
				paramMap.put("idType", "nur_id");
				personService.exist(paramMap);
				break;
			case "Admin":
				paramMap.put("group", "Admin");
				paramMap.put("idType", "adm_id");
				personService.exist(paramMap);
				break;
			default:
				break;
			}
		}
		
		
		return map;
	}
	@RequestMapping(value="/list/{group}",method=RequestMethod.POST, consumes="application/json")
	public @ResponseBody List<?> list(
			@PathVariable String group,
			@RequestBody Command command){
			List<?>list=new ArrayList<>();
			switch(group){
			case "patient" : 
				list=personService.getPatients();
				break;
			case "doctor" :
				list=personService.getDoctors();
				break;
			case "nurse" :
				list=personService.getNurses();
				break;
			case "admin" :
				list=personService.getAdmins();
				break;
			default:break;
			}
		return list;
		
	}
	@RequestMapping(value="/put/{group}/",method=RequestMethod.POST, consumes="application/json")
	public @ResponseBody Map<?,?> put(@PathVariable String group, @SuppressWarnings("rawtypes")
			@RequestBody Person target){
			Map<?, ?>map=new HashMap<>();
			switch (group) {
			case "patient":
				map=personService.putPatient(target);
				break;
			case "doctor":
				map=personService.putDoctor(target);
				break;
			case "nurse":
				map=personService.putNurse(target);
				break;
			case "admin":
				map=personService.putAdmin(target);
				break;
			default:
				break;
			}
		return map;
		
	}

}