package jdbcTemplate;

import Dao.IAccountDao;
import domain.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class jdbcTemplate {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        IAccountDao ad=ac.getBean("accountDao",IAccountDao.class);

//        Account account=ad.findAccountById(1);
//        System.out.println(account);
//        Account account2=ad.findAccoutByName("Betty");
//        System.out.println(account2);

        Account account3=new Account();
        account3.setName("Tony");
        account3.setMoney(222);
        account3.setId(5);
        ad.UpdateAccount(account3);
    }
}
