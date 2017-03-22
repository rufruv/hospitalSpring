<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<body>
<div>
	이름: <%= request.getParameter("name") %><br/>
	국어점수: <%= request.getParameter("korea") %><br/>
	영어점수: <%= request.getParameter("english") %><br/>
	수학점수: <%= request.getParameter("math") %><br/>
</div>
<%-- <%
	ReportCard rc = new ReportCard();
	int korea = Integer.parseInt(request.getParameter("korea"));
	int english = Integer.parseInt(request.getParameter("english"));
	int math = Integer.parseInt(request.getParameter("math"));
	
	String[] arr = rc.getGrade(korea, english, math);
	
%> --%>
<%-- <%= rc.getGrade(korea, english, math) %> --%>
<%-- 총점: <%= arr[0] %>, 평균: <%= arr[1] %>, 등급: <%= arr[2] %> --%>
</body>
</html>