package com.babel.PolizaMyBatis.Persistencia;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import java.sql.*;

import javax.sql.DataSource;
@Configuration
@MapperScan("com.babel.Repository.PolizaRepository")
public class AppconfigImp {

    @Bean
    public DataSource dataSource() {
        SimpleDriverDataSource sdds = new SimpleDriverDataSource();
        try {
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        //sdds.setDriverClass(com.oracle.);
        sdds.setUrl("ojdb:oracle://ns3038689.ip-51-255-85.eu:1521");
        sdds.setSchema("POLIZAMANAGER");
        sdds.setUsername("sys");
        sdds.setPassword("rrF9D6Ds-P9*gp");
        return sdds;
    }


    @Bean
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean() throws Exception {
        SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource());
        return sessionFactoryBean;
    }
}
