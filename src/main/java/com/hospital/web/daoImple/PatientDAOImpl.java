package com.hospital.web.daoImple;

import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.hospital.web.dao.PatientDAO;
import com.hospital.web.domain.PatientDTO;
@Repository
public class PatientDAOImpl implements PatientDAO{
	@Override
	public int insert(PatientDTO patient) throws SQLException {
		String sql = String.format("INSERT INTO Patient(pat_id,nur_id,doc_id,pat_pass,pat_name,pat_gen,pat_jumin,pat_addr,pat_phone,pat_email,pat_job) VALUES('%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s')", "","","","","","","","","","","");
		int rs = 0;
		return rs;
	}

	@Override
	public PatientDTO selectById(String id) throws SQLException {
		PatientDTO member = new PatientDTO();
		
		return member;
	}

	/*@Override
	public boolean login(PatientDTO member) throws SQLException {
		boolean check = false;
		
		return check;
	}*/

	@Override
	public int update(PatientDTO member) throws SQLException {
		String sql = "";
		int rs=0;
		return rs;
	}
	@Override
	public int delete(PatientDTO member) throws SQLException {
		String sql = "";
		int rs=0;
		return rs;
	}

}
