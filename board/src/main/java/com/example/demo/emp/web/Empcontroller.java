package com.example.demo.emp.web;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.emp.EmpVO;
import com.example.demo.emp.SearchVO;
import com.example.demo.emp.mapper.EmpMapper;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller // 컨테이너 빈 등록(컨트롤러는 컴포넌트 상속받아서 만들어졌으므로 이것이 가능) + 사용자 요청 처리 할 수 있는 커맨드 핸들러 변환
public class Empcontroller {
		
	final EmpMapper mapper; //의존성 주입 (DI dependency injection)
	
	//등록처리
	@PostMapping("/insert")
	public String insert(@ModelAttribute("emp") EmpVO vo, MultipartFile photoFile) throws IllegalStateException, IOException{
				
		File file = new File("d:/upload", photoFile.getOriginalFilename());
		photoFile.transferTo(file);
		
		vo.setPhoto(photoFile.getOriginalFilename());
		System.out.println("사원등록: " + vo);
		mapper.insertEmp(vo);
		return "redirect:/emp/list";
	}
	//등록페이지 이동
	@GetMapping("/emp/insert")
	public void insert() {
		
	}
	
	//수정페이지 이동
	@GetMapping("/emp/update/{employeeId}")
	public String update(Model model, @PathVariable int employeeId) {
		EmpVO emp = mapper.getEmpInfo(employeeId);
		model.addAttribute("emp", emp);
		return "/emp/update";
	}
		
	//수정처리
	@GetMapping("/emp/updateEmp")
	public String updateEmp(EmpVO vo) {
		mapper.updateEmp(vo);
		return "redirect:/emp/list";
	}
	
	
	
	
	
	//삭제처리
	@GetMapping("/emp/delete/{employeeId}")
	public String delete(Model model, @PathVariable int employeeId) {
//		model.addAttribute("employeeId", employeeId);
		mapper.deleteEmp(employeeId);
		System.out.println("삭제건수:");
		return "redirect:/emp/list";
	}
	
	
	//상세조회 페이지이동
	@GetMapping("/emp/info/{employeeId}")
	public String getEmpInfo(Model model, @PathVariable int employeeId) {
		EmpVO emp = mapper.getEmpInfo(employeeId);
		System.out.println(emp);
		model.addAttribute("emp", emp);
		return "/emp/info";
	}
	
	//목록페이지로 이동	
	@RequestMapping("/emp/list")
	public String empList(Model model, EmpVO vo, SearchVO svo){
		model.addAttribute("empList", mapper.getEmpList(vo, svo));
		return "/emp/list";
	}
	
	


}
