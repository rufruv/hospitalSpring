<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div style="height: 120px;"></div>

<div id="container">
	<form id="registerForm" >
		<table>
		<tr>
				<td><p><select name="doctor">
						<option value="" selected>담당의사 선택</option>
						<option value="dlee">소아과 : 이태정</option>
						<option value="dahn">내과 : 안성기</option>
						<option value="dkim">외과 : 김민종</option>
						<option value="dkim2">소아과 : 김연아</option>
				</select> <select name="nurse">
						<option value="" selected>간호사 선택</option>
						<option value="nkim">소아과 : 김은영</option>
						<option value="nyoon">내과 : 윤성애</option>
						<option value="nshin">피부과 : 신지원</option>
						<option value="nyou">방사선과 : 유정화</option>
				</select></p></td>
			</tr>
			<tr>
				<td><div>
						<input type="text" name="id" placeholder="ID"/><input type="submit" value="중복확인"><br />
						<p class="color_red" style="font-size: 11px;">영문소문자 하나 이상을 포함한 영문+숫자만 입력해주세요</p>
						</div></td>
			</tr>
			<tr>
				<td><div>
						<input type="text" name="name" placeholder="이름"/> <br />
						<p class="color_blue" style="font-size: 12px;"></p>
						</div></td>
			</tr>
			<tr>
				<td><div>
						<input type="text" name="mail" placeholder="E-Mail"/>
						</div></td>
			</tr>
			<tr>
				<td><input type="password" name="password" placeholder="비밀번호"/>
					</td>
			</tr>
			<tr>
				<td><input type="password" name="passwordCheck" placeholder="비밀번호 확인" /><br/></td>
			</tr>	
			<tr>
				<td><input type="text" name="addr" placeholder="주소"/>
					<p style="font-size: 12px"></p>
				    </td>
			</tr>
			<tr>
				<td><p><select name="birth">
						<option value="" selected>태어난 연도 선택</option>
						<option value="1983">1983년</option>
						<option value="1982">1982년</option>
						<option value="1981">1981년</option>
						<option value="1980">1980년</option>
				</select> <select name="month">
						<option value="" selected>태어난 월 선택</option>
						<option value="01">1월</option>
						<option value="02">2월</option>
						<option value="03">3월</option>
						<option value="04">4월</option>
						<option value="05">5월</option>
						<option value="06">6월</option>
						<option value="07">7월</option>
						<option value="08">8월</option>
						<option value="09">9월</option>
						<option value="10">10월</option>
						<option value="11">11월</option>
						<option value="12">12월</option>
				</select> <select name="date">
						<option value="" selected>태어난 날짜 선택</option>
						<option value="01">1일</option>
						<option value="02">2일</option>
						<option value="03">3일</option>
						<option value="04">4일</option>
						<option value="05">5일</option>
						<option value="06">6일</option>
						<option value="07">7일</option>
						<option value="08">8일</option>
						<option value="09">9일</option>
						<option value="10">10일</option>
				</select></p></td>
			</tr>
			<tr>
				<td><p><select name="telecom">
						<option value="" selected>통신사 선택</option>
						<option value="skt">SKT</option>
						<option value="lgt">LGT</option>
						<option value="kt">KT</option>
				</select> <select name="phoneNo1">
						<option value="" selected>국번 선택</option>
						<option value="010">010</option>
						<option value="011">011</option>
						<option value="016">016</option>
						<option value="017">017</option>
						<option value="018">018</option>
						<option value="019">019</option>
				</select>-<input type="text" name="phoneNo2"/>-<input type="text" name="phoneNo3"/></p></td>
			</tr>
			<tr>
			<!--
			job: 회사원(employee), 개발자(developer), 스태프 (staff), 의사(doctor), 간호사(nurse), 관리자(administrator)
			  -->
				<td><b>직업 선택 (2개 이상 선택가능. 단 스태프는 병원관계만 체크하세요. )</b><br />
					<input type="checkbox" name="job" value="employee"/>회사원 
					<input type="checkbox" name="job" value="developer"/>개발자
					<input type="checkbox" name="job" value="staff"/>스태프<br/>
					<input type="checkbox" name="job" value="doctor"/>의사
					<input type="checkbox" name="job" value="nurse"/>간호사
					<input type="checkbox" name="job" value="admini"/>관리자<br/>
				</td>
			</tr>
			<tr>
				<td>
					<div>
						개인정보<br/>
						성별 :
						<input type="radio" name="gender" value="m"/>남성 
						<input type="radio" name="gender" value="f"/>여성<br />
					</div>
				</td>
			</tr>
			<tr style="text-align:center; width:100%" >
				<td>
					<input type="hidden" name="action" value="register" />
					<input type="hidden" name="page" value="main"/>
					<input style="background-color: #5e6869; color: white; width:99%; height:40px;" type="button" value="전송" name="submitBtn" />
				</td>
			</tr>
		</table>
		<input type="radio" name="type" value="patient" checked> 고객
		<input type="radio" name="type" value="doctor" > 의사
		<input type="radio" name="type" value="nurse"> 간호사
		<input type="radio" name="type" value="admin"> 관리자		
	</form>
	</div>

<script>
$(function() {
	var $registerForm = $('#registerForm');
	$registerForm.addClass('width_full_size').addClass('margin_center').css('margin-top','50px').css('height','550px').css('width','550px')
	var tab = $registerForm.find('table');
	tab.addClass('width_full_size').addClass('table_default')
	
	$('input[name=submitBtn]').click(function() {
		var type = $registerForm.find(':radio[name=type]:checked').val();
		alert('type: '+type);
		$registerForm.attr("action", "${context.path}/register/"+type);
		$registerForm.attr("method", "post");
		/* alert('전송직전'); */
		$registerForm.submit();
	});
	
});
</script>
