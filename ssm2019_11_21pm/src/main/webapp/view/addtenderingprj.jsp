<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/12/10
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>增加招标项目</title>
    <script src="<%=request.getContextPath()%>/js/jquery-1.4.4.min.js"></script>

    <script>
        //页面加载完毕执行
        $(function () {
            $.get("<%=request.getContextPath()%>/selectalltenderingtype", function (data) {

                var ops = "";
                for (var i = 0; i < data.length; i++) {
                    ops += "<option value='"+data[i].id+"'>" + data[i].tenderingtypename + "</option>"
                }
                $("#tenderingtypeid").append(ops);
            });
        });
    </script>
</head>
<body>
<fieldset>
    <legend>增加招标项目</legend>
    <form action="" method="post">
        招标类型：<select name="tenderingtype" id="tenderingtypeid"></select><br>
        标题：<input><br>
        描述：<br>
        发布时间：<br>
        招标结束时间：<br>
        开标时间：<br>
        招标附件：<br>
    </form>
</fieldset>
</body>
</html>
