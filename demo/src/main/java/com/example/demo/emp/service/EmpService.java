package com.example.demo.emp.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.demo.emp.EmpVO;
import com.example.demo.emp.SearchVO;


public interface EmpService { //서비스에 들어오는 매퍼의 기준 : 페이지에서 사용자가 요청하는 것만!
	Map<String, Object> getEmpList(@Param("vo") EmpVO vo, SearchVO svo);
	EmpVO getEmpInfo(int employeeId);
	int insertEmp(EmpVO empVO);
	int deleteEmp(int employeeId);
	List<Map<String,Object>> getStat();	
	
}
