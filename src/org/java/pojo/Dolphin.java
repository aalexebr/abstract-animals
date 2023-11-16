package org.java.pojo;

import org.java.pojo.abs.Animal;

public class Dolphin extends Animal{

	public Dolphin(String nourishment) {
		super(nourishment);
		
	}

	@Override
	public void makeSound() {
		System.out.println("sonar");
		
	}

}
