<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>
	<P>所有用户显示页面</P>
	<table border="1px solid black" width="600px">
		<tr>
			<td>用户ID</td>
			<td>用户姓名</td>
			<td>用户性别</td>
			<td>联系方式</td>
			<td>注册时间</td>
			<td>可借次数</td>
		</tr>
		<c:forEach items="${data}" var="d">
			<tr>
				<td>${d.id}</td>
				<td>${d.name}</td>
				<td>${d.sex}</td>
				<td>${d.tel}</td>
				<td><fmt:formatDate value="${d.createdate}" pattern="yyyy/MM/dd HH:mm:ss"/></td>
				<td>${d.borrownum}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>