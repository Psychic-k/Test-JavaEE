<%--
  Created by IntelliJ IDEA.
  User: 坏物。
  Date: 2021/12/15
  Time: 12:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>爱彼迎民宿管理系统</title>
    <link href="css/login.css" rel="stylesheet">
</head>

<body>

<div id="loginDiv" >
    <form action="/homestay/loginServlet" method="post" id="form">
        <h1 id="loginMsg">窝趣公寓管理系统</h1>
        <div id="errorMsg">${login_msg} ${register_msg}</div>
        <p><b>登录账号：<input id="username" name="username" value="${cookie.username.value}" type="text"></b></p>
        <p><b>登陆密码：<input id="password" name="password" value="${cookie.password.value}" type="password"></b></p>
        <p><b>记住账户：<input id="remember" name="remember" value="1" type="checkbox"></b></p>
        <div id="subDiv">
            <input type="submit" class="button" value="登录">
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <input type="reset" class="button" value="重置">&nbsp;&nbsp;&nbsp;
        </div>
    </form>
</div>

</body>
</html>
