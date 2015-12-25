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
	<p>这是个页面</p>
	<form action="/add" method="post">
		<div>图书名称:<input name="bookname" type="text"/></div>
		<div>图书类型:<input name="type" type="text"/></div>
		<div>作&nbsp;&nbsp;者:<input name="autor" type="text"/></div>
		<div>译&nbsp;&nbsp;者:<input name="translator" type="text"/></div>
		<div>出版社&nbsp;:<input name="pubname" type="text"/></div>
		<div>价&nbsp;&nbsp;格:<input name="price" type="text"/></div>
		<div>页&nbsp;&nbsp;码:<input name="page" type="text"/></div>
		<div>书&nbsp;&nbsp;架:<input name="bcase" type="text"/></div>
		<div>存储数量:<input name="storsge" type="text"/></div>
		<div><input type="submit"/></div>
	</form>
	<p>${result.msg}</p>
</body>
</html>