<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <link href="${pageContext.request.contextPath}/res/lib/webuploader/0.1.5/webuploader.css" rel="stylesheet" type="text/css"/>
    <link href="${pageContext.request.contextPath}/res/lib/icheck/icheck.css" rel="stylesheet" type="text/css"/>

</head>
<body>


<div class="page-container">
    <form class="form form-horizontal" id="form-article-add">


        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>商品名称：</label>

            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="" placeholder="" name="" id="commodityName">
            </div>
        </div>


        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>商品价格：</label>

            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="" placeholder="" id="commodityPrice" name="">
            </div>
        </div>


        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>商品类型：</label>

            <div class="formControls col-xs-8 col-sm-9">
				<span class="select-box">
				<select name="" class="select" id="commodityType">
                    <c:forEach items="${type}" var="item">
                        <option value="\"
                        "+"${item.id}"+"\"">${item.typeName}</option>
                    </c:forEach>
                </select>
				</span>
            </div>
        </div>


        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>商品库存：</label>

            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="0" placeholder="" name="" id="commodityStock">
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">赠送积分：</label>

            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="0" placeholder="" id="commodityIntegral" name="">
            </div>
        </div>


        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>商品状态：</label>

            <div class="formControls col-xs-8 col-sm-9">
				<span class="select-box">
				<select name="" class="select">
                    <option value="0">上架</option>
                    <option value="1">下架</option>
                </select>
				</span>
            </div>
        </div>

        <div class="row cl">
            <div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-2">
                <button onclick="submit();"><i class="Hui-iconfont">&#xe632;</i> 保存并提交审核</button>
            </div>
        </div>

    </form>


    <%--顶部图片上传--%>
    <div class="row cl">
        <form class="form form-horizontal">
            <label class="form-label col-xs-4 col-sm-2">顶部图片上传：</label>


            <div class="formControls col-xs-8 col-sm-9">
                <div class="uploader-list-container">
                    <div class="queueList">
                        <div class="placeholder">
                            <div class="webuploader-container">
                                <div class="webuploader-pick">点击选择图片</div>
                                <div style="position: absolute; top: 20px; left: 0px; width: 168px; height: 44px; overflow: hidden; bottom: auto; right: auto;"><input type="file" name="file" class="webuploader-element-invisible" multiple="multiple"><label style="opacity: 0; width: 100%; height: 100%; display: block; cursor: pointer; background: rgb(255, 255, 255);"></label></div>
                            </div>
                            <p>或将照片拖到这里，单次最多可选5张</p>
                        </div>
                        <ul class="filelist"></ul>
                    </div>
                    <div class="statusBar" style="display:none;">
                        <div class="info">共0张（0B），已上传0张</div>
                        <div class="btns">
                            <div class="webuploader-container">
                                <div class="webuploader-pick">继续添加</div>
                                <div style="position: absolute; top: 0px; left: 0px; width: 38px; height: 2px; overflow: hidden; bottom: auto; right: auto;"><input type="file" name="file" class="webuploader-element-invisible" multiple="multiple"><label style="opacity: 0; width: 100%; height: 100%; display: block; cursor: pointer; background: rgb(255, 255, 255);"></label></div>
                            </div>
                            <div class="uploadBtn state-pedding">开始上传</div>
                        </div>
                    </div>
                </div>
            </div>
        </form>
    </div>


    <%--内容图片上传--%>
    <div class="row cl">
        <form class="form form-horizontal">
            <label class="form-label col-xs-4 col-sm-2">顶部图片上传：</label>


            <div class="formControls col-xs-8 col-sm-9">
                <div class="uploader-list-container">
                    <div class="queueList">
                        <div class="placeholder">
                            <div class="webuploader-container">
                                <div class="webuploader-pick">点击选择图片</div>
                                <div id="rt_rt_1ci4as14k1un318e513qnepsov06" style="position: absolute; top: 20px; left: 0px; width: 168px; height: 44px; overflow: hidden; bottom: auto; right: auto;"><input type="file" name="file" class="webuploader-element-invisible" multiple="multiple"><label style="opacity: 0; width: 100%; height: 100%; display: block; cursor: pointer; background: rgb(255, 255, 255);"></label></div>
                            </div>
                            <p>或将照片拖到这里，单次最多可选5张</p>
                        </div>
                        <ul class="filelist"></ul>
                    </div>
                    <div class="statusBar" style="display:none;">
                        <div class="info">共0张（0B），已上传0张</div>
                        <div class="btns">
                            <div class="webuploader-container">
                                <div class="webuploader-pick">继续添加</div>
                                <div id="rt_rt_1ci4as14l1mn51d2npnvkma19or9" style="position: absolute; top: 0px; left: 0px; width: 38px; height: 2px; overflow: hidden; bottom: auto; right: auto;"><input type="file" name="file" class="webuploader-element-invisible" multiple="multiple"><label style="opacity: 0; width: 100%; height: 100%; display: block; cursor: pointer; background: rgb(255, 255, 255);"></label></div>
                            </div>
                            <div class="uploadBtn state-pedding">开始上传</div>
                        </div>
                    </div>
                </div>
            </div>
        </form>
    </div>


    <%--显示图片上传--%>
    <div class="row cl">
        <form class="form form-horizontal">
            <label class="form-label col-xs-4 col-sm-2">显示图片上传：</label>


            <div class="formControls col-xs-8 col-sm-9">
                <div class="uploader-list-container">
                    <div class="queueList">
                        <div class="placeholder">
                            <div class="webuploader-container">
                                <div class="webuploader-pick">点击选择图片</div>
                                <div style="position: absolute; top: 20px; left: 0px; width: 168px; height: 44px; overflow: hidden; bottom: auto; right: auto;"><input type="file" name="file" class="webuploader-element-invisible" multiple="multiple"><label style="opacity: 0; width: 100%; height: 100%; display: block; cursor: pointer; background: rgb(255, 255, 255);"></label></div>
                            </div>
                            <p>或将照片拖到这里，单次最多可选5张</p>
                        </div>
                        <ul class="filelist"></ul>
                    </div>
                    <div class="statusBar" style="display:none;">
                        <div class="info">共0张（0B），已上传0张</div>
                        <div class="btns">
                            <div class="webuploader-container">
                                <div class="webuploader-pick">继续添加</div>
                                <div style="position: absolute; top: 0px; left: 0px; width: 38px; height: 2px; overflow: hidden; bottom: auto; right: auto;"><input type="file" name="file" class="webuploader-element-invisible" multiple="multiple"><label style="opacity: 0; width: 100%; height: 100%; display: block; cursor: pointer; background: rgb(255, 255, 255);"></label></div>
                            </div>
                            <div class="uploadBtn state-pedding">开始上传</div>
                        </div>
                    </div>
                </div>
            </div>
        </form>
    </div>


    <%--视频上传--%>
    <div class="row cl">
        <form class="form form-horizontal">
            <label class="form-label col-xs-4 col-sm-2">显示图片上传：</label>


            <div class="formControls col-xs-8 col-sm-9">
                <div class="uploader-list-container">
                    <div class="queueList">
                        <div class="placeholder">
                            <div class="webuploader-container">
                                <div class="webuploader-pick">点击选择图片</div>
                                <div style="position: absolute; top: 20px; left: 0px; width: 168px; height: 44px; overflow: hidden; bottom: auto; right: auto;"><input type="file" name="file" class="webuploader-element-invisible" multiple="multiple"><label style="opacity: 0; width: 100%; height: 100%; display: block; cursor: pointer; background: rgb(255, 255, 255);"></label></div>
                            </div>
                            <p>或将照片拖到这里，单次最多可选5张</p>
                        </div>
                        <ul class="filelist"></ul>
                    </div>
                    <div class="statusBar" style="display:none;">
                        <div class="info">共0张（0B），已上传0张</div>
                        <div class="btns">
                            <div class="webuploader-container">
                                <div class="webuploader-pick">继续添加</div>
                                <div style="position: absolute; top: 0px; left: 0px; width: 38px; height: 2px; overflow: hidden; bottom: auto; right: auto;"><input type="file" name="file" class="webuploader-element-invisible" multiple="multiple"><label style="opacity: 0; width: 100%; height: 100%; display: block; cursor: pointer; background: rgb(255, 255, 255);"></label></div>
                            </div>
                            <div class="uploadBtn state-pedding">开始上传</div>
                        </div>
                    </div>
                </div>
            </div>
        </form>
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
<script type="text/javascript" src="${pageContext.request.contextPath}/res/lib/jquery.validation/1.14.0/jquery.validate.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/res/lib/jquery.validation/1.14.0/validate-methods.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/res/lib/jquery.validation/1.14.0/messages_zh.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/res/lib/webuploader/0.1.5/webuploader.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/res/lib/ueditor/ueditor.config.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/res/lib/ueditor/ueditor.all.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/res/lib/ueditor/lang/zh-cn/zh-cn.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/res/lib/icheck/jquery.icheck.min.js"></script>


<script type="text/javascript">

    function submit() {
        alert("发起请求了");
        var name = $("#commodityName").val();
        var price = $("#commodityPrice").val;
        var type = $("#commodityType").val();
        var stock = $("#commodityStock").val();
        var integral = $("#commodityIntegral");
        $.ajax({
            type: "post",
            url: "/freedomarmy/admin/commodity/add",
            dataType: "text",
            async: false,
            data: {"commodityName": name, "commodityPrice": price, "commodityType": type, "commodityStock": stock, "commodityIntegral": integral},
            success: function (data) {
                alert("插入成功，返回ID:" + data);
                return true;
            },
            error: function (XMLHttpRequest, textStatus, errorThrown) {
                alert("提交失败，原因：" + errorThrown);
                return false;
            }
        });
    }


    jQuery(function () {

        uploader = new Array();//创建 uploader数组
        // 优化retina, 在retina下这个值是2
        var ratio = window.devicePixelRatio || 1,
        // 缩略图大小
                thumbnailWidth = 100 * ratio,
                thumbnailHeight = 100 * ratio,
                supportTransition = (function () {
                    var s = document.createElement('p').style,
                            r = 'transition' in s ||
                                    'WebkitTransition' in s ||
                                    'MozTransition' in s ||
                                    'msTransition' in s ||
                                    'OTransition' in s;
                    s = null;
                    return r;
                })();
        // 所有文件的进度信息，key为file id
        var percentages = {};
        var state = 'pedding';

        //可行性判断
        if (!WebUploader.Uploader.support()) {
            alert('Web Uploader 不支持您的浏览器！如果你使用的是IE浏览器，请尝试升级 flash 播放器');
            throw new Error('WebUploader does not support the browser you are using.');
        }

        //循环页面中每个上传域
        $('.uploader-list-container').each(function (index) {

            // 添加的文件数量
            var fileCount = 0;
            // 添加的文件总大小
            var fileSize = 0;

            var filePicker = $(this).find('.webuploader-pick');//上传按钮实例
            var queueList = $(this).find('.queueList');//拖拽容器实例
            var jxfilePicker = $(this).find('.webuploader-pick');//继续添加按钮实例
            var placeholder = $(this).find('.placeholder');//按钮与虚线框实例
            var statusBar = $(this).find('.statusBar');//再次添加按钮容器实例
            var info = statusBar.find('.info');//提示信息容器实例

            // 图片容器
            var queue = $('<ul class="filelist"></ul>').appendTo(queueList);


            //初始化上传实例
            uploader[index] = WebUploader.create({
                pick: {
                    id: filePicker,
                    label: '点击选择图片'
                },
                dnd: queueList,

                //这里可以根据 index 或者其他，使用变量形式
                accept: {
                    title: 'Images',
                    extensions: 'gif,jpg,jpeg,bmp,png,doc',
                    mimeTypes: 'image/*'
                },

                // swf文件路径
                swf: 'res/Uploader.swf',

                disableGlobalDnd: true,//禁用浏览器的拖拽功能，否则图片会被浏览器打开

                chunked: false,//是否分片处理大文件的上传

                server: 'fileUpload.do',//上传地址

                fileNumLimit: 5,//一次最多上传文件个数

                fileSizeLimit: 10 * 1024 * 1024,    // 总共的最大限制10M

                fileSingleSizeLimit: 3 * 1024 * 1024,   // 单文件的最大限制3M

                auto: true,

                formData: {
                    token: index//可以在这里附加控件编号，从而区分是哪个控件上传的
                }
            });


            // 添加“添加文件”的按钮
            uploader[index].addButton({
                id: jxfilePicker,
                label: '继续添加'
            });

            //当文件加入队列时触发	uploader[0].upload();
            uploader[index].onFileQueued = function (file) {
                alert(111);
                fileCount++;
                fileSize += file.size;

                if (fileCount === 1) {
                    placeholder.addClass('element-invisible');
                    statusBar.show();
                }

                addFile(file, uploader[index], queue);
                setState('ready', uploader[index], placeholder, queue, statusBar, jxfilePicker);
                updateStatus('ready', info, fileCount, fileSize);
            };

            //当文件被移除队列后触发。
            uploader[index].onFileDequeued = function (file) {
                fileCount--;
                fileSize -= file.size;

                if (!fileCount) {
                    setState('pedding', uploader[index], placeholder, queue, statusBar, jxfilePicker);
                    updateStatus('pedding', info, fileCount, fileSize);
                }
                removeFile(file);


            };

            uploader[index].on('uploadSuccess', function (file, reponse) {

                alert("上传成功");
            });


            //可以在这里附加额外上传数据

            uploader[index].on('uploadBeforeSend', function (object, data, header) {
                /*var tt=$("input[name='id']").val();
                 data=$.extend(data,{
                 modelid:tt
                 });*/
                alert("上传前触发");
            });

        });


        // 当有文件添加进来时执行，负责view的创建
        function addFile(file, now_uploader, queue) {
            var $li = $('<li id="' + file.id + '">' +
                            '<p class="title">' + file.name + '</p>' +
                            '<p class="imgWrap"></p>' +
                            '<p class="progress"><span></span></p>' +
                            '</li>'),

                    $btns = $('<div class="file-panel">' +
                            '<span class="cancel">删除</span>' +
                            '<span class="rotateRight">向右旋转</span>' +
                            '<span class="rotateLeft">向左旋转</span></div>').appendTo($li),
                    $prgress = $li.find('p.progress span'),
                    $wrap = $li.find('p.imgWrap'),
                    $info = $('<p class="error"></p>');

            $wrap.text('预览中');
            if (file.flog == true) {
                var img = $('<img src="' + file.ret + '">');
                $wrap.empty().append(img);
            } else {
                now_uploader.makeThumb(file, function (error, src) {
                    if (error) {
                        $wrap.text('不能预览');
                        return;
                    }

                    var img = $('<img src="' + src + '">');
                    $wrap.empty().append(img);
                }, thumbnailWidth, thumbnailHeight);
            }

            percentages[file.id] = [file.size, 0];
            file.rotation = 0;

            $li.on('mouseenter', function () {
                $btns.stop().animate({height: 30});
            });

            $li.on('mouseleave', function () {
                $btns.stop().animate({height: 0});
            });


            $btns.on('click', 'span', function () {
                var index = $(this).index(),
                        deg;

                switch (index) {
                    case 0:
                        now_uploader.removeFile(file);
                        return;

                    case 1:
                        file.rotation += 90;
                        break;

                    case 2:
                        file.rotation -= 90;
                        break;
                }

                if (supportTransition) {
                    deg = 'rotate(' + file.rotation + 'deg)';
                    $wrap.css({
                        '-webkit-transform': deg,
                        '-mos-transform': deg,
                        '-o-transform': deg,
                        'transform': deg
                    });
                } else {
                    $wrap.css('filter', 'progid:DXImageTransform.Microsoft.BasicImage(rotation=' + (~~((file.rotation / 90) % 4 + 4) % 4) + ')');

                }


            });

            $li.appendTo(queue);
        }


        // 负责view的销毁
        function removeFile(file) {
            var $li = $('#' + file.id);
            delete percentages[file.id];

            $li.off().find('.file-panel').off().end().remove();
        }


        function setState(val, now_uploader, placeHolder, queue, statusBar, jxfilePicker) {

            switch (val) {
                case 'pedding':
                    placeHolder.removeClass('element-invisible');
                    queue.parent().removeClass('filled');
                    queue.hide();
                    statusBar.addClass('element-invisible');
                    now_uploader.refresh();
                    break;

                case 'ready':
                    placeHolder.addClass('element-invisible');
                    jxfilePicker.removeClass('element-invisible');
                    queue.parent().addClass('filled');
                    queue.show();
                    statusBar.removeClass('element-invisible');
                    now_uploader.refresh();
                    break;
            }


        }

        function updateStatus(val, info, f_count, f_size) {
            var text = '';

            if (val === 'ready') {
                text = '选中' + f_count + '张图片，共' +
                        WebUploader.formatSize(f_size) + '。';
            }

            info.html(text);
        }
    });
</script>
</body>
</html>