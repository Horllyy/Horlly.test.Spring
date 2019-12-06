原本的mybatis配置文件：（未合并到spring的配置文件applicationContext.xml中时在这里配置 ）


<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE configuration
        PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-config.dtd">

<configuration>
    <!--配置环境  <dataSource type="POOLED"></dataSource> 表示使用连接池-->
    <environments default="mysql">
        <environment id="mysql">
            <transactionManager type="JDBC"></transactionManager>
            <dataSource type="POOLED">
              <property name="driver" value="com.mysql.jdbc.Driver"></property>
                <!--<property name="url" value="jdbc:mysql://localhost:3306/ssm"></property>-->
                <property name="url" value="jdbc:mysql://localhost:3306/ssm?useUnicode=true&amp;characterEncoding=utf8"></property>
                <property name="username" value="root"></property>
                <property name="password" value="123456"></property>
            </dataSource>
        </environment>
    </environments>

    <!--引入配置文件-->
    <mappers>
        <mapper class="My.dao.IAccountDao"></mapper>
        <!--<package name="My.dao"></package>-->
    </mappers>
</configuration>

