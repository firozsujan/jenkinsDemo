package com.example.jenkinsDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsDemoApplication {

    static Logger logger = LoggerFactory.getLogger(JenkinsDemoApplication.class);

    public static void main(String[] args) {
        logger.info("This is a running job");
        SpringApplication.run(JenkinsDemoApplication.class, args);
    }

}
