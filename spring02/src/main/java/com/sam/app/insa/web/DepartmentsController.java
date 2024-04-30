package com.sam.app.insa.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.sam.app.insa.service.DepartmentsService;
import com.sam.app.insa.service.DepartmentsVO;

@Controller
@SessionAttributes("dept")
public class DepartmentsController {

	
	@Autowired
	DepartmentsService departmentsService;
	
	@GetMapping("/getDeptList")
	public ModelAndView getDeptList(DepartmentsVO vo) {
		ModelAndView mv  = new ModelAndView();
		
		mv.addObject("deptList", departmentsService.getDeptList(vo));
		
		mv.setViewName("insa/departmentslist");
		return mv;
	}
}
