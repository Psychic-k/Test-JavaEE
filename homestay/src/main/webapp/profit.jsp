<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 坏物。
  Date: 2021/12/16
  Time: 23:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <div id="headImg"><img src="imgs/boss.png" id="txt" alt=""></div>
    <p id="time"></p>
    <h2>BOSS&nbsp;&nbsp;</h2>
    <button type="button" id="quit" onclick="quit()" value="">退出</button>
</div>

<div id="MainArea">
    <%--    首页--%>
        <div id="Main_Area2">
            <div class="mb">
                <h1>年度报表详情</h1>
                <table border="2" cellspacing="0" align="center" width="80%" style="font-size: 20px">

                    <tr>
                        <th>年份</th>
                        <th>收入（万元）</th>
                        <th>支出（万元）</th>
                        <th>利润总额（万元）</th>
                        <th>点击查看年度详情</th>
                    </tr>

                    <c:forEach items="${profits}" var="profit" varStatus="status">
                        <tr align="center">
                            <td>${profit.year}</td>
                            <td>${profit.income}</td>
                            <td>${profit.paid}</td>
                            <td>${profit.profit}</td>
                            <td><input type="submit" class="hsbutton" value="查看"></td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
</div>

</body>
</html>
