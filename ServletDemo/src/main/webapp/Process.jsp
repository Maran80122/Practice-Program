<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="u" class="com.turf.servlet.User" scope="session"/>

<jsp:setProperty name="u" property="name"/>
<jsp:setProperty name="u" property="email"/>
<jsp:setProperty name="u" property="password"/>
<%
	String name = "maran";
	u.setName(name);// Correct way to set a property using scriptlet
%>
Record:<br>
Name: <jsp:getProperty property="name" name="u"/><br>
Password: <jsp:getProperty property="password" name="u"/><br>
Email: <jsp:getProperty property="email" name="u"/><br>
<a href="webapp/second.jsp">Visit the page</a>
<br>
</body>
</html>