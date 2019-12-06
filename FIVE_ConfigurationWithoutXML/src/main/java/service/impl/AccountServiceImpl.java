package service.impl;

import Dao.IAccountDao;
import domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.IAccountService;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    /**
     * 上面不用定义IAccountDaoImpl类的对象而可以直接定义IAccountDao接口的对象的原因在于Autowired这个注释
     * 它会根据implements去找是否有实现此接口的唯一类 如有 自动创建此类对象 若多个实现此接口的类 则取于自定义对象名同名那个 若无 报错
     * @return
     */

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
}
