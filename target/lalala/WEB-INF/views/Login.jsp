<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<title>登录页面</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${pageContext.request.contextPath}/css/style.css" rel='stylesheet' type='text/css' />
</head>
<body>
<h1>登录</h1>
<div class="login-form">
		<div class="head-info">
			${msg }
			<label class="lbl-1"> </label>
			<label class="lbl-2"> </label>
			<label class="lbl-3"> </label>
		</div>
	<div class="avtar">
		<img src="${pageContext.request.contextPath}/images/avtar.png" />
	</div>
			<form action='${pageContext.request.contextPath}/operator/checkOperator.do' method='post'>
					<input type="text" class="text" name='szsignonname' value="${cookie.c_name.value}" />
						<div class="key"> 
					    <input type="password" name='szsignonpassword' value="${cookie.c_pass.value}" />
						</div>
                        <div style='margin-bottom:20px'>
                    <input type='checkbox' name='save' value='1'/>
                    <span style='font-weight:bold; color:#CCC;'>信息保存一周</span>
                        </div>
			
	<div class="signin">
		<input type="submit" value="Login" >
	</div>
	        </form>
</div>

</body>
</html>