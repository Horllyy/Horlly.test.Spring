package dao.impl;

import dao.IAccountDao;
import domain.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import utils.ConnectionUtils;
import java.util.List;


public class AccountDaoImpl implements IAccountDao {

    @Autowired
    private QueryRunner runner;
    private ConnectionUtils connectionUtils;

    public void setConnectionUtils(ConnectionUtils connectionUtils) {
        this.connectionUtils = connectionUtils;
    }

    public List<Account> findAllAccount() {
        try {
            return runner.query(connectionUtils.getThreadConnection(),"select * from account",new BeanListHandler<Account>(Account.class));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Account findAccountById(Integer id) {
        try {
            return runner.query(connectionUtils.getThreadConnection(),"select * from account where id=?",new BeanHandler<Account>(Account.class),id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void saveAccount(Account account) {
        try {
            runner.update(connectionUtils.getThreadConnection(),"insert into account(name,money)values(?,?)",account.getName(),account.getMoney());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void updataAccount(Account account) {
        try {
            runner.update(connectionUtils.getThreadConnection(),"update account set name=?,money=? where id=?",account.getName(),account.getMoney(),account.getId());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteAccount(Integer id) {
        try {
            runner.update(connectionUtils.getThreadConnection(),"delete form account where id=?",id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Account findAccountByName(String accountName) {
        System.out.println(accountName);
        try {
            List<Account> accounts=runner.query(connectionUtils.getThreadConnection(),"select * from account where name=?",new BeanListHandler<Account>(Account.class),accountName);
            if(accounts==null|| accounts.size()==0){
                return null;
            }
            if(accounts.size()>1)
            {
                throw new RuntimeException("结果集不唯一，数据有错误");
            }
            return accounts.get(0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
