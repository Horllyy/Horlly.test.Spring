package service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Dao.IAccountDao;
import domain.Account;
import service.IAccountService;
import java.util.List;
import utils.TransactionManager;

@Service("accountService")
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;
    @Autowired
    private TransactionManager txManager;

//    public void setTxManager(TransactionManager txManager) {
//        this.txManager = txManager;
//    }

    public List<Account> findAllAccount() {
        try {
            txManager.beginTransaction();
            List<Account> accounts=accountDao.findAllAccount();
            txManager.commit();
            return accounts;
        }catch (Exception e)
        {
            txManager.rollback();
            throw new RuntimeException(e);
        }
        finally {
            txManager.release();
        }
    }

    public Account findAccountById(Integer id) {
        try {
            txManager.beginTransaction();
            Account account=accountDao.findAccountById(id);
            txManager.commit();
            return account;
        }catch (Exception e)
        {
            txManager.rollback();
            throw new RuntimeException(e);
        }
        finally {
            txManager.release();
        }
    }

    public void saveAccount(Account account) {
        try {
            txManager.beginTransaction();
            accountDao.saveAccount(account);
            txManager.commit();
        }catch (Exception e)
        {
            txManager.rollback();
            throw new RuntimeException(e);
        }
        finally {
            txManager.release();
        }
    }

    public void updataAccount(Account account) {
        try {
            txManager.beginTransaction();
           accountDao.updataAccount(account);
            txManager.commit();
        }catch (Exception e)
        {
            txManager.rollback();
            throw new RuntimeException(e);
        }
        finally {
            txManager.release();
        }
    }

    public void deleteAccount(Integer id) {
        try {
            txManager.beginTransaction();
            accountDao.deleteAccount(id);
            txManager.commit();
        }catch (Exception e)
        {
            txManager.rollback();
            throw new RuntimeException(e);
        }
        finally {
            txManager.release();
        }
    }

    public void transfer(String sourceName, String targetName, Integer money) {
        try {
            txManager.beginTransaction();
            Account source=accountDao.findAccountByName(sourceName);
            Account target=accountDao.findAccountByName(targetName);

            source.setMoney(source.getMoney()-money);
            target.setMoney(target.getMoney()+money);

            accountDao.updataAccount(source);
//        int i=1/0;
            accountDao.updataAccount(target);
            txManager.commit();
        }catch (Exception e)
        {
            txManager.rollback();
            throw new RuntimeException(e);
        }
        finally {
            txManager.release();
        }
    }
}
