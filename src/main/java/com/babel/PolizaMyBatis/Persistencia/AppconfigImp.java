package com.babel.PolizaMyBatis.Persistencia;

import com.babel.PolizaMyBatis.AppConfig;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;
@Configuration
public class AppconfigImp implements AppConfig {
    @Override
    public DataSource dataSource() {
        SimpleDriverDataSource sdds = new SimpleDriverDataSource();

        sdds.setUrl("ojdb:oracle://ns3038689.ip-51-255-85.eu:1521");
        sdds.setSchema("POLIZAMANAGER");
        sdds.setUsername("sys");
        sdds.setPassword("rrF9D6Ds-P9*gp");
        return sdds;
    }

    @Override
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }

    @Override
    public SqlSessionFactoryBean sqlSessionFactoryBean() throws Exception {
        SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource());
        return sessionFactoryBean;
    }
}
