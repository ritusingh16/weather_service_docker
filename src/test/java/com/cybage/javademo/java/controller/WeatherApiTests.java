/**
 * 
 */
package com.cybage.javademo.java.controller;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

import com.cybage.javademo.java.controller.WeatherApi;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


public class WeatherApiTests {
		
		@Test
		public void testWeatherCityApi() throws Exception {
		WeatherApi controller = new WeatherApi();
		
		MockMvc mockMvc = standaloneSetup(controller).build();
		mockMvc.perform(get("/weather/pune")).andExpect(status().isOk());
		
	
		}	
}


