package com.example.ZookeeperConfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ZookeeperConfigApplication {
	public static void main(String[] args) {
		SpringApplication.run(ZookeeperConfigApplication.class, args);
	}

}
