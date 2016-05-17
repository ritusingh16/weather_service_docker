package com.example.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;




@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class SpringCloudWeatherApplication  {

   // private static final Logger log = LoggerFactory.getLogger(SpringCloudWeatherApplication.class);
    
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudWeatherApplication.class, args);
	}
	
	
}
