package com.example.demo.emp;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmpVO {
	 int employeeId; //int는 널 체크 불가능! Integer는 널 체크 가능!
	 String firstName;
	 String lastName;
	 String email;
	 @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	 Date hireDate;
	 Integer salary;
	 String jobId;
	 String departmentId;
	 String managerId;
	 String phone;
	 String photo;
	 
}
