package service.impl;

import Dao.IAccountDao;
import domain.Account;
import service.IAccountService;

public class AccountService implements IAccountService {

    private IAccountDao accountDao;

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public Account findAccountById(Integer accountId) {
        return accountDao.findAccountById(accountId);
    }

    public void transfer(String sourceName, String targetName, Integer money) {
        System.out.println("转账开始");
        Account source=accountDao.findAccoutByName(sourceName);
        Account target=accountDao.findAccoutByName(targetName);
        source.setMoney(source.getMoney()-money);
        target.setMoney(target.getMoney()+money);
        accountDao.UpdateAccount(source);
        int i=1/0;
        accountDao.UpdateAccount(target);
        System.out.println("转账结束");
    }
}
