<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>
	<p>这是个页面</p>
	<div>
		<table border="2px solid black" width="1200px">
			<tr>
				<td>图书编号</td>
				<td>图书名称</td>
				<td>图书类型</td>
				<td>作者</td>
				<td>译者</td>
				<td>出版社</td>
				<td>价格</td>
				<td>页码</td>
				<td>书架</td>
				<td>库存总量</td>
				<td>入库时间</td>
				<td>删除</td>
			</tr>
			<c:forEach items="${data}" var="d">
				<tr>
					<td>${d.bookcode}</td>
					<td>${d.bookname}</td>
					<td>${d.type}</td>
					<td>${d.autor}</td>
					<td>${d.translator}</td>
					<td>${d.pubname}</td>
					<td>${d.price}</td>
					<td>${d.page}</td>
					<td>${d.bcase}</td>
					<td>${d.storsge}</td>
					<td><fmt:formatDate value="${d.inTime}" pattern="yyyy/MM/dd HH:mm:ss"/></td>
					<td><a>删除</a></td>
				</tr>
			</c:forEach>
		</table>
		<div><a href="/book">返回</a></div>
	</div>
</body>
</html>