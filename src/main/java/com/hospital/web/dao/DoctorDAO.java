package com.hospital.web.dao;

import org.springframework.stereotype.Component;

import com.hospital.web.domain.DoctorDTO;
@Component
public interface DoctorDAO {
	public int insert(DoctorDTO DTO) throws Exception;
	public DoctorDTO selectById(String id) throws Exception;
	public int update(DoctorDTO DTO) throws Exception;
	public int delete(DoctorDTO DTO) throws Exception;
}
