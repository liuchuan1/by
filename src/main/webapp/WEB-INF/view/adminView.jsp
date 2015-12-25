<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<title>Insert title here</title>
	<script type="text/javascript" src="../../static/front/js/jquery-1.4.3.js"></script>
	<script type="text/javascript">
		function hides(){
			$("#te").hide();
			$("#ad").show();
		}
	</script>
	<script type="text/javascript">
		$(function(){
			$("#qd").click(function(){
				var name = $("#yh").val();
				var pwd = $("#mm").val();
				$.ajax({
					url:"loginadd",
					type:"post",
					data:{
						"td_name":name,
						"td_pwd":pwd
					},
					success:function(result){
						alert(result.msg)
					}
				});
			});
		}) ;
	</script>
	
	<script type="text/javascript">
		function hid(){
			$("#te").show();
		}
	</script>
</head>
	<body>
		<p>这是系统管理员管理页面</p>
		<ol>
			<li id="ck"><a onclick="hid()" href="loginfindAllAdmin" >查看用户</a></li>
			<li><a href="javascript:;" onclick="hides()">添加用户</a></li>
		</ol>
		
		<div id="ad" style="display:none">
			<div>
				用户名:<input id="yh" type="text"/>
			</div>
			<div>
				密&nbsp;码:<input id="mm" type="password"/>
			</div>
			<div><input id="qd" type="button" value="确定"/></div>
		</div>
		
		<div id="te">
			<c:if test="${status == 1}">
				alert(${msg})
			</c:if>
			<c:if test="${status == 0}">
				<span>${msg}</span>
			</c:if>
			<table border="1px solid black" width="450px">
				<tr>
					<td>id</td>
					<td>用户名</td>
					<td>密码</td>
					<td colspan="2">工具按钮</td>
				</tr>
				<c:forEach items="${data}" var="d">
					<tr>
						<td>${d.id}</td>
						<td>${d.td_name}</td>
						<td>${d.td_pwd}</td>
						<td><a href="">修改</a></td>
						<td><a href="logindel?id=${d.id}" onclick="return confirm('确定删除${item.stu_name}吗?');">删除</a></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</body>
</html>