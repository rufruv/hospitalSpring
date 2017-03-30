<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<div id="container" class="width_full_size" style="height:700px;">
<div>
	<table class="table_default margin_center" style="width:377px; font-size: 14px; margin-top:50px;">
		<tr>
			<td colspan="3"class="text_right"><span><a href="admin.html" class="text_no_underline">To List ▶</a></span></td>
		</tr>
		<tr>
			<td rowspan="3" style="width:150px; height:150px"><img src="${context.img}/common/doc_img.png" style="width:150px; height:150px" class="margin_center"/></td>
			<td style="height:50px; padding-left:10px;">의사 ID</td>
			<td style="height:50px; padding-left:10px;">${user.id}</td>
			
		</tr>
		<tr>
			<td style="height:50px; padding-left:10px;">전 공</td>
			<td style="height:50px; padding-left:10px;">${user.major}</td>
		</tr>
		<tr>
			<td style="height:50px; padding-left:10px;">성 별</td>
			<td style="height:50px; padding-left:10px;">${user.gen}</td>
		</tr>
		<tr>
			<td rowspan="2" class="text_center"><span style="font-size: 17px;"><b>${user.name}</b></span> ${user.position}</td>
			<td style="height:50px; padding-left:10px;">전 화</td>
			<td style="height:50px; padding-left:10px;">${user.phone}</td>
		</tr>
		<tr>
			<td style="height:50px; padding-left:10px;">이메일</td>
			<td style="height:50px; padding-left:10px;">${user.email}</td>
		</tr>
		</table>
		</div>
		<div class="text_left margin_center" style="width:380px;">
			<a href="/" class="text_no_underline"><button class="button5" style="width:122px; height:50px;">담당환자</button></a>
			<a href="/" class="text_no_underline"><button class="button5" style="width:122px; height:50px;">담당진료</button></a>
			<a href="/" class="text_no_underline"><button class="button5" style="width:122px; height:50px;">담당차트</button></a>
		</div>
	</div>
</body>
</html>