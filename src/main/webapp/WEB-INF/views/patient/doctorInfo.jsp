<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin</title>
<link rel="stylesheet" href="${css}/hanbit.css" />

</head>
<body>
<div id="wrapper" class="width_full_size">
<div id="header" class="width_full_size position_fix;" style="height:120px;">
	<div class="logo_box width_full_size text_center" style="height: 60%">
	<a href="../index.html"><img src="../images/index/index_logo.png" style="margin-top:20px;"></a>
	</div>
	<ul class="gnb width_full_size" style="font-size: 15px; height: 38%">
		<li><a href="join.html" class="text_no_underline">회원가입</a></li>
		<li><a href="login.html" class="text_no_underline">로그인</a></li>
		<li><a href="board.html" class="text_no_underline">자유게시판</a></li>
		<li class="dropdown"><a href="html/admin.html" class="text_no_underline">관리자</a>
			<div class="dropdown_content text_left" style="color:black">
				<p><a href="" class="text_no_underline">의 사</a></p>
				<p><a href="" class="text_no_underline">간호사</a></p>
				<p><a href="" class="text_no_underline">환 자</a></p>
				<p><a href="" class="text_no_underline">진 료</a></p>
				<p><a href="" class="text_no_underline">차 트</a></p>
			</div>
		</li>	
	</ul>
	</div>
<div style="height: 120px;"></div>
<div id="container" class="width_full_size" style="height:700px;">
<div>
	<table class="table_default margin_center" style="width:377px; font-size: 14px; margin-top:50px;">
		<tr>
			<td colspan="3"class="text_right"><span><a href="admin.html" class="text_no_underline">To List ▶</a></span></td>
		</tr>
		<tr>
			<td rowspan="3" style="width:150px; height:150px"><img src="../images/doc_img.png" style="width:150px; height:150px" class="margin_center"/></td>
			<td style="height:50px; padding-left:10px;">의사 ID</td>
			<td style="height:50px; padding-left:10px;">00601</td>
			
		</tr>
		<tr>
			<td style="height:50px; padding-left:10px;">전 공</td>
			<td style="height:50px; padding-left:10px;">내 과</td>
		</tr>
		<tr>
			<td style="height:50px; padding-left:10px;">성 별</td>
			<td style="height:50px; padding-left:10px;">M</td>
		</tr>
		<tr>
			<td rowspan="2" class="text_center"><span style="font-size: 17px;"><b>안성기</b></span> 과장</td>
			<td style="height:50px; padding-left:10px;">전 화</td>
			<td style="height:50px; padding-left:10px;">011-222-0987</td>
		</tr>
		<tr>
			<td style="height:50px; padding-left:10px;">이메일</td>
			<td style="height:50px; padding-left:10px;">ask@han.com</td>
		</tr>
		</table>
		</div>
		<div class="text_left margin_center" style="width:380px;">
			<a href="/" class="text_no_underline"><button class="button5" style="width:122px; height:50px;">담당환자</button></a>
			<a href="/" class="text_no_underline"><button class="button5" style="width:122px; height:50px;">담당진료</button></a>
			<a href="/" class="text_no_underline"><button class="button5" style="width:122px; height:50px;">담당차트</button></a>
		</div>
	</div>
<div id="footer" class="width_full_size" style="height:100px; border-top:2px solid #5a5a5a;">
	<dl class="notice">
		<dt><a href="/NOTICE" class="h_notice">공지사항</a></dt>
	</dl>
	<dl class="policy">
		<dd class="f"><a href="http://www.navercorp.com/" target="_blank" id="plc.intronhn">회사소개</a></dd>
		<dd><a href="http://mktg.naver.com/" id="plc.adinfo">광고</a></dd>
		<dd><a href="https://submit.naver.com/" id="plc.search">마이비즈니스</a></dd>
		<dd><a href="https://www.navercorp.com/ko/company/proposalGuide.nhn" target="_blank" id="plc.contact">제휴제안</a></dd>
		<dd><a href="rules/service.html" id="plc.service">이용약관</a></dd>
		<dd><a href="rules/privacy.html" id="plc.privacy"><strong>개인정보처리방침</strong></a></dd>
		<dd><a href="rules/youthpolicy.html" id="plc.youth">청소년보호정책</a></dd>
		<dd><a href="rules/spamcheck.html" id="plc.policy">네이버 정책</a></dd>
		<dd><a href="https://help.naver.com/" id="plc.helpcenter">네이버 고객센터</a></dd>
	</dl>
	<address>&copy; <strong><a href="http://www.navercorp.com/" target="_blank">NAVER Corp.</a></strong></address>
</div>
</div>
</body>
</html>