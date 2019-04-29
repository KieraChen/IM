<%@ page import="com.model.Operator" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
  Operator o = (Operator) session.getAttribute("operator");
  if(o==null){
    response.sendRedirect("Index.do");
    return;
  } %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>门店调拨页3</title>
<script language='javascript' src='${pageContext.request.contextPath}/js/tool.js'></script>
<link href="${pageContext.request.contextPath}/css/css.css" type="text/css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/css/main.css" type="text/css" rel="stylesheet" />
<link rel="shortcut icon" href="${pageContext.request.contextPath}/images/main/favicon.ico" />
<style>
body{overflow-x:hidden; background:#f2f0f5; padding:15px 0px 10px 5px;}
#searchmain{ font-size:16px;}
#search{ font-size:16px; background:#548fc9; margin:10px 10px 0 0; display:inline; width:100%; color:#FFF; float:left}
#search form span{height:40px; line-height:40px; padding:0 0px 0 10px; float:left;}
#search form select.text-word{height:24px; line-height:24px; width:180px; margin:8px 0 6px 0; padding:10px 0px 0 10px; float:left; border:1px solid #FFF;}
#search form input.text-word{height:24px; line-height:24px; width:180px; margin:8px 0 6px 0; padding:10px 0px 0 10px; float:left; border:1px solid #FFF;}
#search form input.text-but{height:24px; line-height:24px; width:55px; background:url(${pageContext.request.contextPath}/images/main/list_input.jpg) no-repeat left top; border:none; cursor:pointer; font-family:"Microsoft YaHei","Tahoma","Arial",'宋体'; color:#666; float:left; margin:8px 0 0 6px; display:inline;}
#search a.add{ background:url(${pageContext.request.contextPath}/images/main/add.jpg) no-repeat -3px 7px #548fc9; padding:0 10px 0 26px; height:40px; line-height:40px; font-size:14px; font-weight:bold; color:#FFF; float:right}
#search a:hover.add{ text-decoration:underline; color:#d2e9ff;}
#main-tab{ border:1px solid #eaeaea; background:#FFF; font-size:16px;}
#main-tab th{ font-size:16px; background:url(${pageContext.request.contextPath}/images/main/list_bg.jpg) repeat-x; height:32px; line-height:32px;}
#main-tab td{ font-size:16px; line-height:40px;}
#main-tab td a{ font-size:16px; color:#548fc9;}
#main-tab td a:hover{color:#565656; text-decoration:underline;}
.bordertop{ border-top:1px solid #ebebeb}
.borderright{ border-right:1px solid #ebebeb}
.borderbottom{ border-bottom:1px solid #ebebeb}
.borderleft{ border-left:1px solid #ebebeb}
.gray{ color:#dbdbdb;}
td.fenye{ padding:10px 0 0 0; text-align:right;}
.bggray{ background:#f9f9f9}
</style>
</head>
<body>
<!--main_top-->
<table width="99%" border="0" cellspacing="0" cellpadding="0" id="searchmain">
  <tr>
    <td width="99%" align="left" valign="top">您的位置:&nbsp;业务管理&nbsp;>&nbsp;盘点&nbsp;>&nbsp;盘点单详情</td>
  </tr>
    <tr>
        <td width="99%" align="left" valign="top">盘点单：&nbsp;&nbsp;GP08010041</td>
    </tr>
  <tr>
    <td align="left" valign="top">
    <table width="100%" border="0" cellspacing="0" cellpadding="0" id="search">
  		<tr>
   		 <td width="90%" align="left" valign="middle">
	         <%--<form method="post" action="${pageContext.request.contextPath}/operator/selectOperator.do">--%>
	            <%--&lt;%&ndash;部门：<select name='sdepId'>--%>
                <%--<option value='${-1}'>请选择</option>--%>
                <%--<c:forEach items="${depList}" var="dep">--%>
                <%--<c:if test="${dep.id==sdepId}">--%>
                <%--<option value='${dep.id}' selected='selected'>${dep.depName}</option>--%>
                <%--</c:if>--%>
                <%--<c:if test="${dep.id!=sdepId}">--%>
                <%--<option value="${dep.id}">${dep.depName}</option>--%>
                <%--</c:if>--%>
                <%--</c:forEach>--%>
                <%--</select>&ndash;%&gt;--%>
                <%--用户名：<input type='text' name='szSignOnName' value='${operator.szSignOnName}'/>--%>
                <%--<input type='submit' value='搜索'/>--%>
	         <%--</form>--%>
         </td>
         <%--<c:if test="${sessionScope.operator.szPower==1 }">--%>
  		  <%--<td width="10%" align="center" valign="middle" style="text-align:right; width:150px;">--%>
  		  <%--<a href='${pageContext.request.contextPath}/operator/addOperator.do' target="mainFrame" onFocus="this.blur()" class="add">添加用户</a></td>--%>
  		 <%--</c:if>--%>
  		</tr>
	</table>
    </td>
  </tr>
  <tr>
    <td align="left" valign="top">
    <%--<form method='post' action='' >--%>
    <table width="100%" border="0" cellspacing="0" cellpadding="0" id="main-tab">
      <tr>
      <%--<c:if test="${sessionScope.operator.szPower==1 }">--%>
      <%--<th align="center" valign="middle" class="borderright"><input type='submit' value='批量删除'/></th>--%>
      <%--</c:if>--%>
       <!--  <th align="center" valign="middle" class="borderright">id</th> -->

          <th align="center" valign="middle" class="borderright">盘点单号</th>
          <th align="center" valign="middle" class="borderright">商品ID</th>
          <th align="center" valign="middle" class="borderright">商品名称</th>
          <th align="center" valign="middle" class="borderright">价格</th>


          <th align="center" valign="middle" class="borderright">盘点数量</th>



      </tr>
      
        <c:forEach items="${list }" var="i">
        <tr onMouseOut="this.style.backgroundColor='#ffffff'" onMouseOver="this.style.backgroundColor='#edf5ff'">
        <%--<c:if test="${sessionScope.operator.szPower==1 }">--%>
        <%--<td align="center" valign="middle" class="borderright borderbottom">--%>
        <%--<input type='checkbox' name='lOperatorID' value='${o.lOperatorID }' /></td>--%>
        <%--</c:if>--%>
        <%-- <td align="center" valign="middle" class="borderright borderbottom">${u.id }</td> --%>

            <td align="center" valign="middle" class="borderright borderbottom">${i.szDocumentNmbr }</td>
            <td align="center" valign="middle" class="borderright borderbottom">${i.szPosItemID }</td>
            <td align="center" valign="middle" class="borderright borderbottom">${i.szItemName}</td>
            <td align="center" valign="middle" class="borderbottom">${i.dPackingUnitPriceAmount }</td>

                <%--<c:if test="${sessionScope.operator.szPower==1 }">--%>
            <td align="center" valign="middle" class="borderbottom"><input type='text' value=''/></td>

    <%--</c:if>--%>
     </tr>
     </c:forEach>

    </table>
      <%--</form>--%>
    </td>
    </tr>
    <tr>
        <td align="right"><input type='submit' value='提交'/></td>
    </tr>
  <%--&lt;%&ndash;数字条 &ndash;%&gt;--%>
  <%--<tr><td align="center">--%>
    <%--<c:if test="${pageInfo.pageNum > 1}">--%>
      <%--<a href="${pageContext.request.contextPath}/operator/selectOperator.do?pn=1">首页</a>--%>
      <%--<a href="${pageContext.request.contextPath}/operator/selectOperator.do?pn=${(pageInfo.pageNum - 1)}">&laquo;</a>--%>
    <%--</c:if>--%>
    <%--<c:forEach begin="1" end="${pageInfo.pages}" step="1" var="no">--%>
        <%--<a href="${pageContext.request.contextPath}/operator/selectOperator.do?pn=${no}">${no}</a>--%>
    <%--</c:forEach>--%>
    <%--<c:if test="${pageInfo.pageNum < pageInfo.pages }">--%>
      <%--<a href="${pageContext.request.contextPath}/operator/selectOperator.do?pn=${(pageInfo.pageNum + 1)}">&raquo;</a>--%>
      <%--<a href="${pageContext.request.contextPath}/operator/selectOperator.do?pn=${pageInfo.pages}">尾页</a>--%>
    <%--</c:if>--%>


<%--&lt;%&ndash;跳转 &ndash;%&gt;--%>

    <%--<form method='post' action='${pageContext.request.contextPath}/operator/selectOperator.do' style=" display:inline-block">--%>

      <%--<input type='text' name='pn' id='pn' size='3' value=''/>--%>

      <%--<input type='hidden' name='szSignOnName' value='${operator.szSignOnName }'>--%>
    <%--<input type='submit' value='跳转'/>&nbsp;&nbsp;共${pageInfo.pages }页--%>
    <%--</form>--%>

  <%--</td></tr>--%>




</table>

</body>
</html>