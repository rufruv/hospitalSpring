<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<style>
	.header{
	    background-color: #434343;
	    position: relative;
	    z-index: 502;
	    height: 40px;
	    color: #ffffff;
	    padding: 0 12px 0 33px;
	    font-family: '맑은 고딕'; 
	}
	.header_menu{
		list-style: none;
	}
		.header_menu li{
		float:left;
	}
		.header_menu li a{
		display: block;
	}
</style>
<div id="header" class="header">
	<div style="float: left;text-align: center;margin-top: 10px;">대한민국</div>
	<div style="float: right;margin-top: 10px;margin-right: 20px;">
	<input type="text" size="20" class=""/>
	<a href="#"><span class="glyphicon glyphicon-search" aria-hidden="true" style="color: white;"></span></a>
	</div>
	<div>
	<ul class="header_menu" style="float: right;">
		<li><a href="#" style="color: white;margin-right: 10px;">나의 예약</a></li>
		<li><a href="#" style="color: white;margin-right: 10px">마이페이지</a></li>
		<li><a href="#" style="color: white;margin-right: 10px">로그아웃</a></li>
	</ul>
	</div>
</div>
