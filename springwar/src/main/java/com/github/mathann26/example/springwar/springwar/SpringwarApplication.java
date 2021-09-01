package com.github.mathann26.example.springwar.springwar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringwarApplication extends SpringBootServletInitializer {


//	We need to override to deploy with Application server.
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpringwarApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringwarApplication.class, args);
	}

}
