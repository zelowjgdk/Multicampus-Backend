<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ include file="header.jsp"%>

<body>
	<div class="container">
		<h1>JSTL Core 라이브러리 실습</h1>
		<%
		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		request.setAttribute("myArray", num);
		%>

		<c:forEach var="n" items="${myArray}">
			<c:out value="${n}" />
		</c:forEach>
		<br>
		<c:forEach var="n" items="${myArray}" begin="0" end="6">
			<c:out value="${n}" />
		</c:forEach>

		<h1>JSTL Core 라이브러리 실습2</h1>

		<%
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("이순신");
		list.add("유관순");

		request.setAttribute("name", list);
		%>

		<table class="table table-hover">
			<thead>
				<tr>
					<th style="width:40px">#</th>
					<th><a href="#">이름</a></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="n" items="${name}" varStatus="status">
					<tr>
						<td>${status.count }</td>
						<td>${n}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>

<%@ include file="footer.jsp"%>