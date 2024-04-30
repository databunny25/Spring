package com.dbal.app.book.service;

import java.util.List;
import java.util.Map;

import com.dbal.app.book.BookVO;

public interface BookService {

	public int insert (BookVO bookVO);
	public List<BookVO> getBookList(BookVO vo);
	public List<Map<String, Object>> getRentList();
}
