/**
 * 
 */
package com.example.model;

import org.junit.Test;

/**
 * @author ritus
 *
 */
public class WindTest {
	
	private int speed;
	private int deg;

	Wind wind = new Wind();
	
	/**
	 * Test method for {@link com.example.model.Wind#setDeg(int)}.
	 */
	@Test
	public final void testSetDeg() {
		wind.setDeg(deg);
	}

	/**
	 * Test method for {@link com.example.model.Wind#setSpeed(int)}.
	 */
	@Test
	public final void testSetSpeed() {
		wind.setSpeed(speed);
	}

	/**
	 * Test method for {@link com.example.model.Wind#getDeg()}.
	 */
	@Test
	public final void testGetDeg() {
		wind.getDeg();
	}

	/**
	 * Test method for {@link com.example.model.Wind#getSpeed()}.
	 */
	@Test
	public final void testGetSpeed() {
		wind.getSpeed();
	}

}
