package com.yedam.app;

import java.util.Date;
import java.util.Objects;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
@ToString
@RequiredArgsConstructor
public class EmpVO {
	 private int employeeId; //int는 널 체크 불가능! Integer는 널 체크 가능!
	 final private String firstName;
	 final private String lastName;
	 private String email;
	 private Date hireDate;
	 final private Integer salary;
	 private String jobId;
	 private String departmentId;
	 private String managerId;
	 private String phone;
	 private String photo;
	 
	 
	 
	 // 생성자 : 객체 생성시 필드 초기화 시켜주는 역할
//	 public EmpVO(String firstName, String lastName, Integer salary) {
//		 this.
//	 }
	 
	
	 public String getFirstName() {
		 return this.firstName;
	 }
	 public String getLastName() {
		 return this.lastName;
	 }
	 public int getSalary() {
		 return this.salary;
	 }
	 
//	 public EmpVO(String firstName, String lastName, Integer salary) {
//		 this.firstName = firstName;
//		 this.lastName = lastName;
//		 this.salary = salary;
//	 }
	 
	@Override
	public boolean equals(Object obj) {
		EmpVO vo = (EmpVO) obj; //부모 자식 간의 형변환 가능
		return this.firstName.equals(vo.getFirstName()) &&
			   this.lastName.equals(vo.getLastName());
	}
	@Override
	public int hashCode() {
		return Objects.hash(this.firstName, this.lastName);
	}
}
