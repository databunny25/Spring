package com.example.demo.board.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.board.ReplyVO;
import com.example.demo.board.mapper.ReplyMapper;


@RestController
public class ReplyController {
	
	@Autowired
	ReplyMapper mapper;
	
	@PostMapping(value = "/new")
	public ResponseEntity<String> create(@RequestBody ReplyVO vo){
		
		System.out.println("ReplyVO : " + vo);
		int insertCount = mapper.insertReply(vo);
		return insertCount == 1 ? new ResponseEntity<>("success", HttpStatus.OK) : new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
