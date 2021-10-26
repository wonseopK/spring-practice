<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<title>Home</title>
<style type="text/css">
	ul{
		display: flex;
	}
	li{
	margin-left: 30px;
	list-style: none;
	}
</style>
</head>
<body>
<h1>PRACTICE SPRING</h1>
 <c:if test="${login !='ok'}">
 <ul>
 	<li><a href="login/form">로그인하기</a></li>
 	<li><a href="">회원가입하기</a></li>
 </ul>
  </c:if>
 <c:if test="${login =='ok'}">
 	 <ul>
 		<li><a href="logout">로그아웃</a></li>
 		<li><a href="">마이페이지</a></li>
 	</ul>
 </c:if>
</body>
</html>
