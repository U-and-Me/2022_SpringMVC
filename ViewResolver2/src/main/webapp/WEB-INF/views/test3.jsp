<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>test3</h1>

	<!-- 어느 영역에 저장되어있는지 알기 위해서 requestScope을 생략하지 않고 작성함 -->
	<h2>data5 : ${requestScope.data5 }</h2>
	<h2>data6 : ${requestScope.data6 }</h2>
	
	<!-- requestScope 생략 가능  -->
	<!-- 
	<h2>data5 : ${data5 }</h2>
	<h2>data6 : ${data6 }</h2>
	 -->
</body>
</html>