package com.hospital.web.service;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hospital.web.domain.Chart;
import com.hospital.web.mapper.Mapper;

@Service
public class ChartService {
	private static final Logger logger = LoggerFactory.getLogger(ChartService.class);
	@Autowired Mapper mapper;
	@SuppressWarnings("unchecked")
	public List<Chart> ChartList(Map<?, ?> paramMap) throws Exception{
		IGetService service=(map)->mapper.findChart(paramMap);
		List<Chart> list=(List<Chart>) service.excute(paramMap);
		logger.info("ChartService-ChartList() {} ", list);
		return list;
	}
}
