<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>��ٱ���</h1>
	<table border = 1>
		<thread>
			<tr>
				<td>��ǰ �̸�</td>
				<td>���� </td>
				<td>���� </td>
			</tr>
		</thread>
		<tbody>
			<c:forEach var="value" itmes="${list }">
				<tr>
					<td>${value.get("PRODUCTNAME")} </td>
					<td>${value.get("AMOUNT") } </td>
					<td>${value.get("TOTAL") } </td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>