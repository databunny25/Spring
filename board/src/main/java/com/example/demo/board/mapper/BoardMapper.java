package com.example.demo.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.board.BoardVO;
import com.example.demo.board.SearchbVO;

@Mapper
public interface BoardMapper {
	List<BoardVO> getBoardList(@Param("vo") BoardVO vo, SearchbVO svo);
	BoardVO getBoardInfo(int boardNo);
	int insertBoard(BoardVO boardVO);
	int deleteBoard(int boardNo);
	int updateBoard(BoardVO boardVO);
}
