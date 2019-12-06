<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2019/8/19
  Time: 13:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

  <h3>测试server为啥突然报错 新建项目是否有用</h3>


  <%--<a href="user/test?date=2019-3-2">点击测试</a>--%>

  <%--<form action="accountController/saveAccount" method="post">--%>
      <%--姓名：<input type="text" name="username"/><br>--%>
      <%--密码：<input type="text" name="password"><br>--%>
      <%--金额：<input type="text" name="money"/><br>--%>
      <%--用户姓名：<input type="text" name="user.uname"/><br>--%>
      <%--用户年龄：<input type="text" name="user.age"><br>--%>
      <%--<br><br>--%>
      <%--list用户1姓名：<input type="text" name="list[0].uname"/><br>--%>
      <%--list用户1年龄：<input type="text" name="list[0].age"><br>--%>
      <%--<br>--%>
      <%--list用户2姓名：<input type="text" name="list[1].uname"/><br>--%>
      <%--list用户2年龄：<input type="text" name="list[1].age"><br>--%>
      <%--<br><br>--%>
      <%--map用户1姓名：<input type="text" name="map[one].uname"/><br>--%>
      <%--map用户1年龄：<input type="text" name="map[one].age"><br>--%>
      <%--<br>--%>
      <%--map用户2姓名：<input type="text" name="map['two'].uname"/><br>--%>
      <%--map用户2年龄：<input type="text" name="map['two'].age"><br>--%>
      <%--<input type="submit" value="提交"/>--%>
  <%--</form>--%>

  <script src="js/jquery.min.js"></script>

  <script>
      $(function () {
          $("#btn").click(function () {
              // alert("hello btn");
              //发送ajax请求
              $.ajax({
                  url:"user/testAjax",
                  contentType:"application/json;charset=UTF-8",
                  data:'{"username":"哈哈", "password":"123","age":"22" }',
                  dataType:"json",
                  type:"post",
                  success:function (data) {
                      //data 服务器端响应的json的数据，进行解析
                      alert(data);
                      alert(data.uname);
                      alert(data.password);
                      alert(data.age);
                  }
              });
          });
      });
  </script>

  <button id="btn">发送ajax的请求</button>

</body>
</html>
