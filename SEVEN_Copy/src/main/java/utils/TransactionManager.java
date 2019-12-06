package utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

@Component("txManager")
public class TransactionManager {

    @Autowired
    private ConnectionUtils connectionUtils;

//    public void setConnectionUtils(ConnectionUtils connectionUtils) {
//        this.connectionUtils = connectionUtils;
//    }

    public void beginTransaction(){
        try {
            connectionUtils.getThreadConnection().setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void commit(){
        try {
            connectionUtils.getThreadConnection().commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void rollback(){
        try {
            connectionUtils.getThreadConnection().rollback();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void release(){
        try {
            connectionUtils.getThreadConnection().close();//不是真正关闭了连接 只是关闭了 也就是连接还是存在的
            connectionUtils.removeConnection();//解绑连接(调用ConnectionUtils中的方法)
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
