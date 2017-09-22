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
				<td>学生id</td>
				<td>学生姓名</td>
				<td>班级名称</td>
				<td>课程名称</td>
				<td>课程学分</td>
			</tr>
			<c:forEach items="${list}" var="student">
				<c:forEach items="${student.banji.courseList}" var="course">	
				<tr>
					<td>${student.id}</td>
					<td>${student.name}</td>
					<td>${student.banji.name}</td>
					<td>${course.name}</td> 
					<td>${course.credit}</td>					
				</tr>
				</c:forEach>
			</c:forEach>
		</table>
		
		
	</div>


</body>
</html>