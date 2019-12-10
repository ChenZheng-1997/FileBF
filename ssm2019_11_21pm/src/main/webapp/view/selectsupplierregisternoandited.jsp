<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/12/10
  Time: 9:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>selectSupplierRegisterNoAndited</title>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/bootstrap.min.css">
</head>
<body>
<div class="container-fluid">
    <table class="table table-striped table-bordered">
        <tr>
            <td>序号</td>
            <td>供应商</td>
            <td>法人</td>
            <td>注册资金</td>
            <td>状态</td>
        </tr>
        <c:forEach items="${suppliers}" var="v" varStatus="vs">
            <%--varStatus表示序号--%>
            <tr>
                <td>${vs.count}</td>
                <td>${v.suppliername}</td>
                <td>${v.supplierpeople}</td>
                <td>${v.suppliermoney}</td>
                <td>${v.sign}+注册待审核</td>
            </tr>
        </c:forEach>
    </table>


</div>
</body>
</html>
