package com.meva.finance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableFeignClients
@ComponentScan(basePackages = "com.meva.finance")
public class CostApplication {

	public static void main(String[] args) {
		SpringApplication.run(CostApplication.class, args);
	}



}
