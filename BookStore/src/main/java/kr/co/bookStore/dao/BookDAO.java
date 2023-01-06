package kr.co.bookStore.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.bookStore.vo.BookVO;

@Repository
public class BookDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insertbook(BookVO vo) {
		mybatis.insert("book.insertBook", vo);
	}
	
	public BookVO selectbook(String bookId) {
		return mybatis.selectOne("book.selectBook", bookId);
	}
	
	public List<BookVO> selectbooks() {
		return mybatis.selectList("book.selectBooks");
	}
	
	public void updatebook(BookVO vo) {
		mybatis.update("book.updateBook", vo);
	}
	
	public void deletebook(String bookId) {
		mybatis.delete("book.deleteBook", bookId);
	}
}
