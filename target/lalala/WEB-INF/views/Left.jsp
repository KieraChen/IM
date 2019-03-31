<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:if test="${empty sessionScope.operator}">
  <c:redirect url="${pageContext.request.contextPath}/operator/Index.do"></c:redirect>
</c:if>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>左侧导航menu</title>
<link href="${pageContext.request.contextPath}/css/css.css" type="text/css" rel="stylesheet" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/sdmenu.js"></script>
<script type="text/javascript">
	// <![CDATA[
	var myMenu;
	window.onload = function() {
		myMenu = new SDMenu("my_menu");
		myMenu.init();
	};
	// ]]>
</script>
<style type=text/css>
html{ SCROLLBAR-FACE-COLOR: #538ec6; SCROLLBAR-HIGHLIGHT-COLOR: #dce5f0; SCROLLBAR-SHADOW-COLOR: #2c6daa; SCROLLBAR-3DLIGHT-COLOR: #dce5f0; SCROLLBAR-ARROW-COLOR: #2c6daa;  SCROLLBAR-TRACK-COLOR: #dce5f0;  SCROLLBAR-DARKSHADOW-COLOR: #dce5f0; overflow-x:hidden;}
body{overflow-x:hidden; background:url(${pageContext.request.contextPath}/images/main/leftbg.jpg) left top repeat-y #f2f0f5; width:194px;}
</style>
</head>
<body onselectstart="return false;" ondragstart="return false;" oncontextmenu="return false;">
<div id="left-top">
	<div><img src="${pageContext.request.contextPath}/images/avtar.png" width="44" height="44" /></div>
    <span>用户：${operator.szsignonname}<br>权限：${operator.szsignonpassword == 0 ? "普通管理员" : "超级管理员"}</span>
</div>
    <div style="float: left" id="my_menu" class="sdmenu">
      <div>
        <span>后台首页</span>
        <a href="${pageContext.request.contextPath}/operator/Main.do" target="mainFrame" onFocus="this.blur()">后台首页</a>
      </div>
      <div class="collapsed">
        <span>系统管理</span>
        <a href="${pageContext.request.contextPath}/" target="mainFrame" onFocus="this.blur()">用户管理</a>
        <a href="${pageContext.request.contextPath}/" target="mainFrame" onFocus="this.blur()">门店管理</a>
      </div>
      <div class="collapsed">
        <span>业务管理</span>
        <a href="${pageContext.request.contextPath}/" target="mainFrame" onFocus="this.blur()">收货</a>
        <a href="${pageContext.request.contextPath}/" target="mainFrame" onFocus="this.blur()">订货</a>
        <a href="${pageContext.request.contextPath}/" target="mainFrame" onFocus="this.blur()">退货</a>
        <a href="${pageContext.request.contextPath}/" target="mainFrame" onFocus="this.blur()">门店调拨</a>
        <a href="${pageContext.request.contextPath}/" target="mainFrame" onFocus="this.blur()">库存调整</a>
        <a href="${pageContext.request.contextPath}/" target="mainFrame" onFocus="this.blur()">盘点</a>
      </div>
      <div class="collapsed">
        <span>报表查询</span>
        <a href="${pageContext.request.contextPath}/" target="mainFrame" onFocus="this.blur()">收货历史</a>
        <a href="${pageContext.request.contextPath}/" target="mainFrame" onFocus="this.blur()">退货清单</a>
        <a href="${pageContext.request.contextPath}/" target="mainFrame" onFocus="this.blur()">调拨清单</a>
        <a href="${pageContext.request.contextPath}/" target="mainFrame" onFocus="this.blur()">库存调整清单</a>
      </div>
      
    </div>
</body>
</html>