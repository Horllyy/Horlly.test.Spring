package ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.IAccountService;

public class Client {
    public static void main(String[] args) {
        //1.获取核心容器对象
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");//该new还是得new
        //2.根据id获取bean对象
        IAccountService as= (IAccountService) ac.getBean("accountService");

        System.out.println(as);
    }
}
