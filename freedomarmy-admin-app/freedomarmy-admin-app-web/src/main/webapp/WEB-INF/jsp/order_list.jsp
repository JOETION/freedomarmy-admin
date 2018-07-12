<%--
  Created by IntelliJ IDEA.
  User: Wei-Peng
  Date: 2018/7/9
  Time: 21:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<style>
    .updates{
        color: #000000;
        cursor: pointer;
    }
    .updates:hover{
        color: red;
    }
</style>

<html>
<head>
    <meta charset="utf-8"/>
    <title>订单管理</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resource/css/order/order_list.css">
</head>
<body>
<h3 class="head">订单信息</h3>
</div>
<div align="center">
    <form action="${pageContext.request.contextPath}/freedomarmy/admin/order/check" method="post">
        订单搜索: <input name="username" type="text" placeholder="请输入用户名"/>
        <input  type="submit" value="查询"/>
    </form>
</div>
<table class="table" width="90%" border="0" cellpadding="3" cellspacing="0">
    <tr bgcolor="#F5F5F5">
        <td>订单用户</td>
        <td>商品ID</td>
        <td>商品名称</td>
        <td>商品数量</td>
        <td>价格</td>
        <td>是否支付</td>
        <td>是否发货</td>
        <td>是否收货</td>
        <td>是否退货</td>
        <td>是否换货</td>
        <td>是否收款</td>
        <td>是否退款</td>
        <td>操作</td>
    </tr>

    <c:forEach items="${ordersList }" var="data">
        <tr>
            <td>${data.username }</td>
            <td>${data.commodityId }</td>
            <c:forEach items="${commodityDtoList}" var="commdata">
                <td>${commdata.commodityName }</td>
            </c:forEach>
            <td>${data.commodityNumber }</td>
            <td>${data.ordersPrice} </td>
            <td>
            <c:if test="${data.isPayment==1}">已支付</c:if>
            <c:if test="${data.isPayment!=1}">未支付</c:if>
            </td>
            <td>
                <c:if test="${data.isSendGoods==1}">已发货</c:if>
                <c:if test="${data.isSendGoods!=1}">未发货</c:if>
            </td>
            <td>
            <c:if test="${data.isCollectGoods==1}">已收货</c:if>
            <c:if test="${data.isSendGoods!=1}">未收货</c:if>
            </td>
            <td>
                <c:if test="${data.isReturnGoods==2}">已退货</c:if>
                <c:if test="${data.isReturnGoods==1}">退货中</c:if>
                <c:if test="${data.isReturnGoods==0}"> </c:if>
            </td>
            <td>
                <c:if test="${data.isExchangeGoods==2}">已换货</c:if>
                <c:if test="${data.isExchangeGoods==1}">换货中</c:if>
                <c:if test="${data.isExchangeGoods==0}"> </c:if>
            </td>
            <td>
                <c:if test="${data.isCollectMoney==1}">已收款</c:if>
                <c:if test="${data.isCollectMoney!=1}">未收款</c:if>
            </td>
            <td>
                <c:if test="${data.isRefund==2}">已退款</c:if>
                <c:if test="${data.isRefund==1}">退款中</c:if>
                <c:if test="${data.isRefund==0}"></c:if>
            </td>
            <td>
                <div class="updates">
            <a href="${pageContext.request.contextPath}/freedomarmy/admin/order/upadate?id=${data.id}">修改</a>
            </div>
            </td>
        </tr>
    </c:forEach>
</table>
</body>

</html>