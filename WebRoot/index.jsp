<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<%String ctxPath=request.getContextPath(); %>
<meta charset="UTF-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<link href="<%=ctxPath%>/css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="<%=ctxPath%>/css/H-ui.admin.css" rel="stylesheet" type="text/css" />
<link href="<%=ctxPath%>/css/style.css" rel="stylesheet" type="text/css" />
<link href="<%=ctxPath%>/lib/Hui-iconfont/1.0.1/iconfont.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="<%=ctxPath%>/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="<%=ctxPath%>/js/H-ui.js"></script> 
<script type="text/javascript" src="<%=ctxPath%>/js/H-ui.admin.js"></script> 
<link href="<%=ctxPath%>/skin/default/skin.css" rel="stylesheet" type="text/css" id="skin" />
<title>欢迎使用不良小说过滤系统</title>
<script type="text/javascript">
	function fun(){
		var a = confirm('你确定要退出吗？');
		if(a){
			window.location.href="login.jsp";
		}else{
			return false;
		}
	}
	
</script>
</head>
<body>
<header class="Hui-header cl"> 
    <a class="Hui-logo l" title="欢迎使用不良小说过滤系统">欢迎使用不良小说过滤系统</a> 
	<ul class="Hui-userbar">
		<li class="dropDown dropDown_hover"><a class="dropDown_A">退出<i class="Hui-iconfont">&#xe6d5;</i></a>
			<ul class="dropDown-menu radius box-shadow">
				<li><a href="exit.jsp">退出</a></li>
			</ul>
		</li>
		<li id="Hui-skin" class="dropDown right dropDown_hover"><a href="javascript:;" title="换肤"><i class="Hui-iconfont" style="font-size:18px">&#xe62a;</i></a>
			<ul class="dropDown-menu radius box-shadow">
				<li><a href="javascript:;" data-val="default" title="默认（黑色）">默认（黑色）</a></li>
				<li><a href="javascript:;" data-val="blue" title="蓝色">蓝色</a></li>
				<li><a href="javascript:;" data-val="green" title="绿色">绿色</a></li>
				<li><a href="javascript:;" data-val="red" title="红色">红色</a></li>
				<li><a href="javascript:;" data-val="yellow" title="黄色">黄色</a></li>
				<li><a href="javascript:;" data-val="orange" title="绿色">橙色</a></li>
			</ul>
		</li>
	</ul>
	<a aria-hidden="false" class="Hui-nav-toggle" href="#"></a> </header>
    <aside class="Hui-aside">
    	<input runat="server" id="divScrollValue" type="hidden" value="" />
    	<div class="menu_dropdown bk_2">
    		<dl id="menu-comments">
    			<dt><i class="Hui-iconfont">&#xe62e;</i>系统管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
    			<dd>
    				<ul>
                        <li><a _href="openListener.jsp" href="javascript:void(0)">监听页面</a></li>
                        <li><a _href="configflag.jsp" href="javascript:void(0)">配置阈值</a></li>
                        <li><a _href="addBadWords.jsp" href="javascript:void(0)">添加不良词汇</a></li>  
    				</ul>
    			</dd>
    		</dl>
    	</div>
    </aside>
<div class="dislpayArrow"><a class="pngfix" href="javascript:void(0);" onClick="displaynavbar(this)"></a></div>
<section class="Hui-article-box">
	<div id="Hui-tabNav" class="Hui-tabNav">
		<div class="Hui-tabNav-wp">
			<ul id="min_title_list" class="acrossTab cl">
				<li class="active"><span title="我的桌面" data-href="welcome.jsp">我的桌面</span><em></em></li>
			</ul>
		</div>
		<div class="Hui-tabNav-more btn-group"><a id="js-tabNav-prev" class="btn radius btn-default size-S" href="javascript:;"><i class="Hui-iconfont">&#xe6d4;</i></a><a id="js-tabNav-next" class="btn radius btn-default size-S" href="javascript:;"><i class="Hui-iconfont">&#xe6d7;</i></a></div>
	</div>
	<div id="iframe_box" class="Hui-article">
		<div class="show_iframe">
			<div style="display:none" class="loading"></div>
			<iframe scrolling="yes" frameborder="0" src="welcome.jsp"></iframe>
		</div>
	</div>
</section>

</body>
</html>