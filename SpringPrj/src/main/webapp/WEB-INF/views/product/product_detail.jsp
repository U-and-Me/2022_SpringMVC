<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table border>
		<tr>
			<td>��ǰ �̸�</td>
			<td >${list.productName }</td>
		</tr>
		<tr>
			<td>��ǰ �̹���</td>
			<td><img src="../../img/${list.productUrl }"></td>
		</tr>
		<tr>
			<td>��ǰ ����</td>
			<td><fmt:formatNumber value="${list.productPrice }" pattern="###,###,###"/></td>
			<td>
				<form name="myForm" method="post" action="cart_insert">
					<input type="hidden" value="${list.productId}"/>
					<select name="amount">
						<c:forEach begin="1" end="10" var="i">
							<option value="${i }">${i }</option>
						</c:forEach>
					</select>��
					<input type="submit">��ٱ��� ���
				</form>
				<a href="list_all">��ǰ���</a>
			</td>
		</tr>
	</table>
</body>
</html>