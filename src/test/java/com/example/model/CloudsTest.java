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
public class CloudsTest {
	private String all;
	

	/**
	 * Test method for {@link com.example.model.Clouds#getAll()}.
	 */
	Clouds clouds = new Clouds();
	
	@Test
	public final void testGetAll() {
		clouds.getAll();
	}

	/**
	 * Test method for {@link com.example.model.Clouds#setAll(java.lang.String)}.
	 */
	@Test
	public final void testSetAll() {
		clouds.setAll(all);
	}

}
