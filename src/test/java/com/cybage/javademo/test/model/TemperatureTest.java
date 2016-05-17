/**
 * 
 */
package com.cybage.javademo.test.model;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cybage.javademo.java.model.Temperature;

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
	 * Test method for {@link com.cybage.javademo.java.model.Temperature#getTemp()}.
	 */
	@Test
	public final void testGetTemp() {
		tempurature.getTemp();
	}

	/**
	 * Test method for {@link com.cybage.javademo.java.model.Temperature#setTemp(java.lang.String)}.
	 */
	@Test
	public final void testSetTemp() {
		tempurature.setTemp(temp);
		
	}

	/**
	 * Test method for {@link com.cybage.javademo.java.model.Temperature#getTemp_min()}.
	 */
	@Test
	public final void testGetTemp_min() {
		tempurature.getTemp_min();
		
	}

	/**
	 * Test method for {@link com.cybage.javademo.java.model.Temperature#setTemp_min(java.lang.String)}.
	 */
	@Test
	public final void testSetTemp_min() {
		tempurature.setTemp_min(temp_min);
	}

	/**
	 * Test method for {@link com.cybage.javademo.java.model.Temperature#getHumidity()}.
	 */
	@Test
	public final void testGetHumidity() {
		tempurature.getHumidity();
	}

	/**
	 * Test method for {@link com.cybage.javademo.java.model.Temperature#setHumidity(java.lang.String)}.
	 */
	@Test
	public final void testSetHumidity() {
		
		tempurature.setHumidity(humidity);
	}

}
