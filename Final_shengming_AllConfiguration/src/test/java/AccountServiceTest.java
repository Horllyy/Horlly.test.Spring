import config.SpringConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.IAccountService;
import service.impl.AccountService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)
public class AccountServiceTest {
    @Autowired
    private IAccountService as;
    @Test
    public void testTransfer(){
        as.transfer("ccc","aaa",100);
    }
}

/**
 * 很奇怪 下面这个惯用格式会报错
 * NoSuchBeanDefinitionException: No bean named 'AccountService' available
 *
 */
//
//public class AccountServiceTest {
//    @Test
//    public void testTransfer(){
//        AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext("SpringConfiguration.properties");
//        IAccountService as=ac.getBean("AccountService",IAccountService.class);
//        as.transfer("ccc","aaa",100);
//    }
//}
