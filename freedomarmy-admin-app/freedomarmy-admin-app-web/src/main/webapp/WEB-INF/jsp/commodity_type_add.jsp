<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width,initial-scale=1,user-scalable=no"/>
    <meta name="keywords" content="毕业设计">
    <meta name="description" content="四川理工学院毕业设计管理系统">
    <link rel="Bookmark" href="favicon.ico">
    <link rel="Shortcut Icon" href="favicon.ico"/>
    <!--[if lt IE 9]>
    <script type="text/javascript" src="${pageContext.request.contextPath}/res/lib/html5.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/res/lib/respond.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/res/lib/PIE_IE678.js"></script>
    <![endif]-->
    <link href="${pageContext.request.contextPath}/res/css/H-ui.min.css" rel="stylesheet" type="text/css"/>
    <link href="${pageContext.request.contextPath}/res/css/H-ui.admin.css" rel="stylesheet" type="text/css"/>
    <link href="${pageContext.request.contextPath}/res/lib/Hui-iconfont/1.0.1/iconfont.css" rel="stylesheet" type="text/css"/>
    <!--[if IE 6]>
    <script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js"></script>
    <script>DD_belatedPNG.fix('*');</script>
    <![endif]-->
</head>
<body>
<div class="pd-20">
    <form action="/freedomarmy/admin/commodityType/add" method="get" class="form form-horizontal" id="commodity_type_add">

        <!--类型名字部分-->
        <div class="row cl">
            <label class="form-label col-3">类型名字：</label>

            <div class="formControls col-7">
                <input type="text" class="input-text" placeholder="类型名字" name="name">
            </div>
            <div class="col-2">
            </div>
        </div>

        <!--类型父类-->
        <div class="row cl">
            <label class="form-label col-3">商品种类：</label>

            <div class="formControls col-7"> <span class="select-box">
				<select class="select" size="1" name="type">
                    <option value="" selected>请选择商品类型</option>
                    <c:forEach items="${type}" var="item">
                        <option value="${item.id}">${item.typeName}</option>
                    </c:forEach>
                </select>
				</span>
            </div>
        </div>


        <div class="pt-20 row cl">
            <div class="col-3"></div>
            <div class="col-7">
                <input type="submit" class="btn btn-block btn-primary" name="submit" value="确认提交"/>
            </div>
        </div>
    </form>
</div>
<script type="text/javascript" src="${pageContext.request.contextPath}/res/lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/res/lib/layer/1.9.3/layer.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/res/lib/Validform/5.3.2/Validform.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/res/js/H-ui.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/res/js/H-ui.admin.js"></script>
<script type="text/javascript">
    $("#commodity_type_add").Validform({
        tiptype: 2,
        callback: function (form) {
            form[0].submit();
            var index = parent.layer.getFrameIndex(window.name);
            parent.$('.btn-refresh').click();
            parent.layer.close(index);
        }
    });

</script>
</body>
</html>