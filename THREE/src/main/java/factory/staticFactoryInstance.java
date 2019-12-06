package factory;

import service.IAccountService;
import service.impl.AccountServiceImpl;

public class staticFactoryInstance {
    public static IAccountService getAccountService(){
        return new AccountServiceImpl();
    }
}
