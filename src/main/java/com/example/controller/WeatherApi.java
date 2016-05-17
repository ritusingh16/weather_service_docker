package com.example.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.model.Weather;


@Controller
@EnableAutoConfiguration

public class WeatherApi{
	
	/* 
	 * 
	 * Define the log object for this class
	*/
	
	  private final Logger log = LoggerFactory.getLogger(this.getClass());
	  
	  
	 /* 
	  * 
	  *  
	  *  This method is call when service api having /wether/city name eg:(pune,mumabi,london)
	*/
	  
	@RequestMapping(value = "/weather/{city}", method = RequestMethod.GET)
	@ResponseBody
	Weather getWeather(@PathVariable String city ) {
		
		
		RestTemplate restTemplate = new RestTemplate();
		//String city = "mumbai";
		String appid = "026bae7a696c12547b424cb730ff80e4" ;

		Weather weather = restTemplate.getForObject(
				"http://api.openweathermap.org/data/2.5/weather?q="+city+"&units=Metric"+"&appid="+appid, Weather.class);

		
		/*
		 * 
		 // Log a simple message
		  * 
		*/
		
	    log.debug("inside getWeather debug level log");
	    log.info("inside getWeather info Log");
	    log.error("inside getWeather error level log");
	    
	    
	   /* 
	    * 
	    * 
	    // Log a formatted string with parameters
	     * 
	     * 
	    */
	    
	    log.info("another info log with {}, {} and {} arguments", 1, "2", 3.0);
	    
		
        return weather ;
		}
	
	/**
	 * This method provides default weather of pune when any city name is not provided in rest api
	 * @return
	 */
	
	@RequestMapping("/weather")
	@ResponseBody
	Weather getWeather() {
		String city = "Pune";
		RestTemplate restTemplate = new RestTemplate();
		String appid = "114bf9893b22bb6e630a1e5dad2e7ad5" ;
		System.out.println(" restTemplate :::" + restTemplate);
		Weather weather = restTemplate.getForObject(
				"http://api.openweathermap.org/data/2.5/weather?q="+city+"&appid="+appid, Weather.class);
		return weather;
	}
    
	
/*private Weather getStubWeatherData(String city){
		String mockFile = "/data/weather_"+city.toLowerCase()+".json";
		ObjectMapper objectMapper = new ObjectMapper();
		Weather weather = null;
		try {
			InputStream stream = getClass().getResourceAsStream(mockFile);
			weather = objectMapper.readValue(stream, Weather.class);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return weather;
	}*/

}


