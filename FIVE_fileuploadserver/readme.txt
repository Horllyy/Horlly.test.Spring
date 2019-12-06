问题：

跨服务器上传文件没办法传文件名中有中文字符的文件或图片。（验证得文件内部带有中文字可解析，不知道是不是因为我配置了中文字符解析器的原因。）

注意点：
1.和同一服务器上传文件不同，跨服务器没办法生成不存在的指定文件夹，在上传前要手动创建，我的默认路径：
  C:\Users\pc\apache-tomcat-8.0.53-windows-x64\apache-tomcat-8.0.53\webapps\xxx项目\新建指定文件夹

2.Tomcat服务器默认 read-only，所以在跨服务器上传时要去：
  C:\Users\pc\apache-tomcat-8.0.53-windows-x64\apache-tomcat-8.0.53\conf\web.xml文件中添加参数：

  添加前：
   <servlet>
          <servlet-name>default</servlet-name>
          <servlet-class>org.apache.catalina.servlets.DefaultServlet</servlet-class>
          <init-param>
              <param-name>debug</param-name>
              <param-value>0</param-value>
          </init-param>
          <init-param>
              <param-name>listings</param-name>
              <param-value>false</param-value>
          </init-param>
          <load-on-startup>1</load-on-startup>
      </servlet>

 添加后：
   <servlet>
          <servlet-name>default</servlet-name>
          <servlet-class>org.apache.catalina.servlets.DefaultServlet</servlet-class>
          <init-param>
              <param-name>debug</param-name>
              <param-value>0</param-value>
          </init-param>
  		<init-param>
          <param-name>readonly</param-name>
          <param-value>false</param-value>
          </init-param>
          <init-param>
              <param-name>listings</param-name>
              <param-value>false</param-value>
          </init-param>
          <load-on-startup>1</load-on-startup>
      </servlet>
