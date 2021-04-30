package com.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.Properties;
//引入Link_Mybaits.properties文件
@PropertySource("classpath:Link_Mybaits.properties")
//声明这是一个配置类
@Configuration
//扫描包下的注解
@ComponentScan("com")
public class JdbcConfiguration {
    @Value("${jdbc.Driver}")
    private String DriverClassName;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.user}")
    private String username;
    @Value("${jdbc.password}")
    private String password;


    @Bean(name="jdbcTemplate")
    public JdbcTemplate getJdbcTemplate(){
        JdbcTemplate jdbcTemplate= null;
        Properties properties = new Properties();
        properties.setProperty("DriverClassName",DriverClassName);
        properties.setProperty("url",url);
        properties.setProperty("username",username);
        properties.setProperty("password",password);

        try {
            // 使用Properties对象创建Druid连接池数据源
            DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
            // 通过数据源对象获取JdbcTemplate
            jdbcTemplate = new JdbcTemplate(dataSource);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return jdbcTemplate;
    }
}
