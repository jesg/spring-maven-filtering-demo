package com.gowan;

public class Dog {

	private String bark;
	private String name;

	public Dog(String bark, String name) {
		super();
		this.bark = bark;
		this.name = name;
	}
	
	public String bark(String loud) {
		String noise = bark;
		if("LOUD".equals(loud)){
			noise = noise.toUpperCase();
		}
		return noise;		
	}
	public String getName() {
		return name;
	}
}
