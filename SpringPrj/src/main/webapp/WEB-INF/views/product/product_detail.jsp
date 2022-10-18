<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
	<div class="row">
		<div class="col-sm-7">
			<table border class="table table-striped">
				<tr>
					<td class="col-sm-2">상품 이름</td>
					<td>${list.productName }</td>
				</tr>
				<tr>
					<td class="col-sm-3">상품 이미지</td>
					<td><img src="../../img/${list.productUrl }"></td>
				</tr>
				<tr>
					<td class="col-sm-2">상품 가격</td>
					<td><fmt:formatNumber value="${list.productPrice }"	pattern="###,###,###" /></td>
					<td>
						<form name="myForm" method="post" action="cart_insert">
							<input type="hidden" value="${list.productId}" name="product_id"/> 
							<select	name="amount">
								<c:forEach begin="1" end="10" var="i">
									<option value="${i }">${i }</option>
								</c:forEach>
							</select>개 <input type="submit">장바구니 담기
						</form>
						<a href="list_all">상품목록</a>
					</td>
				</tr>
			</table>
		</div>
	</div>

</body>
</html>