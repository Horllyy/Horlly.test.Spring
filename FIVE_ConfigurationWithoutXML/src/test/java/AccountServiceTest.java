import config.SpringConfiguration;
import domain.Account;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.IAccountService;

import java.util.List;

public class AccountServiceTest {
    @Test
  public void testFindAll(){
        ApplicationContext ac=new AnnotationConfigApplicationContext(SpringConfiguration.class);
      IAccountService as=ac.getBean("accountService", IAccountService.class);
      List<Account> accounts=as.findAllAccount();
      for (Account account:accounts
           ) {
          System.out.println(account);
      }
  }

    @Test
    public void testFindAccountById(){
        ApplicationContext ac=new AnnotationConfigApplicationContext(SpringConfiguration.class);
        IAccountService as=ac.getBean("accountService", IAccountService.class);
       Account account=as.findAccountById(1);
            System.out.println(account);

    }

    @Test
    public void testUpdate(){
        ApplicationContext ac=new AnnotationConfigApplicationContext(SpringConfiguration.class);
        IAccountService as=ac.getBean("accountService", IAccountService.class);
        Account account=new Account();
        account.setId(2);
        account.setName("Betty");
        account.setMoney(110);
        as.updataAccount(account);
    }

    @Test
    public void testSave(){
        Account account=new Account();
        account.setName("Horlly");
        account.setMoney(1999);

        ApplicationContext ac=new AnnotationConfigApplicationContext(SpringConfiguration.class);
        IAccountService as=ac.getBean("accountService", IAccountService.class);
        as.saveAccount(account);
    }
}
