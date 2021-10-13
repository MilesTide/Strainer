<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<%  String ctxPath=request.getContextPath();  %>
<meta charset="utf-8">
<link href="<%=ctxPath%>/css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="<%=ctxPath%>/css/H-ui.login.css" rel="stylesheet" type="text/css" />
<title>登录 页面</title>
</head>
<body>
<div class="loginWraper">
  <div id="loginform" class="loginBox">
    <form class="form form-horizontal" id="formLogin" method="post">
    	<div class="row cl">
    	<div class="formControls col-2"></div>
        <div class="formControls col-10">
      <h1>欢迎使用不良小说过滤系统</h1>
        </div>
      </div>
    <div class="row cl">
    	<div class="formControls col-3"></div>
        <div class="formControls col-9">
        </div>
      </div>
     <div class="row cl">
    	<div class="formControls col-3"></div>
        <div class="formControls col-9">
        </div>
      </div>
      <div class="row cl">
    	<div class="formControls col-3"></div>
        <div class="formControls col-9">
        </div>
      </div>
     
      <div class="row">
        <div class="formControls col-8 col-offset-5">
          <a href="index.jsp" type="button" class="btn btn-success size-L"> &nbsp;进&nbsp;&nbsp;&nbsp;&nbsp;入&nbsp;</a>
        </div>
      </div>
    </form>
  </div>
</div>
<footer class="footer">
  <p style="font-size:20px;">菏泽学院一队</p>
</footer>
<script>
/* <script type="text/javascript"> */
var _hmt = _hmt || [];
(function() {
  var hm = document.createElement("script");
  hm.src = "//hm.baidu.com/hm.js?080836300300be57b7f34f4b3e97d911";
  var s = document.getElementsByTagName("script")[0]; 
  s.parentNode.insertBefore(hm, s);
})();
var _bdhmProtocol = (("https:" == document.location.protocol) ? " https://" : " http://");
</script>
</body>
</html>