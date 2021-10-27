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
			<h1>SPRING PRACTICE 개편</h1>
			<ul>
				<li><a href="file/uploadForm">파일 업로드</a></li>
				<li><a href="file/multiUploadForm">파일여러개 업로드</a></li>
				<li><a href="login/form">로그인</a></li>
			</ul>
		</div>
	</div>
</body>
</html>
