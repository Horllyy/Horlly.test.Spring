package Dao;

import domain.Account;

import java.util.List;

public interface IAccountDao {
    //查询所有
    List<Account> findAllAccount();

    //查询一个
    Account findAccountById(Integer accountId);

    //存
    void saveAccount(Account account);

    //改S
    void updataAccount(Account account);

    //删
    void deleteAccount(Integer accountId);
}
