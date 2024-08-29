package com.example.jenkinsDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsDemoApplication implements CommandLineRunner {
	public static final Logger logger = LoggerFactory.getLogger(JenkinsDemoApplication.class);
	@Override
	public void run(String... args) throws Exception {
		logger.info("It is second logger");
		logger.info("Continuous Integration Test ");
		logger.info("Added logger by RAHUL !!");
	}

	public static void main(String[] args) {
		SpringApplication.run(JenkinsDemoApplication.class, args);
	}

}
