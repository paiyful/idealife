<%--
  Created by IntelliJ IDEA.
  User: Lu
  Date: 2021/4/8
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页</title>
</head>
<body>
    <form method="post" action="/login">
        <table align="center">
            <tr>
                <td>账号</td>
                <td><input type="text" name="username"></td>
            </tr>
            <tr>
                <td>密码</td>
                <td><input type="password" name="password"></td>
            </tr>
            <input type="reset" value="重置">
            <input type="submit" value="提交">
        </table>
    </form>
</body>
</html>
