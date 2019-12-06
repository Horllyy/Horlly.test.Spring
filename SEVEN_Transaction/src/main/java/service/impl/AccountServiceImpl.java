package service.impl;

import Dao.IAccountDao;
import domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.IAccountService;
import utils.TransactionManager;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public List<Account> findAllAccount() {
        return accountDao.findAllAccount();
    }

    public Account findAccountById(Integer accountId) {
        return accountDao.findAccountById(accountId);
    }

    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    public void updataAccount(Account account) {
        accountDao.updataAccount(account);
    }

    public void deleteAccount(Integer accountId) {
        accountDao.deleteAccount(accountId);
    }

    public void transfer(String sourceName, String targetName, Integer money) {
        System.out.println("Transfer开始执行");
            Account source=accountDao.findAccountByName(sourceName);
            Account target=accountDao.findAccountByName(targetName);

            source.setMoney(source.getMoney()-money);
            target.setMoney(target.getMoney()+money);

            accountDao.updataAccount(source);
//        int i=1/0;
            accountDao.updataAccount(target);
        System.out.println("Transfer执行结束");
    }


//        @Autowired
//    private TransactionManager txManager;
//
//    public void setTxManager(TransactionManager txManager) {
//        this.txManager = txManager;
//    }
//
//    public List<Account> findAllAccount() {
//        try {
//            txManager.beginTransaction();
//            List<Account> accounts=accountDao.findAllAccount();
//            txManager.commit();
//            return accounts;
//        }catch (Exception e)
//        {
//            txManager.rollback();
//            throw new RuntimeException(e);
//        }
//        finally {
//            txManager.release();
//        }
//    }
//
//    public Account findAccountById(Integer accountId) {
//        try {
//            txManager.beginTransaction();
//            Account account=accountDao.findAccountById(accountId);
//            txManager.commit();
//            return account;
//        }catch (Exception e)
//        {
//            txManager.rollback();
//            throw new RuntimeException(e);
//        }
//        finally {
//            txManager.release();
//        }
//    }
//
//    public void saveAccount(Account account) {
//        try {
//            txManager.beginTransaction();
//            accountDao.saveAccount(account);
//            txManager.commit();
//        }catch (Exception e)
//        {
//            txManager.rollback();
//            throw new RuntimeException(e);
//        }
//        finally {
//            txManager.release();
//        }
//    }
//
//    public void updataAccount(Account account) {
//        try {
//            txManager.beginTransaction();
//           accountDao.updataAccount(account);
//            txManager.commit();
//        }catch (Exception e)
//        {
//            txManager.rollback();
//            throw new RuntimeException(e);
//        }
//        finally {
//            txManager.release();
//        }
//    }
//
//    public void deleteAccount(Integer accountId) {
//        try {
//            txManager.beginTransaction();
//            accountDao.deleteAccount(accountId);
//            txManager.commit();
//        }catch (Exception e)
//        {
//            txManager.rollback();
//            throw new RuntimeException(e);
//        }
//        finally {
//            txManager.release();
//        }
//    }
//
//    public void transfer(String sourceName, String targetName, Integer money) {
//        try {
//            txManager.beginTransaction();
//            Account source=accountDao.findAccountByName(sourceName);
//            Account target=accountDao.findAccountByName(targetName);
//
//            source.setMoney(source.getMoney()-money);
//            target.setMoney(target.getMoney()+money);
//
//            accountDao.updataAccount(source);
////        int i=1/0;
//            accountDao.updataAccount(target);
//            txManager.commit();
//        }catch (Exception e)
//        {
//            txManager.rollback();
//            throw new RuntimeException(e);
//        }
//        finally {
//            txManager.release();
//        }
//    }
}
