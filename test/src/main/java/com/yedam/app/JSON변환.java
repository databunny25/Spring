package com.yedam.app;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSON변환 {
	public static void main(String[] args) throws MalformedURLException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		
		// object ==> json
		EmpVO vo = new EmpVO("길동", "홍", 1000);
		
		String str = objectMapper.writeValueAsString(vo);
		
		// json => object
		vo = objectMapper.readValue(str, EmpVO.class);
		
		//url => object
		Map map = objectMapper.readValue(new URL("https://jsonplaceholder.typicode.com/todos/1"), Map.class);
		System.out.println(map.get("title"));
	}
}
