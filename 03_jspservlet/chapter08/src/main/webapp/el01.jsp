<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="header.jsp" %>
  
<% 
   String name=null;
   //request.setArribute("name","test");
   
%>

<!-- el은 출력이 안됨 왜냐하면 맨위에 String 어쩌고가 안쓴다고 가정하에 사용하는거임 
지역변수에서 안쓰고 스코프에서 사용함 -->
<!-- el은 null일때 아무것도 출력 안함 -->



  <body>
    <div class="container">
    <h1>
   ${name} / <%=name %> 
    </h1>
     </div>
  </body>
  
<%@ include file="footer.jsp" %>