package com.hospital.web.service;

import java.util.Map;

@org.springframework.stereotype.Service
@FunctionalInterface
public interface IGetService {
	public Object excute(Map<?, ?>map) throws Exception;
	
}
