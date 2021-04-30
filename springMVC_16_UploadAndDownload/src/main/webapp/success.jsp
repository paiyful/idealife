<%--
  Created by IntelliJ IDEA.
  User: Lu
  Date: 2021/4/15
  Time: 16:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <img src="${imgPath}">
    <form method="post" action="/load/download?fileName=${imgPath}">
        <input type="submit" value="文件下载">
    </form>
</body>
</html>
