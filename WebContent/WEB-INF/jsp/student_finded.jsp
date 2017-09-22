<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@page import="com.situ.ssm.pojo.*"%>
<%@page import="java.util.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/lib/jquery/jquery-1.11.1.js"></script>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/lib/bootstrap/css/bootstrap.css" />
<title>Insert title here</title>
</head>
<body>
	<div class="container" width=60%>
		<table class="table container">
			<tr>
				<td>id</td>
				<td>姓名</td>
				<td>年龄</td>
				<td>性别</td>
				<td>地址</td>
				<td>班级</td>
			</tr>
			<c:forEach items="${list}" var="student">
				<tr>
					<td>${student.id}</td>
					<td>${student.name}</td>
					<td>${student.age}</td>
					<td>${student.gender}</td>
					<td>${student.address}</td>
					<td>${student.banji.name}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>