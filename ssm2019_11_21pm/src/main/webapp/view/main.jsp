<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/12/7
  Time: 14:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SelectUserMeun</title>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/aftermain.css"/>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/zTreeStyle/zTreeStyle.css">
    <script src="<%=request.getContextPath()%>/js/jquery-1.4.4.min.js"></script>
    <script src="<%=request.getContextPath()%>/js/jquery.ztree.core-3.5.js"></script>

    <SCRIPT type="text/javascript">
        <!--
        var setting = {
            view: {
                dblClickExpand: false,
                showLine: false
            },
            data: {
                simpleData: {
                    enable: true
                }
            },
            callback: {
                onClick: onClick
            }

        };

        var zNodes = [
            {id: 1, pId: 0, name: "父节点1 - 展aaaa开", open: true},
            {id: 11, pId: 1, name: "父节点11 - 折叠"},
            {id: 111, pId: 11, name: "叶子节点111", url: "http://www.163.com", "target": "mainiframe"},
            {id: 13, pId: 1, name: "父节点13 - 没有子节点", isParent: true},
            {id: 2, pId: 0, name: "父节点2 - 折叠"},
            {id: 21, pId: 2, name: "父节点21 - 展开", open: true},
        ];

        $(document).ready(function () {
            $.fn.zTree.init($("#treeDemo"), setting, zNodes);
        });


        function onClick(e, treeId, treeNode) {
            var zTree = $.fn.zTree.getZTreeObj("treeDemo");
            zTree.expandNode(treeNode, null, null, null, true);

        }

        //-->
    </SCRIPT>

</head>
<body>
<div class="maintop">
    <ul class="commonul menuul">
        <li class="commonli m1">首页</li>
        <li class="commonli m1">系统</li>
        <li class="commonli m1">用户</li>
        <li class="commonli m1">任务</li>
    </ul>
</div>

<div class="mainleft">
    <div class="zTreeDemoBackground left">
        <ul id="treeDemo" class="ztree"></ul>
    </div>
</div>
<div class="mainright">
    <iframe name="mainiframe" src="" width="100%" height="99%" frameborder="0px" style="background: #FFFFFF;"></iframe>
</div>
</body>
</html>
