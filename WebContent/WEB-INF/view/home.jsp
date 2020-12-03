<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<sec:authorize access="isAuthenticated()">
	<div class="ui segment">
	User: <sec:authentication property="principal.username" />, Role: <sec:authentication property="principal.authorities"/>
	</div>
</sec:authorize>


</body>
</html>