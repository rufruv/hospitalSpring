<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<body>
<div>
	이름 : <%= request.getParameter("name") %><br/>
	주민번호 : <%= request.getParameter("ssn") %>
</div>
<%
String name = request.getParameter("name");
String ssn = request.getParameter("ssn");
char ch = ssn.charAt(7);
String gender = "";
if (ch == '0' || ch == '7' || ch == '8' || ch == '9') {
	gender = "다시 입력하세요";
	return;
}
if (ch == '1' || ch == '3') {
	gender = "남자";
} else if (ch == '2' || ch == '4') {
	gender = "여자";
} else {
	gender = "외국인";
}
%>
<%= name %>님의 성별은 <%= gender %>입니다.
</body>
</html>