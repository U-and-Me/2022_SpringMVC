<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>Show List</h1>
	<table border = 1>
		<thread>
			<tr>
				<td>idx</td>
				<td>title</td>
				<td>writer</td>
				<td>content</td>
				<td>email</td>
				<td>hit</td>
				<td>regDate</td>
			</tr>
		</thread>
		<tbody>
			<c:forEach var="value" items="${list}">
				<tr>
					<td>${value.idx }</td>
					<td>${value.title }</td>
					<td>${value.writer }</td>
					<td>${value.content }</td>
					<td>${value.email }</td>
					<td>${value.hit }</td>
					<td>${value.regDate }</td>
					<td><a href="board/update?idx=${value.idx}">수정</a> <a href="board/delete?idx=${value.idx }">삭제</a>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>