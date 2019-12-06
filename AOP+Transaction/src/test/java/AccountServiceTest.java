import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.IAccountService;


public class AccountServiceTest {
 @Test
    public void testTransfer(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        IAccountService as=ac.getBean("accountService", IAccountService.class);
        as.transfer("ccc","aaa",100);
    }
}
