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
</head>
<body>


	<div class="container" width=60%>

		<table class="table container">
			<tr>
				<td>编号</td>
				<td>班级名称</td>
				<td>课程名称</td>
				<td>课程学分</td>
				<td>删除</td>
			</tr>
			<c:forEach items="${list}" var="bc">
				<tr>
					<td>${bc.id}</td>
					<td>${bc.banji.name}</td>
					<td>${bc.course.name}</td>
					<td>${bc.course.credit}</td>
					<td><a href="${pageContext.request.contextPath}/banjiCourse/deleteById.action?id=${bc.id}">删除</a></td>
				</tr>
			</c:forEach>

		</table>
		<a href="${pageContext.request.contextPath}/banjiCourse/banjiAddCourse.action?id=${bc.id}">班级添加课程</a>
	</div>


</body>
</html>