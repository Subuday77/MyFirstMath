package com.mathGame.math;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MathApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run (MathApplication.class, args);
		System.out.println("Server started....................");
	}

}
