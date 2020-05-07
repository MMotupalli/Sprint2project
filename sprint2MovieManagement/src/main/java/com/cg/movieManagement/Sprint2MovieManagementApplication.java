package com.cg.movieManagement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.movieManagement.web.MovieExceptionAdvice;

@SpringBootApplication
public class Sprint2MovieManagementApplication {
	
	static Logger logger =LoggerFactory.getLogger(MovieExceptionAdvice.class);

	public static void main(String[] args) {
		logger.debug("bootstraping the application");
		SpringApplication.run(Sprint2MovieManagementApplication.class, args);
	}

}
