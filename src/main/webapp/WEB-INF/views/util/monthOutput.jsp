<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>Document</title>
</head>
<body>

<div>
	YEAR : <%= request.getParameter("year")%>년<br /> 
	MONTH : <%= request.getParameter("month")%>월
</div>
<%
	int year = Integer.parseInt(request.getParameter("year")); 
	int month = Integer.parseInt(request.getParameter("month"));
	String day = "";
	switch (month) {
	case 1:
	case 3:
	case 5:
 	case 7:
	case 8:
	case 10:
	case 12:
		day = "31";
		break;
	case 4:
	case 6:
	case 9:
	case 11:
		day = "30";
		break;
	case 2:
		if (year % 4 == 0 && year % 100 != 0) {
			day = "29";
		} else if (year % 400 == 0) {
			day = "29";
		} else {
			day = "28";
		}
		break;
	default:
			day = "잘못된 입력값입니다.";
		return;
		}
%>
<%= year %>년, <%= month %>월은 <%= day %>일입니다.
</body>
</html>