package factory;

import service.IAccountService;
import service.impl.AccountServiceImpl;

public class FactoryInstance {

    public IAccountService getAccountService(){
        return new AccountServiceImpl();
    }
}
