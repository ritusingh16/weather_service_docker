package com.cybage.javademo.java.controller;

import org.apache.catalina.filters.CorsFilter;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import com.cybage.javademo.java.model.Weather;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Controller
@EnableAutoConfiguration
// @CrossOrigin(origins = "http://localhost:9003")
public class WeatherApi{
	
	 // Define the log object for this class
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	  
	 
	// This method is call when service api having /wether/city name eg:(pune,mumabi,london)
	@RequestMapping(value = "/weather/{city}", method = RequestMethod.GET)
	@ResponseBody
	Weather getWeather(@PathVariable String city ) {
		
		RestTemplate restTemplate = new RestTemplate();
		String appid = "026bae7a696c12547b424cb730ff80e4" ;

		Weather weather = restTemplate.getForObject(
				"http://api.openweathermap.org/data/2.5/weather?q="+city+"&units=Metric"+"&appid="+appid, Weather.class);

		 // Log a simple message
		log.debug("inside getWeather debug level log");
	    log.info("inside getWeather info Log");
	    log.error("inside getWeather error level log");
	     // Log a formatted string with parameters
	    log.info("another info log with {}, {} and {} arguments", 1, "2", 3.0);
        return weather ;
		}
	
	
	
	
	/*@Bean
	public CorsFilter corsFilter() {
	    final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
	    final CorsConfiguration config = new CorsConfiguration();
	    config.setAllowCredentials(true);
	    config.addAllowedOrigin("*");
	    config.addAllowedHeader("*");
	    config.addAllowedMethod("OPTIONS");
	    config.addAllowedMethod("HEAD");
	    config.addAllowedMethod("GET");
	    config.addAllowedMethod("PUT");
	    config.addAllowedMethod("POST");
	    config.addAllowedMethod("DELETE");
	    config.addAllowedMethod("PATCH");
	    source.registerCorsConfiguration("/**", config);
	    return new CorsFilter();
	}*/
	
}


