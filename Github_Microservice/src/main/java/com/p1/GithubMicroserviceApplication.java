package com.p1;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class GithubMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubMicroserviceApplication.class, args);
	}

}
