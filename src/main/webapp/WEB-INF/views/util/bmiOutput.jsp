<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%-- <%@ page import="util.Bmi" %> --%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>BMI 측정</title>
</head>
<body>

<%-- <%
	/* Bmi bmi = new Bmi(); */
 	int age  = Integer.parseInt(request.getParameter("age"));
 	double weight = Double.parseDouble(request.getParameter("kg"));
 	double height = Double.parseDouble(request.getParameter("cm"));
%>
<div>
나이 : <%= age %>세<br/>
몸무게 : <%= weight %>kg<br/>
키 : <%= height %>cm<br/>
</div>

결과: <%= new Bmi().getBmi(weight,height)%> --%>
</body>
</html>