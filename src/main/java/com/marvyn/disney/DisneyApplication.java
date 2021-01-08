package com.marvyn.disney;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DisneyApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DisneyApplication.class, args);
	}

}
