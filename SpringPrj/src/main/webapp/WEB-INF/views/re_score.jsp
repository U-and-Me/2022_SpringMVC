<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>성적</h2>
	<h4>이름 : ${dto.name }</h4>
	<h4>국어 : ${dto.kor }</h4>
	<h4>영어 : ${dto.eng }</h4>
	<h4>수학 : ${dto.mat }</h4>
	<h4>총점 : ${dto.total }</h4>
</body>
</html>