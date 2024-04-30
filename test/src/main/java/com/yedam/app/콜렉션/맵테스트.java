package com.yedam.app.콜렉션;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.yedam.app.EmpVO;

public class 맵테스트 {
	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("100", "park");
		map.put("101", "kim");
		map.put("102", "choi");
		
		String name = (String)map.get("101");
		
		//반복문
		for( String key : map.keySet() ) {
			System.out.println(key + " : " + map.get(key));
		}
		
		//VO == Map
		List<HashMap<String, Object>> empList = new ArrayList<HashMap<String, Object>>();
		map = new HashMap<>();
		map.put("firstName", "park");
		map.put("lastName", "aaa");
		map.put("salary", 20000);
		empList.add(map);
		
		map = new HashMap<>();
		map.put("firstName", "choi");
		map.put("lastName", "bbb");
		map.put("salary", 10000);
		empList.add(map);
		
		//firstName만 출력
		for ( HashMap<String, Object> empAmp : empList) {
			System.out.println(empAmp.get("firstName"));
		}
		
		
		//filter : 급여가 15000 이상인
		for(HashMap<String, Object> empAmp : empList) {
			if((Integer)(empAmp.get("salary")) >= 15000) {
				System.out.println(empAmp.get("lastName"));
			}
		}	
		//stream
		empList.stream()
			   .filter( vo -> (Integer)(vo.get("salary")) >= 15000 )
			   .collect(Collectors.toList());
		System.out.println(empList);
		
	}
}
