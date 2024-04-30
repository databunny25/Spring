package com.sam.app.insa.mapper;

import java.util.List;
import java.util.Map;

import com.sam.app.insa.service.DepartmentsVO;

public interface DepartmentsMapper {

	// 부서목록조회
	public List<DepartmentsVO> getDeptList(DepartmentsVO vo);
}
