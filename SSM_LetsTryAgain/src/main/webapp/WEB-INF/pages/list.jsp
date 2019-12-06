<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2019/8/18
  Time: 21:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>this is the list page</title>
</head>
<body>
  <h3>查询到所有账户信息</h3>

  ${list}

  <c:forEach items="${list}" var="account">
      ${account.name}
  </c:forEach>

</body>
</html>
