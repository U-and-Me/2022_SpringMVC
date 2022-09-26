<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>상품 등록</h1>
	<form id="myForm" name="myForm" enctype="multipart/form-data" method="post" action="form_upload">
		<table border>
			<tr>
				<td>상품이름</td>
				<td> <input type="text" name="name"> </td>
			</tr>
			<tr>
				<td>상품가격</td>
				<td> <input type="text" name="price"> </td>
			</tr>
			<tr>
				<td>상품설명</td>
				<td> <textarea rows=5" cols="70" name="description" ></textarea> </td>
			</tr>
			<tr>
				<td>상품이미지</td>
				<td> <input type="file" name="image"> </td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" name="add" value="상품등록">
					<input type="button" name="list" value="상품목록">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>