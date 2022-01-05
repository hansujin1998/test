<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
	<p>index.jsp파일을 불러온 페이지입니다.</p>
	<!-- HTML에서 DB로 데이터 전송방법 -->
	<a href="/sample/memberDTO?id=abcd&pw=1234&name=정자바">회원가입</a>
	<form action="sample/memberDTO" method="get">
		<div>id:<input type="text" name="id"></div><!-- name : 브라우저내의 자동으로 변수생성 -->
		<div>pw:<input type="password" name="pw" ></div>
		<div>name:<input type="text" name="name" ></div>
		<input type="submit" value="회원가입">
	</form>
	${yyyy}
</body>
</html>