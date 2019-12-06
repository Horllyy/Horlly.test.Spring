package Dao;

import domain.Account;

public interface IAccountDao {

    Account findAccountById(Integer accountId);

    Account findAccoutByName(String accountName);

    void UpdateAccount(Account account);
}
