package com.example.jenkins.jenkins;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JenkinsApplicationTests {


	public static Logger logger= LoggerFactory.getLogger(JenkinsApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("Testcase executing....");
		assertEquals(true,true);

	}

}
