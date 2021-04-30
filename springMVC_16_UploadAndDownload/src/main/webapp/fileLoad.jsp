<%--
  Created by IntelliJ IDEA.
  User: Lu
  Date: 2021/4/15
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
    <form method="post" action="/load/upload" enctype="multipart/form-data">
        <input type="file" name="load">
        <input type="submit" value="上传">
    </form>
</body>
</html>
