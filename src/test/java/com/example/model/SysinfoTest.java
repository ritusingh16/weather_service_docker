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
public class SysinfoTest {
	
	private int message;
	private String country;
	private int sunrise;
	private int sunset;
	
	Sysinfo sysinfo = new Sysinfo();
	

	/**
	 * Test method for {@link com.example.model.Sysinfo#setCountry(java.lang.String)}.
	 */
	@Test
	public final void testSetCountry() {
		sysinfo.setCountry(country);
	}

	/**
	 * Test method for {@link com.example.model.Sysinfo#setMessage(int)}.
	 */
	@Test
	public final void testSetMessage() {
		sysinfo.setMessage(message);
	}

	/**
	 * Test method for {@link com.example.model.Sysinfo#setSunrise(int)}.
	 */
	@Test
	public final void testSetSunrise() {
		sysinfo.setSunrise(sunrise);
	}

	/**
	 * Test method for {@link com.example.model.Sysinfo#setSunset(int)}.
	 */
	@Test
	public final void testSetSunset() {
		sysinfo.setSunset(sunset);
	}

	/**
	 * Test method for {@link com.example.model.Sysinfo#getCountry()}.
	 */
	@Test
	public final void testGetCountry() {
		sysinfo.getCountry();
	}

	/**
	 * Test method for {@link com.example.model.Sysinfo#getMessage()}.
	 */
	@Test
	public final void testGetMessage() {
		sysinfo.getMessage();
	}

	/**
	 * Test method for {@link com.example.model.Sysinfo#getSunrise()}.
	 */
	@Test
	public final void testGetSunrise() {
		sysinfo.getSunrise();
	}

	/**
	 * Test method for {@link com.example.model.Sysinfo#getSunset()}.
	 */
	@Test
	public final void testGetSunset() {
		sysinfo.getSunset();
	}

}
