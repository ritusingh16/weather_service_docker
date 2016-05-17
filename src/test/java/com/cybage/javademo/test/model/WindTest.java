/**
 * 
 */
package com.cybage.javademo.test.model;

import org.junit.Test;

import com.cybage.javademo.java.model.Wind;

/**
 * @author ritus
 *
 */
public class WindTest {
	
	private int speed;
	private int deg;

	Wind wind = new Wind();
	
	/**
	 * Test method for {@link com.cybage.javademo.java.model.Wind#setDeg(int)}.
	 */
	@Test
	public final void testSetDeg() {
		wind.setDeg(deg);
	}

	/**
	 * Test method for {@link com.cybage.javademo.java.model.Wind#setSpeed(int)}.
	 */
	@Test
	public final void testSetSpeed() {
		wind.setSpeed(speed);
	}

	/**
	 * Test method for {@link com.cybage.javademo.java.model.Wind#getDeg()}.
	 */
	@Test
	public final void testGetDeg() {
		wind.getDeg();
	}

	/**
	 * Test method for {@link com.cybage.javademo.java.model.Wind#getSpeed()}.
	 */
	@Test
	public final void testGetSpeed() {
		wind.getSpeed();
	}

}
