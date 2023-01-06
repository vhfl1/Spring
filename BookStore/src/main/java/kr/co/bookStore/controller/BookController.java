package kr.co.bookStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.bookStore.service.BookService;
import kr.co.bookStore.vo.BookVO;

@Controller
public class BookController {

	@Autowired
	private BookService service;
	
	@GetMapping("/book/list")
	public String list(Model model) {
		List<BookVO> books = service.selectbooks();
		model.addAttribute("books", books);
		
		return "/book/list";
	}
	
	@GetMapping("/book/register")
	public String register() {
		return "/book/register";
	}
	@PostMapping("/book/register")
	public String register(BookVO vo) {
		service.insertbook(vo);
		return "redirect:/book/list";
	}
	
	@GetMapping("/book/modify")
	public String modify(String bookId, Model model) {
		BookVO book = service.selectbook(bookId);
		model.addAttribute("book", book);
		
		return "/book/modify";
	}
	
	@PostMapping("/book/modify")
	public String modify(BookVO vo) {
		service.updatebook(vo);
		
		return "redirect:/book/list";
	}
	
	@GetMapping("/book/delete")
	public String delete(String bookId) {
		service.deletebook(bookId);
		
		return "redirect:/book/list";
	}
}
