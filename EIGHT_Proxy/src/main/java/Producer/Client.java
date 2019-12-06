package Producer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        //Producer.Producer 被代理的类
        final Producer producer=new Producer();

        /**
         * 动态代理特点：
         * 随用随加载
         *
         * 不修改源码的基础上 对方法进行增强
         *
         * 分类：1.基于接口的动态代理
         *           涉及的类：Procy ，被代理类至少实现一个接口！
         *        2.基于子类的动态代理
         *
         *
         */

       IProducer proxyProducer= (IProducer) Proxy.newProxyInstance(producer.getClass().getClassLoader(), producer.getClass().getInterfaces(),
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //提供增强的代码
                        Object returnValue=null;
                        Float money=(Float)args[0];
                        if ("saleProduct".equals(method.getName())){
                            returnValue=method.invoke(producer,money*0.8f);
                        }
                        return returnValue;
                    }
                });
       proxyProducer.saleProduct(10000f);//把原方法增强了 没有改动saleProduct原方法
    }
}
