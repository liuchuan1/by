<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
<script type="text/javascript" src="../../static/front/js/jquery-1.4.3.js"></script>
<script type="text/javascript">
	$(function(){
		$("#qd").click(function(){
			var name = $("#yh").val();
			var pwd = $("#mm").val();
			$.ajax({
				url:"/user",
				type:"post",
				data:{
					"td_name":name,
					"td_pwd":pwd},
				dataType:"json",
				success:function(result){
					if(result.strues == 1){
						alert(result.msg);
					}
					if(result.strues == 2){
						alert(result.msg);
					}
					if(result.strues == 0){
						alert(result.msg);
						window.location.href="book"
					}
				}
			});
		});
	});
</script>
</head>
<body>
	<p>这是页面</p>
	<div>
		<div>用户名:<input id="yh" type="text"/></div>
		<div>密&nbsp;码:<input id="mm" type="password"/></div>
		<div><input id="qd" type="button" value="确定"/></div>
	</div>
</body>
</html>