package org.java.pojo;

import org.java.pojo.abs.Animal;

public class Eagle extends Animal{

	public Eagle(String nourishment) {
		super(nourishment);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeSound() {
		System.out.println("*eagle sound*");
		
	}

}
