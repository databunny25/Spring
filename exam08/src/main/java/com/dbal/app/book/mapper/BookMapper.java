package com.dbal.app.book.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.dbal.app.book.BookVO;

@Mapper
public interface BookMapper {
	
	int insert (BookVO bookVO);
	List<BookVO> getBookList(BookVO vo);
	List<Map<String, Object>> getRentList();
}
