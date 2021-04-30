package com.config;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.Properties;

//引入jdbc文件
@PropertySource("classpath:Link_Mybatis.properties")
//扫描（com）包下的注解
@ComponentScan("com")
//声明这是一个配置类
@Configuration
public class JdbcConfiguration {
//    给连接参数赋值
    @Value("${jdbc.Driver}")
    private String driverClassName;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.user}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    public JdbcTemplate getjdbcTemplate(){
        JdbcTemplate jdbcTemplate= null;

        Properties properties = new Properties();

        properties.setProperty("url",url);

        properties.setProperty("driverClassName",driverClassName);

        properties.setProperty("username",username);

        properties.setProperty("password",password);

        try {
            DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);

            jdbcTemplate = new JdbcTemplate(dataSource);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return jdbcTemplate;
    }
}
