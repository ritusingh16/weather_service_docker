/**
 * 
 */
package com.cybage.javademo.java.model;

import org.junit.Test;

import com.cybage.javademo.java.model.Status;

/**
 * @author ritus
 *
 */


public class StatusTest {

	private String id;
	private String main;
	private String description;
	private String icon;
	
	Status status = new Status();
	
	/**
	 * Test method for {@link com.cybage.javademo.java.model.Status#setIcon(java.lang.String)}.
	 */
	@Test
	public final void testSetIcon() {
	  status.setIcon(icon);
	}

	/**
	 * Test method for {@link com.cybage.javademo.java.model.Status#setId(java.lang.String)}.
	 */
	@Test
	public final void testSetId() {
    status.setId(id);
	}

	/**
	 * Test method for {@link com.cybage.javademo.java.model.Status#getIcon()}.
	 */
	@Test
	public final void testGetIcon() {
		
		status.getIcon();
	}

	/**
	 * Test method for {@link com.cybage.javademo.java.model.Status#getId()}.
	 */
	@Test
	public final void testGetId() {
		status.getId();
	}

	/**
	 * Test method for {@link com.cybage.javademo.java.model.Status#getDescription()}.
	 */
	@Test
	public final void testGetDescription() {
		status.getDescription();
		
	}

	/**
	 * Test method for {@link com.cybage.javademo.java.model.Status#setMain(java.lang.String)}.
	 */
	@Test
	public final void testSetMain() {
		status.setMain(main);
		
	}

	/**
	 * Test method for {@link com.cybage.javademo.java.model.Status#getMain()}.
	 */
	@Test
	public final void testGetMain() {
	   status.getMain();
	}

	/**
	 * Test method for {@link com.cybage.javademo.java.model.Status#setDescription(java.lang.String)}.
	 */
	@Test
	public final void testSetDescription() {
		status.setDescription(description);
	}

}
