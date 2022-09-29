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
	<h1>��ǰ ���</h1>
	<table border = 1>
		<thread>
			<tr>
				<td>��ǰ ��ȣ</td>
				<td>��ǰ �̹���</td>
				<td>��ǰ �̸� </td>
				<td>����     </td>
			</tr>
		</thread>
		<tbody>
			<c:forEach var="value" items="${list}">
				<tr>
					<td>${value.productId }</td>
					<td><a href="product/detail/${value.productId }"><img src="../img/${value.productUrl}"></a></td>
					<td>${value.productName }</td>
					<td>${value.productPrice }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>