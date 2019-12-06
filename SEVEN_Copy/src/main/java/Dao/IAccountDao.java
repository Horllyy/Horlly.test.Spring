package Dao;


import domain.Account;

import java.util.List;

public interface IAccountDao {
    //查询所有
    List<Account> findAllAccount();

    //查询一个
    Account findAccountById(Integer accountId);

    //增
    void saveAccount(Account account);

    //改
    void updataAccount(Account account);

    //删
    void deleteAccount(Integer accountId);

    //根据名称查账户
    Account findAccountByName(String accountName);
}
