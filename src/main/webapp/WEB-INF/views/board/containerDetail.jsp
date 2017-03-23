<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div style="height: 120px;"></div>

<table id="articleDetail">
	<tr>
		<td>안녕하세요</td>
	</tr>
	<tr>
		<td>작성자:홍길동</td>
	</tr>
	<tr>
		<td>안녕 안녕 안녕 안녕</td>
	</tr>
	<tr>
		<td>
			<input type="button" value="목록으로" />
		</td>
	</tr>
</table>
<script>
$(function() {
	var $articleDetail = $('#articleDetail');
	$articleDetail.addClass('table_default').addClass('margin_center').css('width','500px').css('margin-top','100px');
	$articleDetail.find('tr').css('text-align','center');
	$articleDetail.find('tr:nth-child(1)').find('td').css('text-align','center');
	$articleDetail.find('tr:nth-child(2)').find('td').css('text-align','right');
	$articleDetail.find('tr:nth-child(3)').find('td').css('text-align','left');
	$articleDetail.find('tr:nth-child(4)').find('td').css('text-align','center');
});
</script>