<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Successs Form</title>
</head>
<body>
	<h2>User Success From</h2>
	<hr />

	<table>
		<tr>
			<th>Name</th>
			<td>${user.name}</td>
		</tr>
		<tr>
			<th>Email</th>
			<td>${user.email}</td>
		</tr>
		<tr>
			<th>Gender</th>
			<td>${user.gender}</td>
		</tr>
		<tr>
			<th valign="top">Languages</th>
			<td>${user.languages}</td>
		</tr>
	</table>
</body>
</html>