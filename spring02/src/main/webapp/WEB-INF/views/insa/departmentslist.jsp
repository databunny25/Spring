<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title></title>
</head>
<body>
	<h3>부서목록</h3>
	
	<c:forEach items="${deptList}" var="dept">
		<div style="border: 1px solid blue;">
			
			<span>${dept.departmentId}</span>
			<span>${dept.departmentName}</span>
			<span>${dept.managerId}</span>
			<span>${dept.locationId}</span>
		</div>
	</c:forEach>
</body>
</html>