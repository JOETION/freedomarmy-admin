<%--
  Created by IntelliJ IDEA.
  User: wonderland
  Date: 2018/7/10
  Time: 20:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="sf"  uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta charset="utf-8" />
    <title>用户管理</title>
    <%--<link rel="stylesheet" type="text/css" href="#"/>--%>
    <style type="text/css">
        h2{
            text-align: center;
        }
    </style>
</head>
<body>
<h2  class="head" align="center">用户信息</h2>
<div align="center">
    <form action="${pageContext.request.contextPath}/freedomarmy/admin/search"  method="post">
        搜索用户: <input name="username" type="text" placeholder="请输入用户名" />
        <input type="submit" value="查询" />
    </form><br>
</div>
<table class="table" width="90%" border="0" cellpadding="3" cellspacing="0" align="center">

    <tr bgcolor="#8899cc">
        <td>ID</td>
        <td>用户名</td>
        <td>绰号</td>
        <td>真实姓名</td>
        <td>性别</td>
        <td>等级</td>
        <td>电话</td>
        <td>邮箱</td>
        <td>地址</td>
        <td>个性签名</td>
    </tr>
    <c:forEach items="${userlist}" var="data">
    <tr>
        <td>${data.id}</td>
        <td>${data.username}</td>
        <td>${data.nickname}</td>
        <td>${data.name}</td>
        <td>${data.gender}</td>
        <td>${data.grade}</td>
        <td>${data.mobile}</td>
        <td>${data.email}</td>
        <td>${data.address}</td>
        <td>${data.personalitySignature}
        </td>
    </tr>

</c:forEach>


</table>

</body>
</html>

