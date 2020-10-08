package com.rest.RestControllerExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestControllerExampleApplication {

	public static void main(String[] args) {
		
        SpringApplication.run(RestControllerExampleApplication.class, args);
        
	}

}
