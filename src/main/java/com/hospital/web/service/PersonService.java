package com.hospital.web.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.web.controller.PermissionController;
import com.hospital.web.domain.Admin;
import com.hospital.web.domain.Article;
import com.hospital.web.domain.Doctor;
import com.hospital.web.domain.Info;
import com.hospital.web.domain.Nurse;
import com.hospital.web.domain.Patient;
import com.hospital.web.domain.Person;
import com.hospital.web.mapper.Mapper;

@Service
public class PersonService {
	private static final Logger logger = LoggerFactory.getLogger(PersonService.class);
	@Autowired Mapper mapper;
	
	public Patient getPatient(Map<?, ?> paramMap) throws Exception{
		IGetService service=(map)->mapper.findPatient(map);
		return (Patient) service.excute(paramMap);
	}
	public Doctor getDoctor(Map<?, ?> paramMap) throws Exception{
		IGetService service=(map)->mapper.findDoctor(map);
		return (Doctor) service.excute(paramMap);
		
	}
	public Nurse getNurse(Map<?, ?> paramMap) throws Exception{
		IGetService service=(map)->mapper.findNurse(map);
		return (Nurse) service.excute(paramMap);
	}
	public Map<?,?> postPatient(Object target){
		Map<?,?>map=new HashMap<>();
		Person<?> person =new Person<Info>(new Patient());
		Patient patient=(Patient) person.getInfo();
		patient.getId();
		logger.info("PersonController() {}", patient.getId());
		patient.getGen();
		patient.setJob("환자");
		patient.getJumin();
		patient.getName();
		/*	patient.setId(id);
		patient.setPass(password);
		patient.setName(name);
		patient.setEmail(email);
		patient.setAddr(addr);
		patient.setGen(gen);
		patient.setJob(job);
		patient.setJumin(jumin);
		patient.setDocID(docID);
		patient.setNurID(nurID);
		patient.setPhone(phone);*/
		logger.info("PersonController () {}",patient+"===update진입===");
		return map;
		
	}
	public Map<?,?> postDoctor(Object target){
		Map<?,?>map=new HashMap<>();
		Person<?> person =new Person<Info>(new Doctor());
		Doctor doctor=(Doctor) person.getInfo();
		doctor.getId();
		logger.info("PersonController() {}", doctor.getId());
		doctor.getGen();
		doctor.getName();
		/*	patient.setId(id);
		patient.setPass(password);
		patient.setName(name);
		patient.setEmail(email);
		patient.setAddr(addr);
		patient.setGen(gen);
		patient.setJob(job);
		patient.setJumin(jumin);
		patient.setDocID(docID);
		patient.setNurID(nurID);
		patient.setPhone(phone);*/
		logger.info("PersonController () {}",doctor+"===update진입===");
		return map;
	}
	public Map<?,?> postNurse(Object target){
		Map<?,?>map=new HashMap<>();
		Person<?> person =new Person<Info>(new Patient());
		Patient patient=(Patient) person.getInfo();
		patient.getId();
		logger.info("PersonController() {}", patient.getId());
		patient.getGen();
		patient.setJob("환자");
		patient.getJumin();
		patient.getName();
		/*	patient.setId(id);
		patient.setPass(password);
		patient.setName(name);
		patient.setEmail(email);
		patient.setAddr(addr);
		patient.setGen(gen);
		patient.setJob(job);
		patient.setJumin(jumin);
		patient.setDocID(docID);
		patient.setNurID(nurID);
		patient.setPhone(phone);*/
		logger.info("PersonController () {}",patient+"===update진입===");
		return map;
	}
	public Map<?,?> postAdmin(Object target){
		Map<?,?>map=new HashMap<>();
		Person<?> person =new Person<Info>(new Patient());
		Patient patient=(Patient) person.getInfo();
		patient.getId();
		logger.info("PersonController() {}", patient.getId());
		patient.getGen();
		patient.setJob("환자");
		patient.getJumin();
		patient.getName();
		/*	patient.setId(id);
		patient.setPass(password);
		patient.setName(name);
		patient.setEmail(email);
		patient.setAddr(addr);
		patient.setGen(gen);
		patient.setJob(job);
		patient.setJumin(jumin);
		patient.setDocID(docID);
		patient.setNurID(nurID);
		patient.setPhone(phone);*/
		logger.info("PersonController () {}",patient+"===update진입===");
		return map;
	}

	public Patient getPatient(){
		Patient patient=new Patient();
		return patient;
	}
	
	public Nurse getNurse(){
		Nurse nurse=new Nurse();
		return nurse;
	}

	public Doctor getDoctor(){
		Doctor doctor=new Doctor();
		return doctor;
	}

	public Admin getAdmin(){
		Admin admin=new Admin();
		return admin;
	}

	public List<?> getPatients(){
		Patient patient=new Patient();
		List<?>list=new ArrayList<>();
		return list;
	}
	
	public List<?> getNurses(){
		Nurse nurse=new Nurse();
		List<?>list=new ArrayList<>();
		return list;
	}

	public List<?> getDoctors(){
		Doctor doctor=new Doctor();
		List<?>list=new ArrayList<>();
		return list;
	}

	public List<?> getAdmins(){
		Admin admin=new Admin();
		List<?>list=new ArrayList<>();
		return list;
	}

	public Map<?, ?> putPatient(Object target){
		Patient patient=new Patient();
		Map<?, ?>map=new HashMap<>();
		return map;
	}

	public Map<?, ?> putNurse(Object target){
		Nurse nurse=new Nurse();
		Map<?, ?>map=new HashMap<>();
		return map;
	}

	public Map<?, ?> putDoctor(Object target){
		Doctor doctor=new Doctor();
		Map<?, ?>map=new HashMap<>();
		return map;
	}

	public Map<?, ?> putAdmin(Object target){
		Admin admin=new Admin();
		Map<?, ?>map=new HashMap<>();
		return map;
	}
	public int exist(Map<?, ?> paramMap) throws Exception {
		logger.info("PersonController -- exist 접근() {}");
		//IGetService exist= (map)->mapper.exist(paramMap);
		logger.info("PersonController -- exist 메소드 실행() {}");
		return mapper.exist(paramMap);
		// TODO Auto-generated method stub
		
	}

}
