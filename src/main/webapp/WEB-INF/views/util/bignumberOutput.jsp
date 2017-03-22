<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%-- <%@ page import="util.BigNumber" %> --%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<body>
	<%-- A값: <%= request.getParameter("a") %><br/>
	B값: <%= request.getParameter("b") %><br/>
	C값: <%= request.getParameter("c") %><br/>
<%
	BigNumber bn = new BigNumber();
	int a = Integer.parseInt(request.getParameter("a"));
	int b = Integer.parseInt(request.getParameter("b"));
	int c = Integer.parseInt(request.getParameter("c"));
%>
순서대로 나열하면, <%= bn.getBigNumber(a, b, c) %> --%>
</body>
</html>