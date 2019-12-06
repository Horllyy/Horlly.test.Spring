package service.impl;

import dao.impl.AccountDaoImpl;
import service.IAccountService;

public class AccountServiceImpl implements IAccountService {
    private AccountDaoImpl aDao;
    public void saveAccount() {
        System.out.println("这里是AccountServiceImpl的saveAccount方法");
        aDao.buildAccount();
    }
}
