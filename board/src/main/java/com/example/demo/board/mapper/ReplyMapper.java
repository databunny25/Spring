package com.example.demo.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.board.ReplyVO;

@Mapper
public interface ReplyMapper {

	int insertReply(ReplyVO replyVO);
	public ReplyVO read(int rno); //특정 댓글 읽기
	public int delete (int rno); //댓글 삭제
	public int update(ReplyVO vo);
	public List<ReplyVO> getReplyList();
}
