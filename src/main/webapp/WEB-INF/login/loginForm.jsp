<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8 ">
<title>Insert title here</title>
<link href="https://fonts.googleapis.com/css2?family=Dokdo&family=Gaegu&family=Gugi&family=Nanum+Pen+Script&display=swap" rel="stylesheet">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.5.0.js"></script>
<style type="text/css">
.info{
	width: 150px;
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
}
</style>
</head>
<body>
<div class="inner">
	<div class="container">
		<h1>로그인</h1>
		<form action="read" method="post">
			<input type="text" name="id" placeholder="아이디" class="info"><br>
			<input type="password" name="pw" placeholder="비밀번호" class="info"><br>
			<button type="submit">로그인</button>
		</form>
			<button type="button" onclick="location.href='../'">홈으로</button>
	</div>
</div>
</body>
</html>