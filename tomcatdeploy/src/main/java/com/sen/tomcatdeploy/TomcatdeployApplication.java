package com.sen.tomcatdeploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class TomcatdeployApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(TomcatdeployApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(TomcatdeployApplication.class);
	}
}
