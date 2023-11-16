package org.java.pojo;

import org.java.pojo.abs.Animal;

public class Dog extends Animal{
	
	private String species;

	public Dog(String className, String nutritionType,String species) {
		super(className, nutritionType);
		setSpecies(species);
	}
	
	public String getSpecies() {
			return species;
		}
	
	public void setSpecies(String species) {
		this.species = species;
	}
	
	@Override
	public void makeSound() {
		System.out.println("woof");
		
	}

	

}
