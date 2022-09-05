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
<form method="post" action="update_form">
id : <input type="text" name="userid" value="${list.userid}"/><br/>
pw : <input type="password" name="upw" value="${list.upw}"/><br/>
name : <input type="text" name="uname" value="${list.uname}"/><br/>
email : <input type="text" name="uemail" value="${list.uemail}"/><br/><br/>
<button type="submit">Update</button></form>
</body>
</html>