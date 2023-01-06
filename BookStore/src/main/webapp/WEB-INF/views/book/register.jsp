<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>도서등록</title>
	</head>
	<body>
		<h3>도서등록</h3>
		
		<a href="/BookStore/index">처음으로</a>
		<a href="/BookStore/book/list">도서목록</a>
		
		<table border="1">
			<tr>
				<th>도서명</th>
				<td><input type="text" name="bookName"></td>
			</tr>
			<tr>
				<th>출판사</th>
				<td><input type="text" name="publisher"></td>
			</tr>
			<tr>
				<th>가격</th>
				<td><input type="text" name="price"></td>
			</tr>
			<tr>
				<td colspan="2" align="right">
				<input type="submit" value="등록">
				</td>
			</tr>
		</table>
	</body>
</html>