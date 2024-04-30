package com.dbal.app.book.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbal.app.book.BookVO;
import com.dbal.app.book.mapper.BookMapper;
import com.dbal.app.book.service.BookService;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	BookMapper bookMapper;
	
	@Override
	public int insert(BookVO bookVO) {
		return bookMapper.insert(bookVO);
	}

	@Override
	public List<BookVO> getBookList(BookVO vo) {
		
		return bookMapper.getBookList(vo);
	}

	@Override
	public List<Map<String, Object>> getRentList() {
		
		return bookMapper.getRentList();
	}
	
}
