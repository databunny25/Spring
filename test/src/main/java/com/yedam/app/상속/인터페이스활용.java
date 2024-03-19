package com.yedam.app.상속;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.yedam.app.EmpVO;

public class 인터페이스활용 {
	public static void main(String[] args) {
		
		List<EmpVO> list = new ArrayList<>();
		list.add(new EmpVO("park", "bbb", 20000));
		list.add(new EmpVO("choi", "aaa", 10000));
		list.add(new EmpVO("kim", "ccc", 14000));
		
		// sort //익명클래스 생성시 람다표현식 가능(구현할 메소드가 하나 뿐일때만 가능!)
		Collections.sort(list, (EmpVO o1, EmpVO o2) -> (o2.getSalary() - o1.getSalary()) ); //리턴 값 하나뿐이면 return도 생략가능
		
		for(EmpVO vo : list) {
			System.out.println(vo.getFirstName() + ":" + vo.getLastName());
		}
		
	}
}

