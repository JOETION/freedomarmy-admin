<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html>
<head>
    <%@ include file="common-path.jsp" %>
    <meta charset="utf-8">
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no"/>
    <meta http-equiv="Cache-Control" content="no-siteapp"/>
    <LINK rel="Bookmark" href="/favicon.ico">
    <LINK rel="Shortcut Icon" href="/favicon.ico"/>
    <!--[if lt IE 9]>
    <script type="text/javascript" src="${pageContext.request.contextPath}/res/lib/html5.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/res/lib/respond.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/res/lib/PIE_IE678.js"></script>
    <![endif]-->
    <link href="${pageContext.request.contextPath}/res/css/H-ui.min.css" rel="stylesheet" type="text/css"/>
    <link href="${pageContext.request.contextPath}/res/css/H-ui.admin.css" rel="stylesheet" type="text/css"/>
    <link href="${pageContext.request.contextPath}/res/skin/default/skin.css" rel="stylesheet" type="text/css" id="skin"/>
    <link href="${pageContext.request.contextPath}/res/lib/Hui-iconfont/1.0.1/iconfont.css" rel="stylesheet" type="text/css"/>
    <link href="${pageContext.request.contextPath}/res/css/style.css" rel="stylesheet" type="text/css"/>
    <!--[if IE 6]>
    <script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js"></script>
    <script>DD_belatedPNG.fix('*');</script>
    <![endif]-->
    <title>FreedomArmy-后台</title>
</head>
<body>
<header class="Hui-header cl"><a class="Hui-logo l" title="FreedomArmy-后台" href="">FreedomArmy-后台</a>
    <nav class="mainnav cl" id="Hui-nav">
        <ul>
            <li class="dropDown dropDown_click">
                <ul class="dropDown-menu radius box-shadow">
                </ul>
            </li>
        </ul>
    </nav>
    <ul class="Hui-userbar">
        <li class="dropDown dropDown_hover"><a href="#" class="dropDown_A">${admin.name} <i class="Hui-iconfont">&#xe6d5;</i></a>
            <ul class="dropDown-menu radius box-shadow">
                <li><a href="login">切换账户</a></li>
                <li><a href="logout">退出</a></li>
            </ul>
        </li>
        <li id="Hui-msg"><a onclick="layer_show('消息列表','message/list',500,400);" title="消息"><span class="badge badge-danger">30</span><i class="Hui-iconfont" style="font-size:18px">&#xe68a;</i></a></li>
        <li id="Hui-skin" class="dropDown right dropDown_hover"><a href="javascript:;" title="换肤"><i class="Hui-iconfont" style="font-size:18px">&#xe62a;</i></a>
            <ul class="dropDown-menu radius box-shadow">
                <li><a href="javascript:;" data-val="default" title="默认（黑色）">默认（黑色）</a></li>
                <li><a href="javascript:;" data-val="blue" title="蓝色">蓝色</a></li>
                <li><a href="javascript:;" data-val="green" title="绿色">绿色</a></li>
                <li><a href="javascript:;" data-val="red" title="红色">红色</a></li>
                <li><a href="javascript:;" data-val="yellow" title="黄色">黄色</a></li>
                <li><a href="javascript:;" data-val="orange" title="绿色">橙色</a></li>
            </ul>
        </li>
    </ul>
    <a aria-hidden="false" class="Hui-nav-toggle" href="#"></a></header>
<aside class="Hui-aside">
    <input runat="server" id="divScrollValue" type="hidden" value=""/>

    <div class="menu_dropdown bk_2">


        <dl id="menu-member">
            <dt><i class="Hui-iconfont">&#xe60d;</i> 用户管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
            <dd>
                <ul>
                    <li><a _href="${pageContext.request.contextPath}/freedomarmy/admin/userlist" href="javascript:void(0)">查询用户信息</a></li>
                </ul>
            </dd>
        </dl>
        <dl id="menu-shcool">
            <dt><i class="Hui-iconfont">&#xe616;</i> 订单管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
            <dd>
                <ul>
                    <li><a _href="${pageContext.request.contextPath}/freedomarmy/admin/order/list" href="javascript:void(0)">查询</a></li>
                </ul>
            </dd>
        </dl>
        <dl>
            <dt><i class="Hui-iconfont">&#xe611;</i> 商品管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
            <dd>
                <ul>
                    <li><a _href="freedomarmy/admin/commodity/manage/show" href="javascript:;">管理</a></li>
                </ul>
            </dd>
        </dl>

        <dl>
            <dt><i class="Hui-iconfont">&#xe616;</i> 商品类别管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
            <dd>
                <ul>
                    <li><a onclick="layer_show('添加商品类别','freedomarmy/admin/commodityType/show',500,400);">新增类别</a></li>
                    <li><a _href="freedomarmy/admin/commodityType/match" href="javascript:;">类别关联</a></li>
                </ul>
            </dd>


        </dl>
        <dl>
            <dt><i class="Hui-iconfont">&#xe616;</i>个性设置<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
            <dd>
                <ul>
                    <li><a _href="freedomarmy/admin/updatePassword?id=${admin.id}" href="javascript:;" >重置密码</a></li>
                </ul>
            </dd>
        </dl>
    </div>
</aside>
<div class="dislpayArrow"><a class="pngfix" href="javascript:void(0);" onClick="displaynavbar(this)"></a></div>
<section class="Hui-article-box">
    <div id="Hui-tabNav" class="Hui-tabNav">
        <div class="Hui-tabNav-wp">
            <ul id="min_title_list" class="acrossTab cl">
                <li class="active"><span title="我的桌面" data-href="${pageContext.request.contextPath}/notice/notice-list">用户管理</span><em></em></li>
            </ul>
        </div>
        <div class="Hui-tabNav-more btn-group"><a id="js-tabNav-prev" class="btn radius btn-default size-S" href="javascript:;"><i class="Hui-iconfont">&#xe6d4;</i></a><a id="js-tabNav-next" class="btn radius btn-default size-S" href="javascript:;"><i class="Hui-iconfont">&#xe6d7;</i></a></div>
    </div>
    <div id="iframe_box" class="Hui-article">
        <div class="show_iframe">
            <div style="display:none" class="loading"></div>
            <iframe scrolling="yes" frameborder="0" src="notice/notice-list"></iframe>
        </div>
    </div>
</section>
<script type="text/javascript" src="${pageContext.request.contextPath}/res/lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/res/lib/layer/1.9.3/layer.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/res/js/H-ui.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/res/js/H-ui.admin.js"></script>
</body>
</html>