package com.cybage.javademo.java.model;

import com.cybage.javademo.java.model.Temperature;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)

public class Weather {
	
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
	public void setBase(String base) {
		this.base = base;
	}
	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public void setCoord(Coordinates coord) {
		this.coord = coord;
	}
	
	public void setSys(Sysinfo sys) {
		this.sys = sys;
	}
	public void setWind(Wind wind) {
		this.wind = wind;
	}
	public String getBase() {
		return base;
	}
	public Clouds getClouds() {
		return clouds;
	}
	public String getCod() {
		return cod;
	}
	public Coordinates getCoord() {
		return coord;
	}

	public Sysinfo getSys() {
		return sys;
	}
	public Wind getWind() {
		return wind;
	}
	
	public void setWeather(Status[] weather) {
		this.weather = weather;
	}
	public Status getWeather() {
		return weather[0];
	}
	
	public Temperature getMain() {
		return main;
	}
	public void setMain(Temperature main) {
		this.main = main;
	}
	public String getDt() {
		return dt;
	}
	public void setDt(String dt) {
		this.dt = dt;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


}
