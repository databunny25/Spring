<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<header>
<h1>도서대여관리</h1>
</header>

<nav>
	<a href="/mb/insertBook">도서등록</a>
	<a href="/mb/bookList">도서목록조회</a>
	<a href="/mb/rentList">대여현황조회</a>
	<a href="/mb">홈으로</a>
</nav>

<div>

<form action="insert" method="post">
	도서번호<input type="text" name="bookNo">
	도서명<input type="text" name="bookName">
	도서표지<input type="text" name="bookCoverimg">
	출판일자<input type="text" name="bookDate">
	금액<input type="text" name="bookPrice">
	출판사<input type="text" name="bookPublisher">
	도서소개<textarea id="bookInfo" name="bookInfo" rows="5" cols="20"></textarea>
	<button>등록</button>	
	<button>조회</button>	
</form>

</div>

<footer>
Copyright
</footer>

</body>
</html>