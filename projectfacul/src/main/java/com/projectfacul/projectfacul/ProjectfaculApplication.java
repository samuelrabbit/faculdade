package com.projectfacul.projectfacul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"my.examples.models"})
public class ProjectfaculApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectfaculApplication.class, args);
	}

}
