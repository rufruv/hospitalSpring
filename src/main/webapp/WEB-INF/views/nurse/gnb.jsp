<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div style="height: 70px;"></div>
<ul id="patGnb">		
		<li><a>홈으로</a></li>
		<li><a>마이페이지</a></li>
		<li><a>진료기록</a></li>
		<li><a>자유게시판</a></li>
		<li style="float:right"><a>로그아웃</a></li>
</ul>
<script>
$(function() {
	var patGnb=$('#patGnb');
	
	patGnb.addClass('gnb width_full_size').css('font-size','15px').css('height','38%');
	patGnb.find('li:nth-child(1)').click(function() {
		alert('테스트 : 홈으로 클릭!');
		goPage('${context.path}/home', 'move', 'main');
	});
	
	patGnb.find('li:nth-child(2)').click(function() {
		alert('테스트 : 마이페이지!');
		goPage('${context.path}/patient.do', 'mypage', 'detail');
	});
	
	patGnb.find('li:nth-child(3)').click(function() {
		alert('테스트 : 진료기록!');
		goPage('${context.path}/patient.do', 'move', 'treatmentList');
	});

	patGnb.find('li:nth-child(4)').click(function() {
		alert('테스트 : 자유게시판');
		goPage('${context.path}/board.do', 'move', 'articleList');
	});

	patGnb.find('li:nth-child(5)').click(function() {
		alert('테스트 : 로그아웃');
		goPage('${context.path}/home.do', 'logout', 'main');
	});
});
</script>