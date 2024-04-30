package com.dbal.app.book.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dbal.app.book.BookVO;
import com.dbal.app.book.service.BookService;

@Controller
public class BookController {

	@Autowired
	BookService bookService;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index() {
		return "index";
	}
	
	@GetMapping("/bookList")
	public ModelAndView getBookList(BookVO vo) {
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("bookList", bookService.getBookList(vo));
		
		mv.setViewName("book/bookList");
		System.out.println(mv);
		return mv;
	}
	
	@GetMapping("/insertBook")
	public String insertBook() {
		return "book/insertBook";
	}
	
	@PostMapping("/insert")
	public String insert(@ModelAttribute("vo") BookVO vo) {
		bookService.insert(vo);
		return "redirect:/bookList";
	}
	
	
	@GetMapping("/rentList")
	public String rentList(Model model){
		model.addAttribute("rentList", bookService.getRentList());
		System.out.println(model);
		return "book/rentList";
	}
	
}
