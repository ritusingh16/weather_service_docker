/**
 * 
 */
package com.cybage.javademo.test.model;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cybage.javademo.java.model.Clouds;
import com.cybage.javademo.java.model.Coordinates;
import com.cybage.javademo.java.model.Status;
import com.cybage.javademo.java.model.Sysinfo;
import com.cybage.javademo.java.model.Temperature;
import com.cybage.javademo.java.model.Weather;
import com.cybage.javademo.java.model.Wind;

/**
 * @author ritus
 *
 */
public class WeatherTest {
	
	Weather weathers = new Weather();
	public Coordinates coord;
	public Status[] weather;
	private String base;
	private Temperature main;
	private Wind wind;
	private Clouds clouds;
	private String dt;
	private Sysinfo sys;
	private String id;
	private String name;
	private String cod;
	

	/**
	 * Test method for {@link com.cybage.javademo.java.model.Weather#setBase(java.lang.String)}.
	 */
	@Test
	public final void testSetBase() {
		weathers.setBase(base);
	}

	/**
	 * Test method for {@link com.cybage.javademo.java.model.Weather#setClouds(com.cybage.javademo.java.model.Clouds)}.
	 */
	@Test
	public final void testSetClouds() {
		weathers.setClouds(clouds);
	}

	/**
	 * Test method for {@link com.cybage.javademo.java.model.Weather#setCod(java.lang.String)}.
	 */
	@Test
	public final void testSetCod() {
		weathers.setCod(cod);
	}

	/**
	 * Test method for {@link com.cybage.javademo.java.model.Weather#setCoord(com.cybage.javademo.java.model.Coordinates)}.
	 */
	@Test
	public final void testSetCoord() {
		weathers.setCoord(coord);
	}

	/**
	 * Test method for {@link com.cybage.javademo.java.model.Weather#setSys(com.cybage.javademo.java.model.Sysinfo)}.
	 */
	@Test
	public final void testSetSys() {
		weathers.setSys(sys);
	}

	/**
	 * Test method for {@link com.cybage.javademo.java.model.Weather#setWind(com.cybage.javademo.java.model.Wind)}.
	 */
	@Test
	public final void testSetWind() {
		weathers.setWind(wind);
	}

	/**
	 * Test method for {@link com.cybage.javademo.java.model.Weather#getBase()}.
	 */
	@Test
	public final void testGetBase() {
		weathers.getBase();
	}

	/**
	 * Test method for {@link com.cybage.javademo.java.model.Weather#getClouds()}.
	 */
	@Test
	public final void testGetClouds() {
		weathers.getClouds();
	}

	/**
	 * Test method for {@link com.cybage.javademo.java.model.Weather#getCod()}.
	 */
	@Test
	public final void testGetCod() {
		weathers.getCod();
	}

	/**
	 * Test method for {@link com.cybage.javademo.java.model.Weather#getCoord()}.
	 */
	@Test
	public final void testGetCoord() {
		weathers.getCoord();
	}

	/**
	 * Test method for {@link com.cybage.javademo.java.model.Weather#getSys()}.
	 */
	@Test
	public final void testGetSys() {
		weathers.getSys();
	}

	/**
	 * Test method for {@link com.cybage.javademo.java.model.Weather#getWind()}.
	 */
	@Test
	public final void testGetWind() {
		weathers.getWind();
	}

	/**
	 * Test method for {@link com.cybage.javademo.java.model.Weather#setWeather(com.cybage.javademo.java.model.Status[])}.
	 */
	@Test
	public final void testSetWeather() {
		weathers.setWeather(weather);
	}

	/**
	 * Test method for {@link com.cybage.javademo.java.model.Weather#getWeather()}.
	 */
	@Test
	public final void testGetWeather() {
		
	}

	/**
	 * Test method for {@link com.cybage.javademo.java.model.Weather#getMain()}.
	 */
	@Test
	public final void testGetMain() {
		weathers.getMain();
	}

	/**
	 * Test method for {@link com.cybage.javademo.java.model.Weather#setMain(com.cybage.javademo.java.model.Temperature)}.
	 */
	@Test
	public final void testSetMain() {
		weathers.setMain(main);
	}

	/**
	 * Test method for {@link com.cybage.javademo.java.model.Weather#getDt()}.
	 */
	@Test
	public final void testGetDt() {
		weathers.getDt();
	}

	/**
	 * Test method for {@link com.cybage.javademo.java.model.Weather#setDt(java.lang.String)}.
	 */
	@Test
	public final void testSetDt() {
		weathers.setDt(dt);
	}

	/**
	 * Test method for {@link com.cybage.javademo.java.model.Weather#getId()}.
	 */
	@Test
	public final void testGetId() {
		weathers.getId();
	}

	/**
	 * Test method for {@link com.cybage.javademo.java.model.Weather#setId(java.lang.String)}.
	 */
	@Test
	public final void testSetId() {
		weathers.setId(id);
	}

	/**
	 * Test method for {@link com.cybage.javademo.java.model.Weather#getName()}.
	 */
	@Test
	public final void testGetName() {
		weathers.getName();
	}

	/**
	 * Test method for {@link com.cybage.javademo.java.model.Weather#setName(java.lang.String)}.
	 */
	@Test
	public final void testSetName() {
		weathers.setName(name);
	}

}
