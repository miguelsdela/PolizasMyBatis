package com.babel.PolizaMyBatis;

import com.babel.Poliza.Poliza;
import com.babel.PolizaMyBatis.Persistencia.AppconfigImp;
import com.babel.Repository.PolizaRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class PolizaMyBatisApplication {

	public static void main(String[] args) throws SQLException {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppconfigImp.class);
		PolizaRepository polizaRepository = context.getBean(PolizaRepository.class);

		for(Poliza poliza : polizaRepository.selectPoliza()) {
			System.out.println(poliza.toString());
		}
		SpringApplication.run(PolizaMyBatisApplication.class, args);
	}

}
