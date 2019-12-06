package test;

import My.dao.AccountDao;
import My.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import java.io.InputStream;
import java.util.List;

public class testMybatis {

    @Test
    public void run() throws Exception {
       InputStream in= Resources.getResourceAsStream("SqlMapConfig.xml");
       SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(in);
       SqlSession sqlSession=factory.openSession();
       AccountDao accountDao=sqlSession.getMapper(AccountDao.class);

       List<Account> accountList=accountDao.findAll();
        for (Account account:accountList
             ) {
            System.out.println(account);
        }
       sqlSession.close();
       in.close();
    }

    @Test
    public void run1() throws Exception {
        InputStream in= Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession=factory.openSession();
        AccountDao accountDao=sqlSession.getMapper(AccountDao.class);

        Account account=new Account();
        account.setName("林辰");
        account.setMoney(18888d);

        accountDao.saveAccount(account);

        sqlSession.commit();
        sqlSession.close();
        in.close();
    }

}
