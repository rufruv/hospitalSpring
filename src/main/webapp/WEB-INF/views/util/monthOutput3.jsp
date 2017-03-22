<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%-- <%@ page import="util.Month" %> --%>
<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>Document</title>
</head>
<body>
<%-- <%
	Month mon = new Month();
	int year = Integer.parseInt(request.getParameter("year"));
	int month= Integer.parseInt(request.getParameter("month"));
%>
<div>
	YEAR : <%= request.getParameter("year") %>년<br /> 
	MONTH : <%= request.getParameter("month") %>월
</div>
<%= year %>년, <%= month %>은 <%= mon.getMonth(year, month) %>일입니다. --%>
</body>
</html>