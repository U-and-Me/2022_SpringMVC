<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>Result test1</h1>
	
	<!-- 
	<h3>data1 : ${requestScope.dataBean.data1 }</h3>
	<h3>data2 : ${requestScope.dataBean.data2 }</h3> 
	 -->
	
	<!-- 
	<h3>data1 : ${requestScope.data1 }</h3>
	<h3>data2 : ${requestScope.data2 }</h3>
	 -->
	 
	<h3>data1 : ${dto.data1 }</h3>
	<h3>data2 : ${dto.data2 }</h3>
	 
</body>
</html>