import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.IAccountService;

public class AccountServiceTest {
    @Test
    public void testTransfer(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        IAccountService as=ac.getBean("accountService", IAccountService.class);
        as.transfer("aaa","ccc",100);
    }

    @Test
    public void testDeleteAccount(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("Bean.xml");
        IAccountService as=ac.getBean("accountService", IAccountService.class);
        as.deleteAccount(4);
    }

    @Test
    public void testFindAccountById(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("Bean.xml");
        IAccountService as=ac.getBean("accountService", IAccountService.class);
        System.out.println(as.findAccountById(4));
    }
}
