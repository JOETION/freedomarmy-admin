<%--
  Created by IntelliJ IDEA.
  User: Wei-Peng
  Date: 2018/7/11
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <style type="text/css" >
    body{
        text-align: center;
    }
    #window-header{

        margin-top: 150px;
        text-align: center;
    }
    #allDiv table{
        margin: auto;
    }

</style>
<html>
<head>
    <title>订单信息修改</title>
</head>
<body >
<div id="window-header">

    <h3 class="head">订单修改</h3>
    <h4>用户：${ordersDto.username}</h4>
</div>
<div id="allDiv" style="width:100%;text-align:center">
    <table  align=""  >
        <form action="/freedomarmy/admin/order/upadataSendGood?id=${ordersDto.id}" method="post">
        <tr>
            <td>发货状态:  <c:if test="${ordersDto.isSendGoods==0}">未发货</c:if>
                <c:if test="${ordersDto.isSendGoods==1}">已发货</c:if>
            </td>
            <td><select name="sendGood">
                <option value ="1">发货</option>
                <option value ="0">取消发货</option>
            </select>
            </td>
            <td>
                <input type="submit" value="提交"/>
            </td>
        </tr>
        </form>

    <br>

        <form action="/freedomarmy/admin/order/upadataisReturnGoods?id=${ordersDto.id}" method="post">
            <c:if test="${ordersDto.isReturnGoods!=0}">
        <tr>
            <td>退货状态：
                <c:if test="${ordersDto.isReturnGoods==1}">退货中</c:if>
                <c:if test="${ordersDto.isReturnGoods==2}">已退货</c:if></td>
            <td><select name="isReturnGoods">
                <option value ="1">取消退货</option>
                <option value ="2">退货</option>
                </select>
            </td>
            <td> <input type="submit" value="提交"/></td>
        </tr>
            </c:if>
        </form>
    <br>
    <form action="/freedomarmy/admin/order/upadataExchangeGoods?id=${ordersDto.id}" method="post">
        <c:if test="${ordersDto.isExchangeGoods!=0}">
        <tr>
            <td>换货状态：
                <c:if test="${ordersDto.isExchangeGoods==1}">换货中</c:if>
                <c:if test="${ordersDto.isExchangeGoods==2}">已换货</c:if></td>
            </td>
            <td> <select name="isExchangeGoods">
                <option value ="1">取消换货</option>
                <option value ="2">换货</option>
            </select></td>
            <td>
                <input type="submit" value="提交"/>
            </td>
        </tr>
        </c:if>
        </form>

    <br>
<form action="/freedomarmy/admin/order/upadataisRefund?id=${ordersDto.id}" method="post">
    <c:if test="${ordersDto.isRefund!=0}">
    <tr>
        <td>退款状态：
            <c:if test="${ordersDto.isRefund==1}">退款中</c:if>
            <c:if test="${ordersDto.isRefund==2}">已退款</c:if></td>
        </td>
        <td><select name="isRefund">
            <option value ="1">取消退款</option>
            <option value ="2">退款</option>
        </select></td>
        <td> <input type="submit" value="提交"/></td>

    </tr>
    </c:if>
</form>
    </table>
</div>
        <a  href="${pageContext.request.contextPath}/freedomarmy/admin/order/list"><p>返回</p></a></div>




</body>
</html>
