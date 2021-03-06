﻿<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="utf-8">
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no"/>
    <meta http-equiv="Cache-Control" content="no-siteapp"/>
    <!--[if lt IE 9]>
    <script type="text/javascript" src="${pageContext.request.contextPath}/res/lib/html5.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/res/lib/respond.min.js"></script>
    <![endif]-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/res/css/H-ui.min.css"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/res/css/H-ui.admin.css"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/res/lib/Hui-iconfont/1.0.1/iconfont.css"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/res/skin/default/skin.css" id="skin"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/res/css/style.css"/>
    <!--[if IE 6]>
    <script type="text/javascript" src="${pageContext.request.contextPath}/res/lib/DD_belatedPNG_0.0.8a-min.js"></script>
    <script>DD_belatedPNG.fix('*');</script>
    <![endif]-->
    <title>商品列表</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 商品管理 <span class="c-gray en">&gt;</span> 商品列表 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新"><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
    <div class="text-c"> 日期范围：
        <input type="text" onfocus="WdatePicker({ maxDate:'#F{$dp.$D(\'logmax\')||\'%y-%M-%d\'}' })" id="logmin" class="input-text Wdate" style="width:120px;">
        -
        <input type="text" onfocus="WdatePicker({ minDate:'#F{$dp.$D(\'logmin\')}',maxDate:'%y-%M-%d' })" id="logmax" class="input-text Wdate" style="width:120px;">
        <input type="text" name="" placeholder=" 商品名" style="width:250px" class="input-text">
        <button name="" class="btn btn-success" type="submit"><i class="Hui-iconfont">&#xe665;</i> 搜商品</button>
    </div>
    <div class="cl pd-5 bg-1 bk-gray mt-20"><span class="l"><a href="javascript:;" onclick="datadel()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a> <a class="btn btn-primary radius" onclick="picture_add('添加商品','/freedomarmy/admin/commodity/add/show')" href="javascript:;"><i class="Hui-iconfont">&#xe600;</i> 添加商品</a></span> <span class="r">共有数据：<strong>54</strong> 条</span></div>
    <div class="mt-20">
        <table class="table table-border table-bordered table-bg table-hover table-sort">
            <thead>
            <tr class="text-c">
                <th width="40"><input name="" type="checkbox" value=""></th>
                <th width="80">商品编号</th>
                <th width="100">商品名</th>
                <th width="100">商品价格</th>
                <th>图片名称</th>
                <th width="150">商品类型</th>
                <th width="60">商品库存</th>
                <th width="60">赠送积分</th>
                <th width="60">商品状态</th>
                <th width="100">操作</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${commodity}" var="item">
                <tr class="text-c">
                    <td><input name="" type="checkbox" value=""></td>
                    <td>${item.commodityId}</td>
                    <td class="text-l"><a class="maincolor" href="javascript:;" onClick="picture_edit('商品编辑','picture-show.html',${item.commodityId})">${item.commodityName}</a></td>
                    <td class="text-c">${item.commodityPrice}</td>
                    <td><a href="javascript:;" onClick="picture_edit('商品编辑','./picture-show.jsp',${item.commodityId})"><img width="80" class="picture-thumb" src="${item.commodityImage}"></a></td>
                    <td>${type.get(item.commodityType)}</td>
                    <td>${item.commodityStock}</td>
                    <td>${item.commodityIntegral}</td>
                    <td class="td-status">
                        <c:choose>
                            <c:when test="${item.state==0}">
                                <span class="label label-success radius"> 已上架</span>
                            </c:when>
                            <c:otherwise>
                                <span class="label label-default radius"> 已下架</span>
                            </c:otherwise>
                        </c:choose>
                    </td>

                    <td class="td-manage">
                        <c:choose>
                            <c:when test="${item.state==0}">
                                <a style="text-decoration:none" onClick="picture_stop(this,${item.commodityId})" href="javascript:;" title="下架"><i class="Hui-iconfont">&#xe6de;</i></a> <a style="text-decoration:none" class="ml-5" onClick="picture_edit('商品编辑','./picture-add.jsp',${item.commodityId})" href="javascript:;" title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a> <a style="text-decoration:none" class="ml-5" onClick="picture_del(this,'${item.commodityId}')" href="javascript:;" title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a>
                            </c:when>

                            <c:otherwise>
                                <a style="text-decoration:none" onClick="picture_start(this,${item.commodityId})" href="javascript:;" title="上架"><i class="Hui-iconfont">&#xe6de;</i></a> <a style="text-decoration:none" class="ml-5" onClick="picture_edit('商品编辑','./picture-add.jsp',${item.commodityId})" href="javascript:;" title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a> <a style="text-decoration:none" class="ml-5" onClick="picture_del(this,'${item.commodityId}')" href="javascript:;" title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a>
                            </c:otherwise>
                        </c:choose>

                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>

<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="${pageContext.request.contextPath}/res/lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/res/lib/layer/1.9.3/layer.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/res/js/H-ui.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/res/js/H-ui.admin.js"></script>
<!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="${pageContext.request.contextPath}/res/lib/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/res/lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/res/lib/laypage/1.2/laypage.js"></script>

<script type="text/javascript">
    var picStart;
    var picStop;
    $('.table-sort').dataTable({
        "aaSorting": [[1, "desc"]],//默认第几个排序
        "bStateSave": true,//状态保存
        "aoColumnDefs": [
            //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
            {"orderable": false, "aTargets": [0, 8]}// 制定列不参与排序
        ]
    });

    /*图片-添加*/
    function picture_add(title, url) {
        var index = layer.open({
            type: 2,
            title: title,
            content: url
        });
        layer.full(index);
    }

    /*图片-查看*/
    function picture_show(title, url, id) {
        var index = layer.open({
            type: 2,
            title: title,
            content: url
        });
        layer.full(index);
    }

    /*图片-审核*/
    function picture_shenhe(obj, id) {
        layer.confirm('审核文章？', {
                    btn: ['通过', '不通过'],
                    shade: false
                },
                function () {
                    $(obj).parents("tr").find(".td-manage").prepend('<a class="c-primary" onClick="picture_start(this,id)" href="javascript:;" title="申请上线">申请上线</a>');
                    $(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已发布</span>');
                    $(obj).remove();
                    layer.msg('已发布', {icon: 6, time: 1000});
                },
                function () {
                    $(obj).parents("tr").find(".td-manage").prepend('<a class="c-primary" onClick="picture_shenqing(this,id)" href="javascript:;" title="申请上线">申请上线</a>');
                    $(obj).parents("tr").find(".td-status").html('<span class="label label-danger radius">未通过</span>');
                    $(obj).remove();
                    layer.msg('未通过', {icon: 5, time: 1000});
                });
    }

    /*图片-下架*/
    function picture_stop(obj, id) {
        picStop = id;
        layer.confirm('确认要下架吗？', function (index) {
            $.ajax({
                type: "get",
                url: "/freedomarmy/admin/commodity/remove?commodityId=" + id,
                dataType: "text",
                async: false,
                success: function (data) {
                    $(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="picture_start(this,picStop)" href="javascript:;" title="上架"><i class="Hui-iconfont">&#xe603;</i></a>');
                    $(obj).parents("tr").find(".td-status").html('<span class="label label-default radius">已下架</span>');
                    $(obj).remove();
                    layer.msg('已下架!', {icon: 5, time: 1000});
                },
                error: function (XMLHttpRequest, textStatus, errorThrown) {
                    alert("提交失败，原因：" + errorThrown);
                    return false;
                }
            });

        });
    }

    /*图片-上架*/
    function picture_start(obj, id) {
        picStart = id;
        layer.confirm('确认要上架吗？', function (index) {
            $.ajax({
                type: "get",
                url: "/freedomarmy/admin/commodity/recycle?commodityId=" + id,
                dataType: "text",
                async: false,
                success: function (data) {
                    $(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="picture_stop(this,picStart)" href="javascript:;" title="下架"><i class="Hui-iconfont">&#xe6de;</i></a>');
                    $(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已上架</span>');
                    $(obj).remove();
                    layer.msg('已上架!', {icon: 6, time: 1000});
                },
                error: function (XMLHttpRequest, textStatus, errorThrown) {
                    alert("提交失败，原因：" + errorThrown);
                    return false;
                }
            });

        });
    }

    /*图片-申请上线*/
    function picture_shenqing(obj, id) {
        $(obj).parents("tr").find(".td-status").html('<span class="label label-default radius">待审核</span>');
        $(obj).parents("tr").find(".td-manage").html("");
        layer.msg('已提交申请，耐心等待审核!', {icon: 1, time: 2000});
    }

    /*图片-编辑*/
    function picture_edit(title, url, id) {
        var index = layer.open({
            type: 2,
            title: title,
            content: url
        });
        layer.full(index);
    }

    /*图片-删除*/
    function picture_del(obj, id) {
        layer.confirm('确认要删除吗？', function (index) {
            $.ajax({
                type: 'get',
                url: '/freedomarmy/admin/commodity/delete?commodityId=' + id,
                success: function (data) {
                    if (data == "success") {
                        $(obj).parents("tr").remove();
                        layer.msg('已删除!', {icon: 1, time: 1000});
                    }
                    else {
                        alert("删除失败!");
                    }

                },
                error: function (data) {
                    console.log(data.msg);
                },
            });
        });
    }
</script>
</body>
</html>