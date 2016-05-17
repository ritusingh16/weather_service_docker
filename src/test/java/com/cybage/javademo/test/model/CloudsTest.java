/**
 * 
 */
package com.cybage.javademo.test.model;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cybage.javademo.java.model.Clouds;

/**
 * @author ritus
 *
 */
public class CloudsTest {
	private String all;
	

	/**
	 * Test method for {@link com.cybage.javademo.java.model.Clouds#getAll()}.
	 */
	Clouds clouds = new Clouds();
	
	@Test
	public final void testGetAll() {
		clouds.getAll();
	}

	/**
	 * Test method for {@link com.cybage.javademo.java.model.Clouds#setAll(java.lang.String)}.
	 */
	@Test
	public final void testSetAll() {
		clouds.setAll(all);
	}

}
