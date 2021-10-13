<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<% String path = request.getContextPath(); %>
<% String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/"; %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath %>"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>不良信息展示页面</title>
<style type="text/css">
*{margin:0px; padding:0px;}
</style>
</head>
<body background="images/bk6.jpg">
<div style="width:1000px; margin:0px auto;">
	<div>
		<img src="images/error.png"/>
		<br/>
	
	</div>
	<br/>
	<br/>
</div>
</body>
</html>