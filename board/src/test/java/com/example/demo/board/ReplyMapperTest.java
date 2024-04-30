package com.example.demo.board;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.board.mapper.ReplyMapper;
@SpringBootTest
public class ReplyMapperTest {
	
	private int[] bnoArr = { 1, 2, 3, 9, 11, 12, 13, 14, 15, 16, 17}; 
	
	@Autowired
	private ReplyMapper mapper;
	
	//@Test
	public void testMapper() { //댓글등록
		
		IntStream.rangeClosed(1, 10).forEach(i -> {
			ReplyVO vo = new ReplyVO();
			
			//게시물의 번호
			vo.setBoardNo(bnoArr[i%5]);
			vo.setReply("댓글 테스트 " + i);
			vo.setReplyer("replyer" + i);
			
			mapper.insertReply(vo);
		});
	}
	
//	//@Test
//	public void testRead() { //특정 댓글 조회
//		int targerRno = 1;
//		ReplyVO vo = mapper.read(targerRno);
//		System.out.println(vo);
//	}
//	
//	//@Test
//	public void testDelete() {
//		int targetRno = 3;
//		int result = mapper.delete(targetRno);
//		System.out.println("삭제건수= " + result);
//	}
//	
//	@Test
//	public void testUpdate() {
//		int targetRno = 4;
//		ReplyVO vo = mapper.read(targetRno);
//		vo.setReply("댓글수정");
//		int count = mapper.update(vo);
//		System.out.println("댓글수정건수 : " + count);
//	}
	
}
