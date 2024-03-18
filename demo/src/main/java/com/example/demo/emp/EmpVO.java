package com.example.demo.emp;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

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
	 @JsonFormat(pattern = "yyyy-MM-dd")
	 Date hireDate;
	 Integer salary;
	 String jobId;
	 @JsonProperty(value= "deptId") String departmentId;
	 @JsonIgnore String managerId;
	 @JsonIgnore String phone;
	 
}
