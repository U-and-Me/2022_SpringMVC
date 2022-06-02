<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome Spring!</h1>
	<img src="img/spring.svg" width="500" heigth="500"/> <br> 
	
	<a href="test1">test1 get</a>	
	
	<form method="post" action="test2"> <br>
		<input type="text" name="txt">
		<button type="submit">전송하기</button>
	</form>
	<br>
	
	<a href="test3">test3 get post</a> <br>
	
	<a href="test4">test4 get</a> <br>
	
	<form method="post" action="test5"> <br>
		<input type="text" name="txt">
		<button type="submit">post 전송하기</button>
	</form>
	<br>
</body>
</html>