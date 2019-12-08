<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>

<head>
    <title></title>
    <script>
        function resetsrc(t) {
            t.src="<%=request.getContextPath()%>/userloginimgcheck?a="+new Date().getTime();
        }
    </script>
</head>

<body>
<h2>用户登陆</h2>
<%--fieldset表示用边框将下边的内容框起来--%>
<fieldset>登陆
    <form action="<%=request.getContextPath()%>/userlogin">
        用户名：<input name="username"><br>
        密&nbsp;&nbsp;码：<input type="password" name="password"><br>
        验证码：<input name="imgcheck"><img src="<%=request.getContextPath()%>/userloginimgcheck" onclick="resetsrc(this)"><br>
        <input type="submit" value="登陆">
    </form>
</fieldset>
</body>
</html>
