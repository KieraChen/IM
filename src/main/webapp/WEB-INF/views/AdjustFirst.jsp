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

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://unpkg.com/element-ui/lib/theme-chalk/index.css">
    <!-- import Vue before Element -->
    <script src="https://unpkg.com/vue/dist/vue.js"></script>
    <!-- import JavaScript -->
    <script src="https://unpkg.com/element-ui/lib/index.js"></script>
    <title>库存调整1</title>


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

<table width="99%" border="0" cellspacing="0" cellpadding="0" id="searchmain">
    <tr>
        <td width="99%" align="left" valign="top">您的位置:&nbsp;业务管理&nbsp;>&nbsp;库存调整</td>
    </tr>
</table>

<div id="app">
    <el-container>
        <!-- 标题 -->
        <el-header height="60">
            <h1>库存调整</h1>
        </el-header>

        <el-main>

            <el-row class="block-col-2">

                <el-col :span="12">
                    <span class="demonstration"></span>
                    <el-dropdown trigger="click">
      <span class="el-dropdown-link" align = "center">
        请选择库存调整原因<i class="el-icon-arrow-down el-icon--right"></i>
      </span>
                        <el-dropdown-menu slot="dropdown">
                            <a href="${pageContext.request.contextPath}/adjust/adjustFirst.do"><el-dropdown-item >过期</el-dropdown-item></a>
                            <a href="${pageContext.request.contextPath}/adjust/adjustSecond.do"><el-dropdown-item >残损</el-dropdown-item></a>
                            <el-dropdown-item >下架</el-dropdown-item>
                            <el-dropdown-item >样品</el-dropdown-item>
                            <el-dropdown-item >调盈</el-dropdown-item>
                        </el-dropdown-menu>
                    </el-dropdown>
                </el-col>
            </el-row>

        </el-main>
    </el-container>
</div>

<script type="text/javascript">
    // 用HTML的localStorage本地存储数据
    var STORAGE_KEY = 'todolist'
    function fetch() {
        return JSON.parse(window.localStorage.getItem(STORAGE_KEY) || '[]')
    }
    function save(items){
        window.localStorage.setItem( STORAGE_KEY, JSON.stringify(items) )
    }

    // Vue实例化
    var doit = new Vue({
        el:'#app',
        data: {
            newtodo:{
                content:'',
                done: false
            },
            todolist: fetch()
        },
        methods: {
            // 添加
            add: function(){
                // 如果输入框有值
                if (this.newtodo.content) {
                    this.todolist.push(this.newtodo)
                    // 重置值
                    this.newtodo = { content:'', done:false }
                }
            },
            // 删除
            del: function(index){
                this.todolist.splice(index,1)
            }
        },
        computed: {
            // 已完成事项的数量
            donenum: function(){
                // filter是默认会传入当前的item，而且filter的第一个参数默认就是当前的item。
                return this.todolist.filter( function( val ){
                    // 查看val结构
                    console.log(val)
                    return val.done
                }).length

            }
        },
        watch: {
            todolist:{
                handler(items){
                    save(items)
                },
                // 深度监听：属性值的变化{{ todolist.length -  donenum}}  已完成：{{ donenum }}
                // 给所有属性添加监听器，开销较大
                deep: true
            }
        }
    })

</script>




<style>
    .block-col-2{
        align-content: center;
    }
    .el-dropdown-link {
        cursor: pointer;
        color: #409EFF;
        align-content: center;
    }
    .el-icon-arrow-down {
        font-size: 12px;
    }
    .demonstration {
        display: block;
        color: #8492a6;
        font-size: 14px;
        margin-bottom: 20px;
    }
    #app {
        font-family: "Helvetica Neue", Helvetica, "PingFang SC", "Hiragino Sans GB", "Microsoft YaHei", "微软雅黑", Arial, sans-serif;
        color: #756C83;
    }

    .el-header {
        text-align: center;
    }

    .todoinput {
        margin-bottom: 40px;
    }

    .list-row {
        height: 40px;
        background-color: #fbfbfb;
        margin-bottom: 5px;
    }

    .check {
        text-align: center;
        line-height: 40px;
    }

    .red {
        border-left: #ef5f65 2px solid;
    }

    .green {
        border-left: #B9E1DC 2px solid;
    }

    .ipcont {
        width: 90%;
        margin-top: 8px;
        border: 0;
        line-height: 24px;
        background-color: transparent;
        font-size: 16px;
        color: #756C83;
    }

    .close {
        text-align: center;
        line-height: 40px;
    }

    .el-icon-close {
        cursor: pointer;
    }

    .el-icon-close:hover {
        color: #ef5f65;
    }

    .done {
        text-decoration: line-through;
    }
</style>

</body>
</html>