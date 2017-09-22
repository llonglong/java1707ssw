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
<!-- <script type="text/javascript">
	function goPage(pageIndex) {
		$('#pageIndex').val(pageIndex);
		$('#searchForm').submit();
	}
	$(function() {
		$("#gender option[value='${searchCondition.gender}']").prop("selected",
				true);
	});
	
	
	function selectAlls() {
	    $("input[name=selectIds]").prop("checked", $("#selectAll").is(":checked"));
	}
	
	function deleteAll(){
	    var isDel = confirm("您确认要删除吗？");
	    if (isDel) {
	       //要删除
	       $("#mainForm").attr("action", "${pageContext.request.contextPath}/students?method=deleteAll");
	       $("#mainForm").submit();
	    }
	}


</script> -->
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/lib/bootstrap/css/bootstrap.css" />
</head>
<body>


	<div class="container" width=60%>
		<form id="searchForm" action="${pageContext.request.contextPath}/student/findByCondition.action" method="post">
			 姓名:<input type="text" name="name" value="${searchCondition.name}" /> 
			 年龄:<input type="text" name="age" value="${searchCondition.age}" /> 
			 性别:<select id="gender" name="gender">
				<option value="">不限</option>
				<option value="男">男</option>
				<option value="女">女</option>
			</select>
			<button class="btn btn-danger">搜索</button>
		</form>
		
		<table class="table container">
			<tr>
				<td>id</td>
				<td>姓名</td>
				<td>年龄</td>
				<td>性别</td>
				<td>地址</td>
				<td>班级</td>
				<td>删除</td>
				<td>修改</td>
			</tr>
			<c:forEach items="${list}" var="student">
				<tr>

					<td>${student.id}</td>
					<td>${student.name}</td>
					<td>${student.age}</td>
					<td>${student.gender}</td>
					<td>${student.address}</td>
					<td>${student.banji.name}</td>
					<td><a
						href="${pageContext.request.contextPath}/student/deleteById.action?id=${student.id}">删除</a></td>
					<td><a
						href="${pageContext.request.contextPath}/student/findById.action?id=${student.id}">修改</a></td>

				</tr>
			</c:forEach>
		</table>
		<a href="${pageContext.request.contextPath}/student/getTurn.action">添加学生</a><br>
		<a href="${pageContext.request.contextPath}/student/findBanjiCourseInfo.action">学生班級课程信息</a><br>
		<a href="${pageContext.request.contextPath}/banjiCourse/findBanjiCourse.action">班級课程信息</a><br>
	</div>


</body>
</html>