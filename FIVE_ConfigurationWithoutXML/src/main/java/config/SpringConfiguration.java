package config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

@Configuration
@ComponentScans({@ComponentScan("service"),@ComponentScan("Dao.impl")})
//或 @ComponentScan({"service","Dao"}) 对 Scans是指多个scan 其实scan它自己本身就可以扫描多个包内的bean
public class SpringConfiguration {

    @Bean(name ="runner")
    @Scope("prototype")//Configuration里默认创建的bean对象是单例模式 只有这样特别设置一下 它才会变成多例模式
    public QueryRunner createQueryRunner(DataSource dataSource){
        return new QueryRunner(dataSource);
    }

    @Bean(name = "dataSource")
    public DataSource createDataSource(){
        try {
            ComboPooledDataSource ds = new ComboPooledDataSource();
            ds.setDriverClass("com.mysql.jdbc.Driver");
            ds.setJdbcUrl("jdbc:mysql://localhost:3306/easy");
            ds.setUser("root");
            ds.setPassword("123456");
            return ds;
        }catch (Exception e){
           throw  new RuntimeException(e);
        }
    }
}
