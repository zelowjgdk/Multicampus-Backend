<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/sample/exUploadPost" method="post"
		enctype="multiPART/form-data">
		
		<div>
			<input type="file" name="files" multiple="multiple" />
		</div>
		<div>
			<input type="submit" />
		</div>
	</form>

</body>
</html>