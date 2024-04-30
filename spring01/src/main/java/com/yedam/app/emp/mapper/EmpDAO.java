package com.yedam.app.emp.mapper;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;


public class EmpDAO {

	SqlSession mybatis;	
	
//	public void setMybatis(SqlSession mybatis) {
//		this.mybatis = mybatis;
//	}
	
	public EmpDAO(SqlSession mybatis) {
		super();
		this.mybatis = mybatis;
	}

	public Map<String, Object> getInfo(String employeeId){
		return mybatis.selectOne("Employee.getInfo", employeeId);
	}
}
