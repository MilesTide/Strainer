<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% String path = request.getContextPath(); %>
<% String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/"; %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath %>"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>监听页面</title>
</head>
<body background="img/bk6.jpg">
<div style="width:960px; margin:0px auto;" >
		<div style="text-algin:center; width:500px;margin:0px auto">
			<button onclick="javascript:window.location.href='start'">开启</button>
			<button onclick="javascript:window.location.href='end'">关闭</button>
		</div>
		<font color="red">${message }</font>
	</div>
</body>
</html>