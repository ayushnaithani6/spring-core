package com.ayush.springDemo;

public class Alien {
	
	private int age;
	private Computer com;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Computer getCom() {
		return com;
	}

	public void setCom(Computer com) {
		this.com = com;
	}

	public Alien() {
		System.out.println("Alien constructor is called");
	}
	
	public void code() {
		System.out.println("Alien is coding");
		com.compile();
	}
}
