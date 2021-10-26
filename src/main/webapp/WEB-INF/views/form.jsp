<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8 ">
<title>Insert title here</title>
<link href="https://fonts.googleapis.com/css2?family=Dokdo&family=Gaegu&family=Gugi&family=Nanum+Pen+Script&display=swap" rel="stylesheet">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.5.0.js"></script>
<style type="text/css">
.inner{
	margin: 0 auto;
	width: 1100px;
}

.container{
	width: 800px;
}
	
</style>
</head>
<body>
	<div class = "innser">
		<div class = "container">
			<form action="read" >
				<input type = "text" name="id">
				<input type = "password" name="pass">
				<button class="submit">로그인</button>
			</form>
				<button onclick= "location.href='../'">돌아가기</button>
		</div>
	</div>
</body>
</html>