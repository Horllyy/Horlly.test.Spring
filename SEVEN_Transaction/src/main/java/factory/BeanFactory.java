package factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import service.IAccountService;
import utils.TransactionManager;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@Component("beanFactory")
public class BeanFactory {
    @Autowired
    private IAccountService accountService;
    @Autowired
    private TransactionManager txManager;

    public void setTxManager(TransactionManager txManager) {
        this.txManager = txManager;
    }

    /**
     * 注意：final
     * 被代理类必须是final
     * @param accountService
     */
    public final void setAccountService(IAccountService accountService) {
        this.accountService = accountService;
    }

    /**
     * 获取service的代理对象
     * @return
     */
    public IAccountService getAccountService(){
        Proxy.newProxyInstance(accountService.getClass().getClassLoader(), accountService.getClass().getInterfaces(), new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object returnValue1=null;
                try {
                    txManager.beginTransaction();
                    returnValue1=method.invoke(accountService,args);
                    txManager.commit();
                    return returnValue1;
                }catch (Exception e)
                {
                    txManager.rollback();
                    throw new RuntimeException(e);
                }
                finally {
                    txManager.release();
                }
            }
        });
        return null;
    }

}
