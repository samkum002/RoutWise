package com.project.RoutWise;

import org.springframework.boot.SpringApplication;

public class TestRoutWiseApplication {

	public static void main(String[] args) {
		SpringApplication.from(RoutWiseApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
