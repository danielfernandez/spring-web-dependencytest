package io.github.danielfernandez.dependencytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringWebDependencytestApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringWebDependencytestApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringWebDependencytestApplication.class, args);
	}

}
