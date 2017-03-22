<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<body>

<%-- <%
	PatientService service = PatientServiceImpl.getInstance();
	PatientBean member = new PatientBean();
	member.setPatID(request.getParameter("id"));
	member.setPatPass(request.getParameter("password"));
	boolean ck = service.login(member);
	if(ck){	
%>
	<%= request.getParameter("id") %>님, <a href="/">내정보</a>
	<input type="button" value="로그아웃">
<%
	}else{
%>
		<h3>회원정보가 일치하지 않습니다.</h3>
		<a href="patLoginForm.jsp">뒤로 가기</a>
<% 	
	} 
%> --%>
</body>
</html>