package com.babel.PolizaMyBatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class PolizaMyBatisApplication {

	public static void main(String[] args) throws SQLException {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conexion = DriverManager.getConnection("jdbc:oracle:thin@ns3038689.ip-51-255-85.eu:ORCLCDB","sys","rrF9D6Ds-P9*gp");

		} catch (SQLException | ClassNotFoundException e){
			System.out.println("Error en la conexión en la bbdd");
		}
		SpringApplication.run(PolizaMyBatisApplication.class, args);
	}

}
