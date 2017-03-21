package com.hospital.web.daoImple;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.hospital.web.dao.BoardDAO;
import com.hospital.web.domain.ArticleDTO;
@Repository
public class BoardDAOImpl implements BoardDAO {
	@Override
	public int insert(ArticleDTO param) throws Exception {
		String sql = String.format(
				"INSERT INTO Article(art_seq, id, title, contents, regdate, read_count) "
						+ "VALUES(art_seq.nextval, '%s', '%s', '%s', '%s', '%s')",
				"", "", "", "", "");
		int rs = 0;
		return rs;
	}

	@Override
	public ArticleDTO selectBySeq(ArticleDTO param) throws Exception {
		ArticleDTO article = null; // null checking을 하기 위해서

		String sql = String.format(
				"SELECT art_seq, pat_id, title, content, regdate, read_count FROM Article WHERE art_seq='%s'",
				"");
		
		return article;
	}

	@Override
	public List<ArticleDTO> selectByWord(String[] param) throws Exception {
		List<ArticleDTO> listSome = new ArrayList<ArticleDTO>();
		ArticleDTO article = null;
		String sql = "SELECT art_seq, id, title, contents, regdate, read_count FROM Article " + " WHERE " + param[0]
				+ " LIKE '%" + param[1] + "%'";
		
		return listSome;
	}

	@Override
	public List<ArticleDTO> selectAll(int[] pageArr) {
		List<ArticleDTO> listAll = new ArrayList<ArticleDTO>();
		ArticleDTO article = null;
		String sql = String.format("SELECT t2.*" + "\tFROM (SELECT ROWNUM seq,t.*"
				+ "\tFROM (SELECT * FROM Article ORDER BY art_seq DESC) t) t2" + "\tWHERE t2.seq BETWEEN %s AND %s",
				String.valueOf(pageArr[0]), String.valueOf(pageArr[1]));
		ResultSet rs;
		
		return listAll;
	}

	@Override
	public int update(ArticleDTO param) throws Exception {
		String sql = String.format(
				"UPDATE Article SET id='%s', " + "title='%s', " + "contents='%s', " + "regdate='%s', "
						+ "read_count='%s' " + "WHERE art_seq='%s'",
				"", "", "", "", "", "");
		int rs = 0;
		return rs;
	}

	@Override
	public int delete(ArticleDTO param) throws Exception {
		String sql = String.format("DELETE FROM Article WHERE art_seq='%s'", "");
		int rs = 0;
		return rs;
	}

	@Override
	public int count() {
		int count = 0;
		String sql = "SELECT COUNT(*) AS count FROM Article";
		return count;
	}

}
