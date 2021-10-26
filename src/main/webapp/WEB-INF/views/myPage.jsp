<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<title>Home</title>
</head>
<body>
<h1>PRACTICE SPRING</h1>
	<table>
		<tr>
			<td>아이디</td>
			<td>${id}</td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td>${pass}</td>
		</tr>
		<tr>
			<td>이름</td>
			<td>${name}</td>
		</tr>
		<tr>
			<td>나이</td>
			<td>${age}</td>
		</tr>
	</table>
	<button onclick= "location.href='../'">돌아가기</button>
</body>
</html>
