package service;

public interface IAccountService {
    /**
     * 模拟保存账户
     * 无参数 无返回值
     */
    void saveAccount();

    /**
     * 模拟更新账户
     *
     * 无参数 有返回值
     * @param i
     */
    void updateAccount(int i);

    /**
     * 删除账户
     *
     * 有参数 有返回值
     * @return
     */
    int deleteAccount();
}
