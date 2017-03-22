package com.hospital.web.composite;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public class Complex {
	public static String context(){
		return ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest().getContextPath();
	}
}
