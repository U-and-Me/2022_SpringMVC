<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<script src="https://code.jquery.com/jquery-latest.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<body>
	<h1>상품 목록</h1>
	<div class="row">
		<div class="col-sm-9">
			<table border = 1 class="table table-striped w-180px">
				<thread>
					<tr>
						<td class="col-md-2">상품 번호</td>
						<td class="col-md-3">상품 이미지</td>
						<td class="col-md-2">상품 이름 </td>
						<td class="col-md-2">가격     </td>
					</tr>
				</thread>
				<tbody>
					<c:forEach var="value" items="${list}">
						<tr>
							<td>${value.productId }</td>
							<td><a href="detail/${value.productId }"><img src="../img/${value.productUrl}" width="100px" height="100px"></a></td>
							<td>${value.productName }</td>
							<td>${value.productPrice }</td>
						</tr>
					</c:forEach>
				</tbody>
		</div>
	</div>

	</table>
</body>
</html>