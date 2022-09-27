<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
	$(function(){
		$("#addBtn").click(function(){
			var productName = $("#productName").val();
			var productPrice = $("#productPrice").val();
			var productDesc = $("#productDesc").val();
			var productImage = $("#productImage").val();

			if(productName == ""){
				alert("input name");
				productName.focus();
				}
			else if(productPrice == ""){
				alert("input price");
				productPrice.focus();
				}
			else if(productDesc == ""){
				alert("input description");
				productDesc.focus();
				}

			document.myForm.action = "insert_product";
			document.myForm.submit();
			});

		$("listBtn").click(function(){
			location.href = "list";
			});
		})
</script>
</head>
<body>
	<h1>��ǰ ���</h1>
	<form id="myForm" name="myForm" enctype="multipart/form-data" method="post">
		<table border>
			<tr>
				<td>��ǰ�̸�</td>
				<td> <input type="text" name="productName" id="productName"> </td>
			</tr>
			<tr>
				<td>��ǰ����</td>
				<td> <input type="text" name="productPrice" id="productPrice"> </td>
			</tr>
			<tr>
				<td>��ǰ����</td>
				<td> <textarea rows=5" cols="60" name="productDesc" id="productDesc"></textarea> </td>
			</tr>
			<tr>
				<td>��ǰ�̹���</td>
				<td> <input type="file" name="productImage" id="productImage"> </tds>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="button" id="addBtn" value="��ǰ���">
					<input type="button" id="listBtn" value="��ǰ���">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>