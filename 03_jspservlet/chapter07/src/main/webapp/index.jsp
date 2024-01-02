<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!-- 변수를 써서 그때그때 달라져야 동적이고
이거는 동적 페이지임  date -->

<%@ include file="header.jsp"%>

<% Date d = new Date(); %>


<body>
	<div class="container">
		<h1>Glory에 오신것을 환영합니다. 현재시간: <%=d.toLocaleString() %></h1>
		<a href="about.jsp">about</a>


	</div>
</body>

<%@ include file="footer.jsp"%>