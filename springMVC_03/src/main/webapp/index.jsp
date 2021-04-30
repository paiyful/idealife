<%--
  Created by IntelliJ IDEA.
  User: Lu
  Date: 2021/4/9
  Time: 12:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆</title>
</head>
<body>
    <form method="post" action="/user/test">
        <table>
            <tr>
                <td>
                    账号
                </td>
                <td>
                    <input type="text" name="username">
                </td>
                <td>
                    密码
                </td>
                <td>
                    <input type="password" name="password">
                </td>
            </tr>
            <tr>
                <td><input type="submit" value="提交"></td>
                <td><input type="reset" value="重置"></td>
            </tr>
        </table>
    </form>
</body>
</html>
