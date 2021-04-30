<%--
  Created by IntelliJ IDEA.
  User: Lu
  Date: 2021/4/9
  Time: 22:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<form method="post" action="/user/testObjectAndObject">
    <table align="center">
        <tr>
            <td>账号：</td>
            <td><input type="text" name="username"></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <td>年龄：</td>
            <td><input type="text" name="info.age"></td>
        </tr>
        <tr>
            <td>性别：</td>
            <td><input type="radio" value="男" name="info.gender" checked>男<input type="radio" value="女" name="info.gender">女</td>
        </tr>
        <tr>
            <td>信息：</td>
            <td><input type="text" name="info.info"></td>
        </tr>
        <tr>
            <td><input type="submit" value="提交"></td>
            <td><input type="reset" value="重置"></td>
        </tr>
    </table>
</form>
</body>
</html>
