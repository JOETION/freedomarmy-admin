<%--
  Created by IntelliJ IDEA.
  User: Wei-Peng
  Date: 2018/7/12
  Time: 23:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>密码修改</title>
</head>
<body>
    <form method="post" action="/freedomarmy/admin/returnLogin?id=${admin.id}" style="text-align: center ;margin-top: 30px;margin-left: 10px">
     原始密码：<input type="text" value="${admin.password}" disabled="disabled">
     修改密码：<input  name="newPassword" type="text" >
                <input type="submit" value="提交">
    </form>
</body>
</html>
