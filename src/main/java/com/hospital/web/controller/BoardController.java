package com.hospital.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/board")
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	@RequestMapping("/list")
	public String goList(){
		logger.info("BoardController - goList : {} ", "ENTER SUCCESS!");
		return "public:board/containerList";
	}
	@RequestMapping("/find")
	public String find(@RequestParam(value="search", required=false) String search,
			           @RequestParam(value="pageNO", defaultValue="1") String pageNO){
		logger.info("BoardController - goList : {} ", "ENTER SUCCESS!");
		
		return "public:board/containerList";
	}
}
