package com.example.demo.board;

import java.util.Date;

import lombok.Data;

@Data
public class ReplyVO {
	private int rno;
	private int boardNo;
	
	private String reply;
	private String replyer;
	private Date replyDate;
	private Date updateDate;
}
