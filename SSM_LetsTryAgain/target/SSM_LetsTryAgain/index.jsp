<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2019/8/18
  Time: 20:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>this is for springmvc!</title>
</head>
<body>
  <h3>测试springmv是否ok！</h3>

  <a href="account/findAll">测试</a>

  <form action="account/save" method="post">
      姓名：<input type="text" name="name"><br>
      金额：<input type="text" name="money"><br>
      <input type="submit" value="提交"><br>
  </form>
</body>
</html>
