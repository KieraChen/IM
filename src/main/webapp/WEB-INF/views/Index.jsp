<%@ page import="com.model.Operator" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	Operator o = (Operator) session.getAttribute("operator");
	if(o==null){
		response.sendRedirect("Login.do");
		return;
	} %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>超市库存管理系统</title>
<link rel="shortcut icon" href="${pageContext.request.contextPath}/images/favicon.ico" />
<link href="${pageContext.request.contextPath}/css/css.css" type="text/css" rel="stylesheet" />
</head>
<!--框架样式-->
<frameset rows="65,*" cols="*" frameborder="no" border="0" framespacing="0">
<!--top样式-->
	<frame src="${pageContext.request.contextPath}/operator/Top.do" name="topframe" scrolling="no" noresize id="topframe" title="topframe" />
<!--contact样式-->
	<frameset id="attachucp" framespacing="0" border="0" frameborder="no" cols="194,*" rows="*">
		<frame scrolling="auto" noresize="" frameborder="no" name="leftFrame" src="${pageContext.request.contextPath}/operator/Left.do"></frame>
		<frame scrolling="auto" noresize="" border="0" name="mainFrame" src="${pageContext.request.contextPath}/operator/Main.do"></frame>
	</frameset>

</frameset><noframes></noframes>
<noframes></noframes>
</html>
