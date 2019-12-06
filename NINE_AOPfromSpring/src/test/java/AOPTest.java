import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import fourMethods.service.IAccountService;

//以下是单独一种方法的import
//import service.IAccountService;

public class AOPTest {
    public static void main(String[] args) {
          //        一种方法的xml
//        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");

          //四种方法的xml
//        ApplicationContext ac=new ClassPathXmlApplicationContext("beanFourMethod.xml");

        //环绕方法的xml
        ApplicationContext ac=new ClassPathXmlApplicationContext("beanAround.xml");

        IAccountService as=(IAccountService) ac.getBean("accountService");

        as.saveAccount();
        as.updateAccount(370);
        as.deleteAccount();
    }

}
