/**
 * 
 */
package com.example.controller;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

import com.example.controller.WeatherApi;;
/**
 * @author ritus
 *
 */
public class WeatherApiTests {
	
		@Test
		public void testHomePage() throws Exception {
		WeatherApi controller = new WeatherApi();
		
		MockMvc mockMvc = standaloneSetup(controller).build();
		//mockMvc.perform(get("/weather/{city}")).andExpect(view().name("weather"));
		
	
		}

		

		
		}


