<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% String path = request.getContextPath(); %>
<% String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/"; %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath %>"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加不良词汇页面</title>
</head>
<body background="images/bk6.jpg">
<form action="addBadWords" method="post">
<font color="red">${message}</font>
	<table>
		<tr><td>不良词汇：</td>
			<td>
				<textarea rows="3" cols="24" id="badText" name="badText" >
				</textarea>
			</td>
		</tr>
		
		<tr>
			<td><input type="submit" value="提交 "/></td>
			<td><input type="reset" value="重置"/></td>
		</tr>
	</table>
</form>
</body>
</html>