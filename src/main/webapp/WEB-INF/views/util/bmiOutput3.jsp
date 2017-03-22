<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>BMI 측정</title>
</head>
<body>
<div>
나이 : <%= request.getParameter("age") %>세<br/>
몸무게 : <%= request.getParameter("kg") %>kg<br/>
키 : <%= request.getParameter("cm") %>cm<br/>
</div>
<%
	int age=Integer.parseInt(request.getParameter("age"));
	double weight=Double.parseDouble(request.getParameter("age"));
	double height=Double.parseDouble(request.getParameter("kg"));
	double bmi= weight / ((height/100) * (height/100));
	String grade = ""; 
	if (bmi > 30.0) {
		grade = "고도비만";
	} else if (bmi > 25.0) {
		grade = "비만";
	} else if (bmi > 23.0) {
		grade = "과체중";
	} else if (bmi > 18.5) {
		grade = "정상";
	} else {
		grade = "저체중";
	}
%>
결과: <%= grade %>
</body>
</html>