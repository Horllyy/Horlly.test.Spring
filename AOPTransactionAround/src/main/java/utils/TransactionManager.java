package utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;


@Component("txManager")
@Aspect
public class TransactionManager {

    @Autowired
    private ConnectionUtils connectionUtils;

    @Pointcut("execution( * service.impl.*.*(..))")
    private void pt1(){};

    //@Before("pt1()")
    public void beginTransaction(){
        try {
            connectionUtils.getThreadConnection().setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //@AfterReturning("pt1()")
    public void commit(){
        try {
            connectionUtils.getThreadConnection().commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

   // @AfterThrowing("pt1()")
    public void rollback(){
        try {
            connectionUtils.getThreadConnection().rollback();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

   // @After("pt1()")
    public void release(){
        try {
            connectionUtils.getThreadConnection().close();//不是真正关闭了连接 只是关闭了 也就是连接还是存在的
            connectionUtils.removeConnection();//解绑连接(调用ConnectionUtils中的方法)
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Around("pt1()")
    public Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws SQLException {
        Object returnValue=null;
        try {
            Object[] args = proceedingJoinPoint.getArgs();
          this.beginTransaction();
            returnValue = proceedingJoinPoint.proceed(args);
           this.commit();
            return returnValue;
        }catch (Exception e) {
            this.rollback();
            e.printStackTrace();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        } finally {
            this.release();
        }
        return null;
    }
}
