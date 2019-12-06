package service.impl;

import Dao.IAccountDao;
import domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.IAccountService;

@Service("accountService")
@Transactional
public class AccountService implements IAccountService {

    @Autowired
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
//        int i=1/0;
        accountDao.UpdateAccount(target);
        System.out.println("转账结束");
    }
}
