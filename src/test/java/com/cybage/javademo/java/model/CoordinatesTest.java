/**
 * 
 */
package com.cybage.javademo.java.model;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cybage.javademo.java.model.Coordinates;

/**
 * @author ritus
 *
 */
public class CoordinatesTest {
	private int lon;
	private int lat;
	
	Coordinates coordinates = new Coordinates();

	/**
	 * Test method for {@link com.cybage.javademo.java.model.Coordinates#setLat(int)}.
	 */
	@Test
	public final void testSetLat() {
		coordinates.setLat(lat);
	}

	/**
	 * Test method for {@link com.cybage.javademo.java.model.Coordinates#getLat()}.
	 */
	@Test
	public final void testGetLat() {
		
		coordinates.getLat();
		
	}

	/**
	 * Test method for {@link com.cybage.javademo.java.model.Coordinates#setLon(int)}.
	 */
	@Test
	public final void testSetLon() {
		
		coordinates.setLon(lon);
		
	}

	/**
	 * Test method for {@link com.cybage.javademo.java.model.Coordinates#getLon()}.
	 */
	@Test
	public final void testGetLon() {
		coordinates.getLon();
	}

}
