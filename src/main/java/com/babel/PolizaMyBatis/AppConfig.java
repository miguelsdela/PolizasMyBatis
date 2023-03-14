package com.babel.PolizaMyBatis;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

public interface AppConfig {

    public DataSource dataSource();
    public DataSourceTransactionManager transactionManager();
    public SqlSessionFactoryBean sqlSessionFactoryBean() throws Exception;
}
