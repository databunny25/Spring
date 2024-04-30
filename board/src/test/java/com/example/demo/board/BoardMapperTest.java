package com.example.demo.board;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.board.mapper.BoardMapper;

@SpringBootTest
public class BoardMapperTest {
	@Autowired BoardMapper mapper;
	
	@Test
	public void 게시글검색() {
//		BoardVO vo = new BoardVO();
		SearchbVO svo = new SearchbVO();
		BoardVO vo = BoardVO.builder()
							.writer("홍길동")
							.build();			
		
		List<BoardVO> list = mapper.getBoardList(vo, svo);
		
		for(BoardVO board : list) {
			System.out.println(board);
		}
	}
	
	//@Test
	public void 게시글단건조회() {
		int boardNo = 10;
		BoardVO vo = mapper.getBoardInfo(boardNo);
		System.out.println(vo);
	}
	
	//@Test
	public void 게시글등록() {
		BoardVO vo = BoardVO.builder()
							.title("스프링 시작")
							.content("어렵네요")
							.writer("신신신")
							.build();
		int result = mapper.insertBoard(vo);
		
		System.out.println("등록건수=" + result);
		System.out.println("게시글번호: " + vo.getBoardNo() + " 제목: " + vo.getTitle() + " 내용: " + vo.getContent() + " 작성자: " + vo.getWriter());
	}
	
	//@Test
	public void 게시글삭제() {
		int boardNo = 10;
		int result = mapper.deleteBoard(boardNo);
		System.out.println("삭제건수=" + result);
	}
	
	//@Test
	public void 게시글수정() {
		BoardVO vo = BoardVO.builder()
							.boardNo(21)
							.title("스프링수정")
							.content("어렵다구")
							.build();
	
		int result = mapper.updateBoard(vo);
		
		System.out.println("수정건수=" + result);
	}
	
	
}
