package com.hospital.web.serviceImpl;

import org.springframework.stereotype.Service;

import com.hospital.web.domain.DoctorDTO;
import com.hospital.web.service.DoctorService;
@Service
public class DoctorServiceImpl implements DoctorService{
	@Override
	public int join(DoctorDTO DTO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public DoctorDTO findbyId(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DoctorDTO login(DoctorDTO DTO) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean logout() throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int change(DoctorDTO DTO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int remove(DoctorDTO DTO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
}
