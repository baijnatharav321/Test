package com.mindtree.eurekademoserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekademoserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekademoserverApplication.class, args);
	}

}
