package com.example.model;

public class Sysinfo {
private int message;
private String country;
private int sunrise;
private int sunset;
public void setCountry(String country) {
	this.country = country;
}
public void setMessage(int message) {
	this.message = message;
}
public void setSunrise(int sunrise) {
	this.sunrise = sunrise;
}
public void setSunset(int sunset) {
	this.sunset = sunset;
}
public String getCountry() {
	return country;
}
public int getMessage() {
	return message;
}
public int getSunrise() {
	return sunrise;
}
public int getSunset() {
	return sunset;
}


}
