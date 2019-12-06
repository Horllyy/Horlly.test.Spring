package cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {

       final Producer producer=new Producer();
        /**
         * 子类代理：
         *
         * 涉及的类：Enhancer
         *
         * 注意：被代理的类不能是最终类final
         */

        Producer cglibProduer=(Producer)Enhancer.create(producer.getClass(), new MethodInterceptor() {
            public Object intercept(Object proxy, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                /**
                 * 上面这行public Object intercept（）方法的参数：
                 *      method:cglibProduer.saleProduct(10000);中被增强的方法
                 *      objects【】：cglibProduer.saleProduct(10000);传进来的参数 这里只传进来一个 所以只有objects[0]有意义
                 *      （在另一个基于接口的程序里 这个数组叫args【】 其实名字可以换 不是强制性的 格式一样就行）
                 *
                 */

                //提供增强的代码
                Object returnValue = null;
                Float money = (Float) objects[0];
                if ("saleProduct".equals(method.getName())) {
                    returnValue = method.invoke(producer, money * 0.8f);
                }
                return returnValue;
            }
        });
        cglibProduer.saleProduct(10000);
        }

}
