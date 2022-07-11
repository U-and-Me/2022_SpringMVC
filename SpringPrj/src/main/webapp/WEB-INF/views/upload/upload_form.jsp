<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Title</title>
</head>
<body>
<h1>업로드하세요</h1>
<form action="re_upload" method="post" enctype="multipart/form-data">
    파일 업로드 : <input type="file" name="file" alt="이미지 입력 폼"/>
    <button type="submit">업로드 완료</button>
</form>

</body>
</html>