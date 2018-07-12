<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="utf-8">
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width,initial-scale=1,user-scalable=no"/>
    <title>FreedomArmy-后台</title>
    <meta name="keywords" content="关键词,5个左右,单个8汉字以内">
    <meta name="description" content="网站描述，字数尽量空制在80个汉字，160个字符以内！">
    <link rel="Bookmark" href="favicon.ico">
    <link rel="Shortcut Icon" href="favicon.ico"/>
    <!--[if lt IE 9]>
    <script type="text/javascript" src="${pageContext.request.contextPath}/res/lib/html5.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/res/lib/respond.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/res/lib/PIE_IE678.js"></script>
    <![endif]-->
    <link href="${pageContext.request.contextPath}/res/css/H-ui.css" rel="stylesheet" type="text/css"/>
    <link href="${pageContext.request.contextPath}/res/iconfont/iconfont.css" rel="stylesheet" type="text/css"/>
    <link href="${pageContext.request.contextPath}/resource/css/common/login.css" rel="stylesheet" type="text/css"/>
    <!--自己的样式-->
    <!--[if IE 6]>
    <script type="text/javascript" src="${pageContext.request.contextPath}/res/DD_belatedPNG_0.0.8a-min.js"></script>
    <script>DD_belatedPNG.fix('.pngfix,.icon');</script>

    <script type="application/javascript">
        // 设置为主页
        function SetHome(obj, vrl) {
            try {
                obj.style.behavior = 'url(#default#homepage)';
                obj.setHomePage(vrl);
            } catch (e) {
                if (window.netscape) {
                    try {
                        netscape.security.PrivilegeManager.enablePrivilege("UniversalXPConnect");
                    } catch (e) {
                        alert("此操作被浏览器拒绝！\n请在浏览器地址栏输入“about:config”并回车\n然后将 [signed.applets.codebase_principal_support]的值设置为'true',双击即可。");
                    }
                    var prefs = Components.classes['@mozilla.org/preferences-service;1'].getService(Components.interfaces.nsIPrefBranch);
                    prefs.setCharPref('browser.startup.homepage', vrl);
                } else {
                    alert("您的浏览器不支持，请按照下面步骤操作：1.打开浏览器设置。2.点击设置网页。3.输入：" + vrl + "点击确定。");
                }
            }
        }
        //加入收藏
        function shoucang(sTitle, sURL) {
            try {
                window.external.addFavorite(sURL, sTitle);
            } catch (e) {
                try {
                    window.sidebar.addPanel(sTitle, sURL, "");
                } catch (e) {
                    alert("加入收藏失败，请使用Ctrl+D进行添加");
                }
            }
        }
    </script>


    <![endif]-->
</head>
<body>
<div class="header">
    <div class="header-top">
        <div class="w">
					<span class="f-l">
						<ul class="nav-left">
                            <li><a href="javascript:void(0)" onclick="SetHome(this,window.location)">设为首页</a></li>
                            <li><a href="javascript:void(0)" onclick="shoucang(document.title,window.location)">加入收藏</a></li>
                        </ul>
					</span>
					<span class="f-r">
						<ul class="nav-right">
                            <li>欢迎 访问FreedomArmy！</li>
                            <li><a href="">登录</a></li>
                            <li><a href="">注册</a></li>
                        </ul>
					</span>
        </div>
    </div>
    <hr style="color: #303030;"/>
    <div class="header-wrap">
        <div class="logo f-l">
            <a href="#"><img src="${pageContext.request.contextPath}/resource/img/common/login/head.png" height="130"/></a>
        </div>
    </div>
</div>

<div class="mt-50">
</div>

<div class="logframe">
    <div class="login-content">
        <div class="col-7">
        </div>
        <div class="col-3">
            <div class="panel panel-primary">
                <div class="panel-header">
                    <h4 class="text-c">用户登录</h4>
                </div>
                <div class="panel-body">
                    <form method="post" class="form form-horizontal responsive" id="login-form" action="/freedomarmy/admin/login">
                        <div class="row cl">
                            <label class="form-label col-3">账号：</label>

                            <div class="formControls col-9">
                                <input class="input-text" autocomplete="off" name="name" placeholder="账号" type="text" size="11">
                            </div>
                        </div>
                        <div class="row cl">
                            <label class="form-label col-3">密码：</label>

                            <div class="formControls col-9">
                                <input class="input-text" autocomplete="off" name="password" placeholder="密码" type="password" size="22">
                            </div>
                        </div>
                        <div class="row cl text-c">
                            <input class="btn btn-primary radius" value="立即登录" type="submit">
                        </div>
                    </form>
                </div>
            </div>
            <div>
            </div>
        </div>
    </div>
    <hr style="color: #303030;"/>
    <div class="footer">
        <div class="footer-top">
            <div class="footer-top-nav w">
                <ul>
                    <li>
                        <a>关于我们</a>
                    </li>
                    <li>
                        <a href="http://www.chinahr.com/zigong/">诚聘英才</a>
                    </li>
                    <li>
                        <a href="https://s.taobao.com/search?ie=utf8&initiative_id=staobaoz_20180711&stats_click=search_radio_all%3A1&js=1&imgfile=&q=%E5%81%A5%E8%BA%AB%E5%99%A8%E6%9D%90%E7%BB%84%E5%90%88%E5%A5%97%E8%A3%85&suggest=0_1&_input_charset=utf-8&wq=%E5%81%A5%E8%BA%AB%E5%99%A8%E6%9D%90%E7%BB%84%E5%90%88&suggest_query=%E5%81%A5%E8%BA%AB%E5%99%A8%E6%9D%90%E7%BB%84%E5%90%88&source=suggest">主营业务</a>
                    </li>
                    <li>
                        <a href="https://consumerservice.taobao.com/contact-us?spm=a230r.1.1997523009.35.633717197X8WnJ">联系方式</a>
                    </li>
                    <li>
                        <a href="https://map.baidu.com/">网站地图</a>
                    </li>
                </ul>
                <p>地址：四川省自贡市汇兴路学苑街180号</p>

                <p>邮编：100000　电话：028-8888888</p>

                <p>All Right Reserved By FreedomArmy 京ICP备0000000号 京公网安备6666666666</p>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript" src="${pageContext.request.contextPath}/res/lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/res/js/H-ui.js"></script>
</body>

</html>