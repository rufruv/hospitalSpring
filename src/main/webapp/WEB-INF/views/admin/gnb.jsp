<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div style="height: 120px;"></div>
<ul id="adminGnb">
		<li><a class="text_no_underline">회원가입</a></li>
		<li><a class="text_no_underline">로그인</a></li>
		<li><a class="text_no_underline">자유게시판</a></li>
		<li class="tooltip">
			<a href="#" class="text_no_underline">병원소개</a>
			<span class="tooltiptext">구현되지 않은 기능입니다.</span>
		</li>
</ul>
<script>
$(function() {
	$('#adminGnb').addClass('gnb width_full_size').css('font-size','15px').css('height','38%');
	$('#adminGnb li:nth-child(1)').click(function() {
		alert('테스트 : 홈으로 클릭!');
		location.href="join.html";
	});
	$('#adminGnb li:nth-chile(2)').click(function() {
		alert('테스트 : 로그인');
		location.href="login.html";
	});
	$('#adminGnb li:nth-chile(3)').click(function() {
		alert('테스트 : 자유게시판');
		location.href="../bbs/bbs_list.html";
	});
});
</script>