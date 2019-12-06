package fourMethods.utils;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 用于记录日志的工具类
 * 提供公共代码
 */

public class logger {

    //简单理解环绕通知它就是一个顶下面四个方法 懂？
    public Object aroundPrintLog(ProceedingJoinPoint pjp){
        Object returnValue=null;
        try {
            Object[] args=pjp.getArgs();
            System.out.println("aroundPrint 前置通知的发布");
            returnValue=pjp.proceed(args);
            System.out.println("aroundPrint 后置通知的发布");
            return returnValue;
        } catch (Throwable throwable) {
            System.out.println("aroundPrint 异常通知的发布");
            throwable.printStackTrace();
        }
        finally {
            System.out.println("aroundPrint 最终通知的发布");
        }
        return null;
    }

    public void beforePrintLog(){
        System.out.println("前置logger的发布");
    }

    public void afterReturningPrintLog(){
        System.out.println("afterReturning的发布");
    }

    public void afterThrowingPrintLog(){
        System.out.println("afterThrowing的发布");
    }

    public void afterPrintLog(){
        System.out.println("after的发布");
    }

}
