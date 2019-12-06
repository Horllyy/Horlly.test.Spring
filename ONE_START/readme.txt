我做这个first springmvc hello demo做了两个小时才完成。
不要小瞧任何一个新知识。
跨出第一步很多时候意味着成功一半。至少我完成了初步实现不是吗，对初级项目也有了一定的了解。

这很好。
那么经过实践我总结了几个需要注意的点，我计较容易犯错误：
1.springmvc.xml中的视图解析器bean的路径配置
        <property name="prefix" value="/WEB-INF/pages/"></property>
 我在路径的格式上犯了一次错误，后来检查出来。

2. @RequestMapping(path="/hello") 这里/hello需要注意，这是默认情况，我一开始是用自己的命名，但是由于刚起步容易遇到困难，
    我在途中还是修改成了默认的情况。日后基础扎实了可继续进行尝试。

3.index.jsp的
   <a href="hello">入门程序由此进入</a>
   hello这里我又犯了一次错误，后被检查出来修改。我在hello前面多加了/。其实不用。这里不表示路径，就是表示一个目标页面罢了。

4.Run的tomcat配置下面，Server页的URL路径：
    http://localhost:8080/ONE_START/
  我只有写这个才是正确的，我并不会像博主一样使用  http://localhost:8080/  就能自动跳转到我的项目。
  这里有待考证。

5.到目前为止我的项目可以正常跑，但肯定还有待优化。继续加油，继续探索。靡不有初，鲜克有终。