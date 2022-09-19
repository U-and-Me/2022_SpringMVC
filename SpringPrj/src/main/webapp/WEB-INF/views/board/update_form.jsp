<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>Board Update</h1>
<form method="post" action="update_form?idx=${list.idx }">
		제목 : <input type="text" name="title" value="${list.title }"/> <br><br>
		비밀번호 : <input type="text" name="password" value="${list.password }"/> <br><br>
		글쓴이 : <input type="text" name="writer" value="${list.writer }"/> <br><br>
		이메일 : <input type="text" name="email" value="${list.email }"/> <br><br>
		내용 : <textarea name="content" rows="20" >${list.content }</textarea> <br><br>
		<button type="submit">수정완료</button>
	</form>
</body>
</html>