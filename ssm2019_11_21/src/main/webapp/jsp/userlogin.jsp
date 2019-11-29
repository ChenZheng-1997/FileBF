<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/27
  Time: 9:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<fieldset><legend>登陆</legend>
    <form action="/ssm2019_11_21_war_exploded/userLogin">
        用户名：<input name="username"><br>
        密码：<input type="password" name="userpwd"><br>
        验证码：<input name="" style="width: 80px"><img src="/img/"><br>
        <input type="submit" value="登录">
    </form>
</fieldset>

</body>
</html>
