import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.IAccountService;


public class AccountServiceTest {
 @Test
    public void testTransfer(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("Bean.xml");
        IAccountService as=ac.getBean("accountService", IAccountService.class);
        //这里我把原来的accountService换成更具体的代理proxyAccountService
        as.transfer("ccc","aaa",100);
    }
}
