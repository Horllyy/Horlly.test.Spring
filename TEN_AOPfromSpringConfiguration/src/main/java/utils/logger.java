package utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * 用于记录日志的工具类
 * 提供公共代码
 */

@Component("logger")
@Aspect
public class logger {

    @Pointcut("execution(* service.impl.*.*(..))")
    private void pt1(){

    }
//自动方式
//    @Before("pt1()")
//    public void beforePrintLog(){
//        System.out.println("前置logger的发布");
//    }
//
//    @AfterReturning("pt1()")
//    public void afterReturningPrintLog(){
//        System.out.println("afterReturning的发布");
//    }
//
//    @AfterThrowing("pt1()")
//    public void afterThrowingPrintLog(){
//        System.out.println("afterThrowing的发布");
//    }
//
//    @After("pt1()")
//    public void afterPrintLog(){
//        System.out.println("after的发布");
//    }
//

    //手动配置
   @Around("pt1()")
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
}

