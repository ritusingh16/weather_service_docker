package com.cybage.javademo.java.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.cybage.javademo.java.controller.SpringCloudWeatherApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringCloudWeatherApplication.class)
@WebAppConfiguration
public class SpringCloudWeatherApplicationTests {

	@Test
	public void contextLoads() {
	}

}
