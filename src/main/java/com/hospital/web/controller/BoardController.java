package com.hospital.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.web.domain.Article;
import com.hospital.web.domain.Command;
import com.hospital.web.domain.Command.Pagination;
import com.hospital.web.mapper.Mapper;
import com.hospital.web.service.BoardService;
import com.hospital.web.service.IListService;
import com.hospital.web.service.PersonService;

@RestController
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	@Autowired Mapper mapper;
	@Autowired Article article;
	@Autowired BoardService boardService;
	@RequestMapping("/list/bbs/{pageNumber}")
	private @ResponseBody Map<?,?> articleList(
			@PathVariable String pageNumber) throws Exception{
		logger.info("BoardController - articleList : {} ", "ENTER");
		logger.info("넘어온 페이지 넘버 is {} ", pageNumber);
		Map<String, Object>map=new HashMap<>();
/*		article.setTitle("Hello");
		article.setContent("안녕 방가");
		article.setReadCount("7");
		article.setRegDate("2017-04-03");*/
	
		map.put("group", "Article");
		Integer theNumberOfRows=boardService.getTheNumberOfArticles(map);
		map.put("theNumberOfRows", theNumberOfRows);
		map.put("pageNumber", pageNumber);
		Command command = new Command();
		Pagination p=command.process(map).getPageInfo();
		logger.info("startRow is {} ", p.getStartRow());
		Integer startRow=p.getStartRow();
		Integer endRow=p.getEndRow();
		map.put("startRow", startRow);
		map.put("endRow", endRow);
		List<Article> list= boardService.boardlist(map);
		logger.info("articleList is {} ", list);
		map.put("list", list);
		map.put("count", p.getTheNumberOfRows());
		map.put("prevBlock", p.getPrevBlock());
		map.put("startPaget", p.getStartPage());
		map.put("endStart", p.getEndPage());
		map.put("pageNumber", p.getPageNumber());
		map.put("nextBlock", p.getNextBlock());
		map.put("theNumberOfPages", p.getTheNumberOfPages());
		return map;
}
}
