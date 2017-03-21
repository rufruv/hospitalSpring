package com.hospital.web.service;

import org.springframework.stereotype.Component;

import com.hospital.web.domain.DoctorDTO;
@Component
public interface DoctorService {
	public int join(DoctorDTO DTO) throws Exception;
	public DoctorDTO findbyId(String id) throws Exception;
	public DoctorDTO login(DoctorDTO DTO) throws Exception;
	public boolean logout() throws Exception;
	public int change(DoctorDTO DTO) throws Exception;
	public int remove(DoctorDTO DTO) throws Exception;
}
