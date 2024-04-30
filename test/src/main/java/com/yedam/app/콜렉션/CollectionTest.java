package com.yedam.app.콜렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import com.yedam.app.EmpVO;

/*
 * List, Set, Map
 * list :					--> 순차적 목록
 * set : 중복값 허용 X , index --> 중복값허용X
 * Map : <k,v>		, key	--> 검색
 * 
 * */
public class CollectionTest {
	public static void main(String[] args) {
		// 중복값 제거
		List<Integer> list = Arrays.asList(3, 3, 10, 11, 14, 3);
		System.out.println(list);
		
		//list ==> set
		HashSet set = new HashSet<>(list);
		System.out.println(set);
		
		//List<EmpVO>
		List<EmpVO> empList = new ArrayList<>();
		empList.add(new EmpVO("park", "bbb", 20000));
		empList.add(new EmpVO("choi", "aaa", 10000));
		empList.add(new EmpVO("kim", "ccc", 14000));
		empList.add(new EmpVO("park", "bbb", 20000));

		HashSet<EmpVO> empSet = new HashSet<>(empList);
		System.out.println(empSet.size());
//		for(EmpVO e : empSet) {
//			System.out.println(e);
//		}
		
		//필터링 : 급여가 15000 이상인 사원만 검색
		List<EmpVO> filterList = new ArrayList<>();
		for(EmpVO e : empSet) {
			if(e.getSalary() >= 15000) {
				filterList.add(e);
			}
		}
		System.out.println(filterList.size());
		
		// ==> stream 으로 사용하면 코드 훨씬 짧게 가능!
		filterList = empSet.stream()
//						   .filter( vo -> vo.getSalary() > 15000)
//						   .filter( vo -> vo.getLastName().equals("bbb"))
//						   .filter( vo -> vo.getLastName().startsWith("bbb"))
						   .filter( vo -> vo.getLastName().contains("bbb"))
					       .collect(Collectors.toList());
		System.out.println(filterList);
		
		
	}
}
