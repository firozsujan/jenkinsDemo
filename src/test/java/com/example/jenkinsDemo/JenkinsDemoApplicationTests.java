package com.example.jenkinsDemo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class JenkinsDemoApplicationTests {

    static Logger logger = LoggerFactory.getLogger(JenkinsDemoApplicationTests.class);

    @Test
    void contextLoads() {
        logger.info("It's a test case.");
        assertTrue(true);
    }

}
