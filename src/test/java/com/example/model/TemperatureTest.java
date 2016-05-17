/**
 * 
 */
package com.example.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author ritus
 *
 */
public class TemperatureTest {
	
	
	private String temp;
	private String temp_min;
	private String humidity;
	
	Temperature tempurature = new Temperature();
	

	/**
	 * Test method for {@link com.example.model.Temperature#getTemp()}.
	 */
	@Test
	public final void testGetTemp() {
		tempurature.getTemp();
	}

	/**
	 * Test method for {@link com.example.model.Temperature#setTemp(java.lang.String)}.
	 */
	@Test
	public final void testSetTemp() {
		tempurature.setTemp(temp);
		
	}

	/**
	 * Test method for {@link com.example.model.Temperature#getTemp_min()}.
	 */
	@Test
	public final void testGetTemp_min() {
		tempurature.getTemp_min();
		
	}

	/**
	 * Test method for {@link com.example.model.Temperature#setTemp_min(java.lang.String)}.
	 */
	@Test
	public final void testSetTemp_min() {
		tempurature.setTemp_min(temp_min);
	}

	/**
	 * Test method for {@link com.example.model.Temperature#getHumidity()}.
	 */
	@Test
	public final void testGetHumidity() {
		tempurature.getHumidity();
	}

	/**
	 * Test method for {@link com.example.model.Temperature#setHumidity(java.lang.String)}.
	 */
	@Test
	public final void testSetHumidity() {
		
		tempurature.setHumidity(humidity);
	}

}
