package Dao.impl;

import Dao.IAccountDao;
import domain.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * 其实我料想到了 之前调试的时候有一丝不严谨 可能正因为不是自己的思路 所以有些地方不明确就容易找不到问题所在
 * 解决方法：我把Account类里的第一个变量名 之前写成了AccountId 后来我猜想是因为和数据库中名字不匹配 导致提不出来 改成id后成功了。
 *
 * 我追溯其调用源头，结果问题出在这句话
 *             return runner.query("select * from account",new BeanListHandler<Account>(Account.class));
 *  总结：
 *  之前我一直在找后续程序中对AccountId变量的调用 一直没发现 原来隐藏在这里了 它用Account这个变量去数据库里进行对比的时候 没让我们输变量名
 *  肯定是默认用Account中的变量去匹配了。
 *
 */
@Repository("accountDao")
public class AccountDaoImpl implements IAccountDao {

    @Autowired
    private QueryRunner runner;

    public List<Account> findAllAccount() {
        try {
            return runner.query("select * from account",new BeanListHandler<Account>(Account.class));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Account findAccountById(Integer id) {
        try {
            return runner.query("select * from account where id=?",new BeanHandler<Account>(Account.class),id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void saveAccount(Account account) {
        try {
            runner.update("insert into account(name,money)values(?,?)",account.getName(),account.getMoney());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void updataAccount(Account account) {
        try {
            runner.update("update account set name=?,money=? where id=?",account.getName(),account.getMoney(),account.getId());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteAccount(Integer id) {
        try {
            runner.update("delete form account where id=?",id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
