<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<a href="test1?data1=100&data2=200">test1</a> <br>
	<a href="test2?data1=100&data2=200&data3=300&data3=400">test2 get</a> <br>
	<a href="test3?data1=500&data2=600">test3 WebRequest</a> <br>
	<a href="test4/700/800/900">test4 @PathVariable</a> <br>
	<a href="test5?data1=10&data2=20&data3=30">test5 @RequestParam</a> <br>
	<a href="test6?data1=40&data2=50&data3=60&data3=70">test6 @RequestParam array</a>
</body>
</html>