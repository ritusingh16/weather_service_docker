package com.example.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Status {
	private String id;
	private String main;
	private String description;
	private String icon;
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIcon() {
		return icon;
	}
	public String getId() {
		return id;
	}
	public String getDescription() {
		return description;
	}
	public void setMain(String main) {
		this.main = main;
	}
	public String getMain() {
		return main;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}