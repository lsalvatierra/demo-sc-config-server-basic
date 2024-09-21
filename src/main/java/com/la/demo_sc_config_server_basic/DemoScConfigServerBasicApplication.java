package com.la.demo_sc_config_server_basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DemoScConfigServerBasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoScConfigServerBasicApplication.class, args);
	}

}
