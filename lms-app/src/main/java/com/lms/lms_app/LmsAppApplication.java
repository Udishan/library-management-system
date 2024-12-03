package com.lms.lms_app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LmsAppApplication {

	private static final Logger logger = LoggerFactory.getLogger(LmsAppApplication.class);

	public static void main(String[] args) {
		logger.info("LMS App Application Started");
		SpringApplication.run(LmsAppApplication.class, args);
	}

}
