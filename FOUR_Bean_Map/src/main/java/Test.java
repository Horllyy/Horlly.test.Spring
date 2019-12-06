import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class Test {
    public static void main(String[] args) {
        //加载applicationContext.xml
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        //获取实例
        Manager manger=(Manager) context.getBean("manager");
        //调用方法
        Map<String,User> userMap=manger.getUserMap();

        for (Map.Entry<String,User> user:userMap.entrySet()
             ) {
            String key=user.getKey();
            User value=user.getValue();
            System.out.println("key="+key+"  userName="+value.getUsername()+"  userPassword="+value.getPassword());
        }
//        Iterator it=userMap.keySet().iterator();
//        while(it.hasNext()){
//            String key=(String)it.next();
//            User user=userMap.get(key);
//            System.out.println(user.getUsername()+","+user.getPassword());
//        }
    }
}
