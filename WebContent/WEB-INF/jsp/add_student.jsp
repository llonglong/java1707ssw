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
		<form action="${pageContext.request.contextPath}/student/add.action"
			method="post" class="form_border">

			<div class="form-group">
				<label>姓名</label> <input type="text" name="name"
					value="${student.name}" class="form-control" id="name"><span
					id="nameInfo"></span><br />
			</div>
			<div class="form-group">
				<label>年龄</label> <input type="text" name="age"
					value="${student.age }" class="form-control" id="name"><br />
			</div>
			<div class="form-group">
				<label>性别</label> <input type="text" name="gender"
					value="${student.gender }" class="form-control" id="name"><br />
			</div>
			<div class="form-group">
				<label>地址</label> <input type="text" name="address"
					value="${student.address }" class="form-control" id="name"><br />
			</div>
			<div class="form-group">
				<label>班级</label> 
				<select id="banji" name="banji_id" class="form-control">
					<c:forEach items="${list}" var="banji">
						<option value="${banji.id}">
							${banji.name}</option>
					</c:forEach>

				</select>
			</div>
			<input class="btn btn-success btn-lg" type="submit" value="添加" />
		</form>
	</div>
</body>
</html>