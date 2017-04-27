package com.hospital.web.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.hospital.web.domain.Chart;
import com.hospital.web.domain.Patient;
import com.hospital.web.mapper.Mapper;
import com.hospital.web.service.PersonService;
import com.hospital.web.service.ChartService;
@SessionAttributes("storage")
@RestController
public class ChartController {
	private static final Logger logger = LoggerFactory.getLogger(ChartController.class);
	@Autowired Mapper mapper;
	@Autowired Patient patient;
	@Autowired PersonService personService;
	@Autowired ChartService chartService;
	@RequestMapping(value="/get/chart",method=RequestMethod.POST, consumes="application/json")
	public @ResponseBody Map<?,?> getChart(
			@RequestBody Patient p) throws Exception {
		logger.info("TreatmentController getChart() {}", "OK");
		Map<String, Object>map=new HashMap<>();
		map.put("id", p.getId());
		logger.info("TreatmentController 넘어온 아이디() {}", p.getId());
		List<Chart> list= chartService.ChartList(map);
		map.clear();
		
		if(list.isEmpty()){
			map.put("result", "fail");
		}else{
			map.put("result", "success");
			map.put("patient", personService.getPatient(map));
			map.put("list", chartService.ChartList(map));
		}
		
		return map;
	}
	public @ResponseBody Map<?, ?> seesionChartId(
			@RequestBody Chart c, HttpSession session){
		Map<String, Object> map=new HashMap<>();
		if(!c.getChartId().equals("")){
			session.setAttribute("storage", c.getChartId());
			map.put("result", "success");
		}else{
			map.put("result","fail");
		}
		return map;
	}
	@RequestMapping(value="/post/chart/image")
	public @ResponseBody Map<?, ?> fileUpload(MultipartHttpServletRequest request ,HttpSession session) throws Exception{
		logger.info("TreatmentControllerfileUpload() {} !!", "ENTER");
		Map<String, Object>map = new HashMap<>();
		Iterator<String> it =request.getFileNames();
		if(it.hasNext()){
			MultipartFile file=request.getFile(it.next());
			logger.info("file upload result:!!", "success");
			logger.info("upload file !!", file.getOriginalFilename());
			String path="";
			if(file!=null){
				System.out.println("upload file name"+file.getName());
				System.out.println("upload file size"+file.getSize());
				System.out.println("upload file exist"+file.isEmpty());
				System.out.println("upload file original name"+file.getOriginalFilename());
				System.out.println("upload"+file.getOriginalFilename());
				String rootPath= request.getSession().getServletContext().getRealPath("/");
				String uploadPath = "resources/img/";
				String filename= file.getOriginalFilename();
				File dest =new File(rootPath + uploadPath + filename);
				file.transferTo(dest);
				map.put("result", "success");
				
				}else{
					logger.info("file upload result:!!", "fail");
					map.put("result", "fail");
				}
				
			}
	
		return map;
		
	}
}
