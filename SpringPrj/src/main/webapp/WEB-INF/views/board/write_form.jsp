<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>Board Login</h1>
<form method="post" action="board_register">
		제목 : <input type="text" name="title" /> <br><br>
		비밀번호 : <input type="text" name="password" /> <br><br>
		글쓴이 : <input type="text" name="writer" /> <br><br>
		이메일 : <input type="text" name="email" /> <br><br>
		내용 : <textarea name="content" rows="20"></textarea> <br><br>
		<button type="submit">작성완료</button>
	</form>
</body>
</html>