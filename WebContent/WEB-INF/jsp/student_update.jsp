<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" %>
<%@page import="com.situ.ssm.pojo.*" %>
<%@page import="java.util.*" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
    
    <form action="${pageContext.request.contextPath}/student/update.action?id=${student.id}" method="post">
    
      姓名：<input type="text" name="name" value="${student.name }"/></br>
      年龄：<input type="text" name="age" value="${student.age}"/></br>
     性别：<input type="text" name="gender" value="${student.gender }"/></br>
     地址：<input type="text" name="address" value="${student.address }"/></br>
     
     班级：<select id="banji" name="banji_id" class="form-control">
			<c:forEach items="${list}" var="banji">
				<option value="${banji.id}">${banji.name}</option>
			</c:forEach>

		</select> 
	<input type="submit" value="修改"/> 

    </form>
</body>
</html>