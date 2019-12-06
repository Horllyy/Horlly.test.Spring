package service.impl;

import dao.IAccountDao;
import dao.impl.AccountDaoImpl;
import domain.Account;
import service.IAccountService;

import java.util.List;

public class AccountServiceImpl implements IAccountService {

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
        System.out.println(sourceName);
        System.out.println(targetName);
        System.out.println(accountDao);

        Account source=accountDao.findAccountByName(sourceName);
        Account target=accountDao.findAccountByName(targetName);

        source.setMoney(source.getMoney()-money);
        target.setMoney(target.getMoney()+money);

        accountDao.updataAccount(source);
//        int i=1/0;
        accountDao.updataAccount(target);
        System.out.println("Transfer执行结束");
    }
}
