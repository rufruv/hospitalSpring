package com.hospital.web.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hospital.web.domain.Article;
import com.hospital.web.domain.Patient;
import com.hospital.web.mapper.Mapper;

@Service
public class BoardService {
	private static final Logger logger = LoggerFactory.getLogger(BoardService.class);
	@Autowired Mapper mapper;
	@Transactional
	@SuppressWarnings("unchecked")
	public List<Article> boardlist(Map<?,?> paramMap) throws Exception {
		IListService service = (map)->mapper.articleList(map);
		logger.info("BoardService - Boardlist : {} ", "ENTER");
		return (List<Article>) service.excute(paramMap);
	}
	public Integer getTheNumberOfArticles(Map<?, ?>p) throws Exception{
		IGetService s=(m)->mapper.count(p);
		Integer x=(Integer) s.excute(p);
		return x;
	}
	
}
