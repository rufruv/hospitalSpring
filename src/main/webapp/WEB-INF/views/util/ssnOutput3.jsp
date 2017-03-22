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
	나이 : <%= request.getParameter("age") %><br/>
	주민번호 : <%= request.getParameter("ssn") %>
</div>
<%-- <%
	
	int age = Integer.parseInt(request.getParameter("age"));
	String name = request.getParameter("name");
	String ssn = request.getParameter("ssn");

	if(age<2){
%>
	2살 미만은 계산이 어렵습니다. 다시입력하세요.
<%
	}else{
%>
<%= name %>님의 성별은 <%= s.getSsn(name, ssn) %>입니다.<%}%> --%>
</body>
</html>