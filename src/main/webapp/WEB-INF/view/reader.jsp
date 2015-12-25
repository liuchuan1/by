<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<script type="text/javascript" src="../../static/front/js/jquery-1.4.3.js"></script>
<script type="text/javascript" src="../../static/front/js/findbook.js"></script>
<script type="text/javascript">
	function borrow(){
		var userid = ${data.id};
		var name = $("#mc").val();
		$.ajax({
			url:"/borrow",
			type:"post",
			data:{"readid":userid,"bookname":name},
			dataType:"json",
			success:function(result){
				alert(result.msg);
			}
		});
	}
</script>
<title>Insert title here</title>
</head>
<body>
	<p>这是个页面</p>
	<table border="2xp solid black" width="700px">
		<tr>
			<td>用户ID</td>
			<td>用户姓名</td>
			<td>用户性别</td>
			<td>联系方式</td>
			<td>注册时间</td>
			<td>可借次数</td>
		</tr>
			<tr>
				<td>${data.id}</td>
				<td>${data.name}</td>
				<td>${data.sex}</td>
				<td>${data.tel}</td>
				<td><fmt:formatDate value="${data.createdate}" pattern="yyyy/MM/dd HH:mm:ss"/></td>
				<td>${data.borrownum}</td>
			</tr>
	</table>
	<table border="2xp solid black" width="700px">
		<tr>
			<td>图书名称</td>
			<td>图书编号</td>
			<td>图书类型</td>
			<td>出版社</td>
			<td>书架</td>
			<td>库存总数</td>
			<td>功能按钮</td>
		</tr>
		<tr>
			<td><input id="mc" type="text" onblur="findn()"/></td>
			<td id="num"></td>
			<td id="ty"></td>
			<td id="pb"></td>
			<td id="bs"></td>
			<td id="sg"></td>
			<td><a href="javascript:;" onclick="borrow()">借阅</a></td>
		</tr>
	</table>
	<table border="2xp solid black" width="700px">
		<tr>
			<td>借书编号</td>
			<td>图书名称</td>
			<td>借阅时间</td>
			<td>应还时间</td>
			<td>功能按钮</td>
		</tr>
		<c:forEach items="${dat}" var="d">
			<tr>
				<td>${d.id}</td>
				<td>${d.bookname}</td>
				<td><fmt:formatDate value="${d.borrowtime}" pattern="yyyy/MM/dd HH:mm:ss"/></td>
				<td><fmt:formatDate value="${d.ygbacktime}" pattern="yyyy/MM/dd HH:mm:ss"/></td>
				<td><a>归还</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>