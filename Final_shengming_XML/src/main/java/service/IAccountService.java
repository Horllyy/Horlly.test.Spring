package service;

import domain.Account;

public interface IAccountService {

    Account findAccountById(Integer accountId);

    void transfer(String sourceName,String targetName,Integer money);
}
