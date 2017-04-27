package com.hospital.web.service;

import java.util.List;
import java.util.Map;

@org.springframework.stereotype.Service
@FunctionalInterface
public interface IListService {
	public List<?> excute(Map<?,?>map) throws Exception;
	
	
}
