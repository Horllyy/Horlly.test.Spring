package ui;

import dao.IAccountDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.IAccountService;
import service.impl.AccountServiceImpl;

public class Client {
    public static void main(String[] args) {
//        IAccountService as=new AccountServiceImpl();//不new
        //1.获取核心容器对象
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        //2.根据id获取bean对象
        IAccountService as=(IAccountService)ac.getBean("accountService");
        IAccountDao adaoo=ac.getBean("accountDao",IAccountDao.class);

        System.out.println(as);
        System.out.println(adaoo);

//        as.saveAccount();
    }
}
