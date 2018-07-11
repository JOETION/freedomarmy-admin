<!DOCTYPE HTML>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no"/>
    <meta http-equiv="Cache-Control" content="no-siteapp"/>
    <!--[if lt IE 9]>
    <script type="text/javascript" src="${pageContext.request.contextPath}/lib/html5shiv.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/lib/respond.min.js"></script>
    <![endif]-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/res/css/H-ui.min.css"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/res/css/H-ui.admin.css"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/res/Hui-iconfont/1.0.8/iconfont.min.css"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/res/skin/default/skin.css" id="skin"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/res/css/style.css"/>
    <!--[if IE 6]>
    <script type="text/javascript" src="${pageContext.request.contextPath}/res/lib/DD_belatedPNG_0.0.8a-min.js"></script>
    <script>DD_belatedPNG.fix('*');</script>
    <![endif]-->
    <title>商品类别关联</title>
</head>
<body>
<div class="page-container">

    <!-- 表格 -->
    <div class="mt-20">

        <table class="table table-border table-bordered table-bg table-hover table-sort table-responsive">

            <thead>
            <tr class="text-c">
                <th width="80">id</th>
                <th>commodityName</th>
                <th>commodityPrice</th>
                <th width="80">commodityTypeName</th>
                <th width="180">操作</th>
            </tr>
            </thead>
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

    $(document).ready(function () {
        $(".table-sort").dataTable({
            "processing": true,
            "serverSide": true,
            "bStateSave": true,
            "ajax": "/freedomarmy/admin/commodityType/get",
            "columns": [
                {"data": "id"},
                {"data": "commodityName"},
                {"data": "commodityPrice", "bSortable": false},
                {"data": "commodityTypeName", "bSortable": false},
                {"data": "操作", bSortable: false}
            ],
            "columnDefs": [
                {
                    "targets": [4],
                    "data": "id",
                    "render": function (data, type, full) {
                        return "<select class='select_commodity_type_" + full.id + "'" + ">"
                                + "<option selected>" + "请选择类别" + "</option >"
                                + "<c:forEach items="${type}" var='test'>" + "<option value =\"" + "${test.id}" + "\">"
                                + "${test.typeName}" + "</option >" +
                                "</c:forEach>" + "</select>" +
                                "&nbsp;" + "<a style='text-decoration:none' class='ml-5' onclick=" + "\"updateCommodityType(" + full.id + ")\"" + ">" + "提交" + "</a>";
                    }
                },
                {
                    targets: [0],
                    title: "编号"
                }, {
                    targets: [1],
                    title: "商品名字"
                }, {
                    targets: [2],
                    title: "商品价格"
                }, {
                    targets: [3],
                    title: "商品类型"
                }
            ]
        });
    });

    //可能type失效了！
    function updateCommodityType(commodityId) {
        var value = $(".select_commodity_type_" + commodityId).val();
        if (value == "请选择类别" || value == undefined || value == "") {
            alert("未选择任何类别");
            return;
        }
        $.ajax({
            type: "get",
            url: "/freedomarmy/admin/commodity/updateType",
            dataType: "text",
            async: false,
            data: {"commodityId": commodityId, "commodityTypeId": value},
            success: function (data) {
                if (data == "success") {
                    alert("更新商品类型成功！");
                    $(".table-sort").DataTable().ajax.reload(null, false);
                }
                else {
                    alert("更新商品类型失败！");
                }
            },
            error: function (XMLHttpRequest, textStatus, errorThrown) {
                alert("提交失败，原因：" + errorThrown);
                return false;
            }
        });
    }
</script>
</body>
</html>