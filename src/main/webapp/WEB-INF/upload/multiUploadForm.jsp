<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<title>Home</title>
<style type="text/css">
li{
	list-style: none;
}
.inner{
	margin: 0 auto;
	width: 1100px;
	position: relative;
	background-color: orange;
}

.container{
	position: absolute;
	background-color: pink;
	width: 800px;
	height: 300px;
	left: 150px;
	text-align: center;
}
</style>
</head>
<body>
	<div class="inner">
		<div class="container">
			<h1>여러파일첨부</h1>
			<input type="file" >
			<button type="button" onclick="location.href='/uploadForm'">전송</button>
			<button type="button" onclick="location.href='../'">홈으로</button>
		</div>
	</div>
</body>
</html>
