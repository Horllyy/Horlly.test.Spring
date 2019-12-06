package My.test;

import My.dao.AccountDao;
import My.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class TestMybatis {

    @Test
    public void run1() throws Exception {
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
    public void run2() throws Exception {
        InputStream in= Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession=factory.openSession();
        AccountDao accountDao=sqlSession.getMapper(AccountDao.class);

        Account account=new Account();
        account.setName("刑丛连");
        account.setMoney(18888d);

        accountDao.saveAccount(account);

        sqlSession.commit();
        sqlSession.close();
        in.close();
    }
}
