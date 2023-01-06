package kr.co.bookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.bookStore.dao.BookDAO;
import kr.co.bookStore.vo.BookVO;

@Service
public class BookService {

	@Autowired
	private BookDAO dao;
	
	public void insertbook(BookVO vo) {
		dao.insertbook(vo);
	}
	
	public BookVO selectbook(String bookId) {
		return dao.selectbook(bookId);
	}
	
	public List<BookVO> selectbooks() {
		return dao.selectbooks();
	}
	
	public void updatebook(BookVO vo) {
		dao.updatebook(vo);
	}
	
	public void deletebook(String bookId) {
		dao.deletebook(bookId);
	}
}
