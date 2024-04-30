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

<section>

<c:forEach items="${bookList }" var="book">
	<div>
		<span>${ book.bookNo}</span>
		<span>${ book.bookName}</span>
		<span>${ book.bookCoverimg}</span>
		<span>${ book.bookDate}</span>
		<span>${ book.bookPrice}</span>
		<span>${ book.bookPublisher}</span>
		<span>${ book.bookInfo}</span>
	</div>

</c:forEach>
</section>

</div>

<footer>
Copyright
</footer>

</body>
</html>