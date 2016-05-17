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
	 * Test method for {@link com.example.model.Weather#setBase(java.lang.String)}.
	 */
	@Test
	public final void testSetBase() {
		weathers.setBase(base);
	}

	/**
	 * Test method for {@link com.example.model.Weather#setClouds(com.example.model.Clouds)}.
	 */
	@Test
	public final void testSetClouds() {
		weathers.setClouds(clouds);
	}

	/**
	 * Test method for {@link com.example.model.Weather#setCod(java.lang.String)}.
	 */
	@Test
	public final void testSetCod() {
		weathers.setCod(cod);
	}

	/**
	 * Test method for {@link com.example.model.Weather#setCoord(com.example.model.Coordinates)}.
	 */
	@Test
	public final void testSetCoord() {
		weathers.setCoord(coord);
	}

	/**
	 * Test method for {@link com.example.model.Weather#setSys(com.example.model.Sysinfo)}.
	 */
	@Test
	public final void testSetSys() {
		weathers.setSys(sys);
	}

	/**
	 * Test method for {@link com.example.model.Weather#setWind(com.example.model.Wind)}.
	 */
	@Test
	public final void testSetWind() {
		weathers.setWind(wind);
	}

	/**
	 * Test method for {@link com.example.model.Weather#getBase()}.
	 */
	@Test
	public final void testGetBase() {
		weathers.getBase();
	}

	/**
	 * Test method for {@link com.example.model.Weather#getClouds()}.
	 */
	@Test
	public final void testGetClouds() {
		weathers.getClouds();
	}

	/**
	 * Test method for {@link com.example.model.Weather#getCod()}.
	 */
	@Test
	public final void testGetCod() {
		weathers.getCod();
	}

	/**
	 * Test method for {@link com.example.model.Weather#getCoord()}.
	 */
	@Test
	public final void testGetCoord() {
		weathers.getCoord();
	}

	/**
	 * Test method for {@link com.example.model.Weather#getSys()}.
	 */
	@Test
	public final void testGetSys() {
		weathers.getSys();
	}

	/**
	 * Test method for {@link com.example.model.Weather#getWind()}.
	 */
	@Test
	public final void testGetWind() {
		weathers.getWind();
	}

	/**
	 * Test method for {@link com.example.model.Weather#setWeather(com.example.model.Status[])}.
	 */
	@Test
	public final void testSetWeather() {
		weathers.setWeather(weather);
	}

	/**
	 * Test method for {@link com.example.model.Weather#getWeather()}.
	 */
	@Test
	public final void testGetWeather() {
		
	}

	/**
	 * Test method for {@link com.example.model.Weather#getMain()}.
	 */
	@Test
	public final void testGetMain() {
		weathers.getMain();
	}

	/**
	 * Test method for {@link com.example.model.Weather#setMain(com.example.model.Temperature)}.
	 */
	@Test
	public final void testSetMain() {
		weathers.setMain(main);
	}

	/**
	 * Test method for {@link com.example.model.Weather#getDt()}.
	 */
	@Test
	public final void testGetDt() {
		weathers.getDt();
	}

	/**
	 * Test method for {@link com.example.model.Weather#setDt(java.lang.String)}.
	 */
	@Test
	public final void testSetDt() {
		weathers.setDt(dt);
	}

	/**
	 * Test method for {@link com.example.model.Weather#getId()}.
	 */
	@Test
	public final void testGetId() {
		weathers.getId();
	}

	/**
	 * Test method for {@link com.example.model.Weather#setId(java.lang.String)}.
	 */
	@Test
	public final void testSetId() {
		weathers.setId(id);
	}

	/**
	 * Test method for {@link com.example.model.Weather#getName()}.
	 */
	@Test
	public final void testGetName() {
		weathers.getName();
	}

	/**
	 * Test method for {@link com.example.model.Weather#setName(java.lang.String)}.
	 */
	@Test
	public final void testSetName() {
		weathers.setName(name);
	}

}
