<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% String path = request.getContextPath(); %>
<% String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/"; %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath %>"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body background="images/bk6.jpg">
	<font color="red">注：默认等级为低</font>
	<hr/>
	<form method="post" action="configFlag">
		过滤等级：
		<input type="radio" name="flag" value="20" id="height" <c:if test='${flag==20 }'>checked="checked"</c:if> />高 &nbsp;
		<input type="radio" name="flag" value="35" id="mid" <c:if test='${flag==35 }'>checked="checked"</c:if> />中&nbsp;
		<input type="radio" name="flag" value="50" id="low" <c:if test='${flag==50 }'>checked="checked"</c:if> />低&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color="red">${message}</font>
		<br/>
		<input type="submit" value="提交"/>
	</form>
</body>
</html>