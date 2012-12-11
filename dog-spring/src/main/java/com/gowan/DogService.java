package com.gowan;


public class DogService {
	
	private Dog dog;

	public DogService(Dog dog) {
		super();
		this.dog = dog;
	}
	
	public void bark(String loud) {
		System.out.println(dog.bark(loud));
	}
}
