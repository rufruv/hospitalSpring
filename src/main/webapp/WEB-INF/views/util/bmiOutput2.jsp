<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>BMI 측정</title>
</head>
<body>
<%!
public String getBmi(double weight, double height){
	String grade = "";
	double bmi= weight / ((height/100) * (height/100));
	 
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
	return grade;
}
%>
<%
	int age = Integer.parseInt(request.getParameter("age"));
	double weight = Double.parseDouble(request.getParameter("kg"));
	double height = Double.parseDouble(request.getParameter("cm"));
%>
<div>
나이 : <%= age %>세<br/>
몸무게 : <%= weight %>kg<br/>
키 : <%= height %>cm<br/>
</div>
결과: <%= getBmi(weight, height)  %>
</body>
</html>