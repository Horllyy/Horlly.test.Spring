import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.IAccountService;

/**
 * 通过结果可以很容易看出来
 * 手动写的环绕通知 四个通知顺序没有问题
 *
 * 而自动的 最终通知的位置会跑到前置通知后面 这没办法 你能记清楚的话可以忽略 因为本身功能实现是没有问题的
 * 但严谨来讲 要求很高的话可以使用手动的
 */
public class AOPTest {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        IAccountService as=(IAccountService) ac.getBean("accountService");

        as.saveAccount();
        as.updateAccount(370);
        as.deleteAccount();
    }

}
