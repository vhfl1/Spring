<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>고객수정</title>
	</head>
	<body>
		<h3>고객수정</h3>
		
		<a href="/BookStore/index">처음으로</a>
		<a href="/BookStore/customer/list">고객목록</a>
		<form action="/BookStore/customer/modify" method="post">
		<table border="1">
			<tr>
				<th>고객번호</th>
				<td><input type="text" name="custId"  value="${customer.custId}" readonly></td>
			</tr>
			<tr>
				<th>고객명</th>
				<td><input type="text" name="name" value="${customer.name}"></td>
			</tr>
			<tr>
				<th>주소</th>
				<td><input type="text" name="address" value="${customer.address}"></td>
			</tr>
			<tr>
				<th>휴대폰</th> 
				<td><input type="text" name="phone" value="${customer.phone}"></td>
			</tr>
			<tr>
				<td colspan="2" align="right">
				<input type="submit" value="등록">
				</td>
			</tr>
		</table>
		</form>
	</body>
</html>