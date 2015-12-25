<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>
	<p>读者添加页面</p>
	<form action="/addreader" method="post">
		<div>读者姓名:<input name="name" type="text"/></div>
		<div>性&nbsp;&nbsp;别:<input name="sex" type="text"/></div>
		<div>联系方式:<input name="tel" type="text"/></div>
		<div>可借数量:<input name="borrownum" type="text"/></div>
		<div><input type="submit" value="确定"/></div>
	</form>
	<p>${reault.msg}</p>
</body>
</html>