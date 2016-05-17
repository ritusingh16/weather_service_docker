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
public class CoordinatesTest {
	private int lon;
	private int lat;
	
	Coordinates coordinates = new Coordinates();

	/**
	 * Test method for {@link com.example.model.Coordinates#setLat(int)}.
	 */
	@Test
	public final void testSetLat() {
		coordinates.setLat(lat);
	}

	/**
	 * Test method for {@link com.example.model.Coordinates#getLat()}.
	 */
	@Test
	public final void testGetLat() {
		
		coordinates.getLat();
		
	}

	/**
	 * Test method for {@link com.example.model.Coordinates#setLon(int)}.
	 */
	@Test
	public final void testSetLon() {
		
		coordinates.setLon(lon);
		
	}

	/**
	 * Test method for {@link com.example.model.Coordinates#getLon()}.
	 */
	@Test
	public final void testGetLon() {
		coordinates.getLon();
	}

}
