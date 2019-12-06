1.

"C:\Program Files\Java\jdk1.8.0_162\bin\java.exe" -ea -Didea.test.cyclic.buffer.size=1048576 "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2018.3\lib\idea_rt.jar=64750:C:\Program Files\JetBrains\IntelliJ IDEA 2018.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\JetBrains\IntelliJ IDEA 2018.3\lib\idea_rt.jar;C:\Program Files\JetBrains\IntelliJ IDEA 2018.3\plugins\junit\lib\junit-rt.jar;C:\Program Files\JetBrains\IntelliJ IDEA 2018.3\plugins\junit\lib\junit5-rt.jar;C:\Program Files\Java\jdk1.8.0_162\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_162\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_162\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_162\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_162\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_162\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_162\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_162\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_162\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_162\jre\lib\rt.jar;C:\Users\pc\IdeaProjects\Horlly.test.Spring\SSM_LetsTryAgain\target\classes;C:\Users\pc\.m2\repository\org\aspectj\aspectjweaver\1.6.8\aspectjweaver-1.6.8.jar;C:\Users\pc\.m2\repository\org\springframework\spring-aop\5.0.2.RELEASE\spring-aop-5.0.2.RELEASE.jar;C:\Users\pc\.m2\repository\org\springframework\spring-beans\5.0.2.RELEASE\spring-beans-5.0.2.RELEASE.jar;C:\Users\pc\.m2\repository\org\springframework\spring-core\5.0.2.RELEASE\spring-core-5.0.2.RELEASE.jar;C:\Users\pc\.m2\repository\org\springframework\spring-jcl\5.0.2.RELEASE\spring-jcl-5.0.2.RELEASE.jar;C:\Users\pc\.m2\repository\org\springframework\spring-web\5.0.2.RELEASE\spring-web-5.0.2.RELEASE.jar;C:\Users\pc\.m2\repository\org\springframework\spring-webmvc\5.0.2.RELEASE\spring-webmvc-5.0.2.RELEASE.jar;C:\Users\pc\.m2\repository\org\springframework\spring-expression\5.0.2.RELEASE\spring-expression-5.0.2.RELEASE.jar;C:\Users\pc\.m2\repository\org\springframework\spring-test\5.0.2.RELEASE\spring-test-5.0.2.RELEASE.jar;C:\Users\pc\.m2\repository\org\springframework\spring-tx\5.0.2.RELEASE\spring-tx-5.0.2.RELEASE.jar;C:\Users\pc\.m2\repository\org\springframework\spring-jdbc\5.0.2.RELEASE\spring-jdbc-5.0.2.RELEASE.jar;C:\Users\pc\.m2\repository\junit\junit\4.12\junit-4.12.jar;C:\Users\pc\.m2\repository\org\hamcrest\hamcrest-core\1.3\hamcrest-core-1.3.jar;C:\Users\pc\.m2\repository\mysql\mysql-connector-java\5.1.6\mysql-connector-java-5.1.6.jar;C:\Users\pc\.m2\repository\javax\servlet\servlet-api\2.5\servlet-api-2.5.jar;C:\Users\pc\.m2\repository\javax\servlet\jsp\jsp-api\2.0\jsp-api-2.0.jar;C:\Users\pc\.m2\repository\jstl\jstl\1.2\jstl-1.2.jar;C:\Users\pc\.m2\repository\log4j\log4j\1.2.12\log4j-1.2.12.jar;C:\Users\pc\.m2\repository\org\slf4j\slf4j-api\1.6.6\slf4j-api-1.6.6.jar;C:\Users\pc\.m2\repository\org\slf4j\slf4j-log4j12\1.6.6\slf4j-log4j12-1.6.6.jar;C:\Users\pc\.m2\repository\org\mybatis\mybatis\3.4.5\mybatis-3.4.5.jar;C:\Users\pc\.m2\repository\org\mybatis\mybatis-spring\1.3.0\mybatis-spring-1.3.0.jar;C:\Users\pc\.m2\repository\c3p0\c3p0\0.9.1.2\c3p0-0.9.1.2.jar;C:\Users\pc\.m2\repository\org\springframework\spring-context\5.1.8.RELEASE\spring-context-5.1.8.RELEASE.jar" com.intellij.rt.execution.junit.JUnitStarter -ideVersion5 -junit4 My.test.TestSpring,run1
log4j:WARN No appenders could be found for logger (org.springframework.core.env.StandardEnvironment).
log4j:WARN Please initialize the log4j system properly.

java.lang.NoSuchMethodError: org.springframework.core.annotation.AnnotationUtils.clearCache()V

	at org.springframework.context.support.AbstractApplicationContext.resetCommonCaches(AbstractApplicationContext.java:923)
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:574)
	at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:144)
	at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:85)
	at My.test.TestSpring.run1(TestSpring.java:12)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47)
	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:325)
	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:78)
	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:57)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
	at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)
	at com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)
	at com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)
	at com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)


Process finished with exit code -1

解决：导入spring—core包