package com.hospital.web.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.web.dao.BoardDAO;
import com.hospital.web.domain.ArticleDTO;
import com.hospital.web.service.BoardService;
@Service
public class BoardServiceImpl implements BoardService{
	@Autowired BoardDAO dao;
	@Override
	public int add(ArticleDTO param) throws Exception{
		int rs = dao.insert(param);
		return rs;
	}

	@Override
	public ArticleDTO findOne(ArticleDTO param) throws Exception{
		ArticleDTO article = dao.selectBySeq(param);
		return article;
	}

	@Override
	public List<ArticleDTO> findSome(String[] param) throws Exception{
		List<ArticleDTO> listSome = new ArrayList<>();
		System.out.println("서비스에 넘어간 파라미터1:"+param[0]);
		System.out.println("서비스에 넘어간 파라미터1:"+param[1]);
		listSome = dao.selectByWord(param);
		System.out.println("서비스에서 본 리스트결과:"+listSome);
		return listSome;
	}

	@Override
	public List<ArticleDTO> list(int[] pageArr){
		List<ArticleDTO> listAll = dao.selectAll(pageArr);
		return listAll;
	}

	@Override
	public int update(ArticleDTO param) throws Exception{
		int rs = dao.update(param);
		return rs;
	}

	@Override
	public int delete(ArticleDTO param) throws Exception{
		int rs = dao.delete(param);
		return rs;
	}
	@Override
	public int count() {
		return dao.count();
	}
}
