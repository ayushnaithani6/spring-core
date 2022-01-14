package com.ayush.springDemo;

public class Alien {
	
	private int age;
	private Laptop laptop;
	
	public Alien(int age, Laptop laptop) {
		System.out.println("Alien object created");
		this.age = age;
		this.laptop = laptop;
	}
	
	
	public void code() {
		System.out.println("alien is coding");
		System.out.println("age: " + age);
		System.out.println("laptop: " + laptop);
		laptop.compile();
	}
}
