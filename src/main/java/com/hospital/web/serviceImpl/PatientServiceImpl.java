package com.hospital.web.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.web.domain.PatientDTO;
import com.hospital.web.mapper.PatientMapper;
import com.hospital.web.service.PatientService;
@Service
public class PatientServiceImpl implements PatientService{
	private static final Logger logger = LoggerFactory.getLogger(PatientServiceImpl.class);
	@Autowired PatientMapper mapper;
	@Autowired PatientDTO session;
	@Override
	public int join(PatientDTO patient) throws Exception {
		logger.info("PatientServiceImpl - insert : {} ", "ENTER SUCCESS!");
		return mapper.insert(patient);
		
	}

	@Override
	public PatientDTO findById(String id) throws Exception {
		logger.info("PatientServiceImpl - login : {} ", "ENTER SUCCESS!");
		return mapper.selectById(id);
	}

	@Override
	public PatientDTO login(PatientDTO patient) throws Exception {
		logger.info("PatientServiceImpl - login : {} ", "ENTER SUCCESS!");
		
		return mapper.selectById(patient.getPatID());
	}
	@Override
	public boolean logout() throws Exception {
		logger.info("PatientServiceImpl - logout : {} ", "ENTER SUCCESS!");
		return true;
	}
	@Override
	public int change(PatientDTO patient) throws Exception{
		logger.info("PatientServiceImpl - change : {} ", "ENTER SUCCESS!");
		return mapper.update(patient);
	}

	@Override
	public int remove(PatientDTO patient) throws Exception{
		logger.info("PatientServiceImpl - remove : {} ", "ENTER SUCCESS!");
		return mapper.delete(patient);
	}

	@Override
	public String getBirth(String patJumin) {
		logger.info("PatientServiceImpl - getBirth : {} ", "ENTER SUCCESS!");
		
		int year = Integer.parseInt(/*session.getPatJumin().substring(0,2)*/"");
		int month = Integer.parseInt(/*session.getPatJumin().substring(2,4)*/"");
		int day = Integer.parseInt(/*session.getPatJumin().substring(4,6)*/"");
		String temp = String.format(/*"19%d년 %d월 %d일", year,month,day)*/"");
		return temp;
	}
	@Override
	public String getAge(String patJumin) {
		logger.info("PatientServiceImpl - getAge : {} ", "ENTER SUCCESS!");
		return String.valueOf(117-Integer.parseInt(/*session.getPatJumin().substring(0,2))+1)+*/"세"));
	}

	@Override
	public PatientDTO getSession() {
		logger.info("PatientServiceImpl - insgetSessionert : {} ", "ENTER SUCCESS!");
		return null;
	}

	@Override
	public int count() throws Exception{
		return mapper.count();
	}
}
