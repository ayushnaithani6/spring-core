package com.ayush.springDemo;

public class Alien {
	
	private int age;
	private Laptop laptop;
	
	public Alien() {
		System.out.println("Alien object created");
	}
	
	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		System.out.println("Laptop setter is called");
		this.laptop = laptop;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		System.out.println("Age setter is called");
		this.age = age;
	}
	
	public void code() {
		System.out.println("alien is coding");
		laptop.compile();
	}
}
