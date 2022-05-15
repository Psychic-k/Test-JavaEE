<%--
  Created by IntelliJ IDEA.
  User: 坏物。
  Date: 2021/12/15
  Time: 12:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <meta charset="UTF-8">
    <title>窝趣公寓门店管理系统</title>
    <link rel="stylesheet" href="css/index.css">
    <script type="text/javascript" src="js/airbnb.js"></script>
</head>
<body onload="starclear();username()">
<div id="logo">
    <img src="./imgs/logo_white.png" id="logo1" alt="">
</div>

<!--主界面左侧菜单-->
<div id="Menue">
    <ul>
        <li><a href="index_boss.jsp" id="home"><b>首页</b></a></li>
        <li><a href="/homestay/selectAll_StaffServlet" ><b>员工管理</b></a></li>
        <li><a href="/homestay/checkAll_HouseServlet" ><b>客房管理</b></a></li>
        <li><a href="/homestay/selectAll_ProfitServlet" ><b>年度报表</b></a></li>
        <li><a href="notice_boss.jsp" ><b>公告管理</b></a></li>

    </ul>
</div>

<%--最顶栏--%>
<div id="Topline">
    <%--    <img id="indexPng" src="imgs/index.png" alt="">--%>
    <%--    <a href="#" id="homepage">首页</a>
        <p>首页</p>--%>
    <div id="headImg"><img src="imgs/boss.png" id="txt" alt=""></div>
    <p id="time"></p>
    <h2>BOSS&nbsp;&nbsp;</h2>
    <button type="button" id="quit" onclick="quit()" value="">退出</button>
</div>

<div id="MainArea">
    <%--    首页--%>
    <div id="Main_Area">
        <h1 id="h1"><b>窝趣公寓门店管理系统</b></h1>
        <div class="video">
            <video src="imgs/wowqu.mp4" controls width="1400" height="700" autoplay></video>
        </div>
    </div>

</div>


</body>

</html>
