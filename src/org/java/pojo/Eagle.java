package org.java.pojo;

import org.java.pojo.abs.Animal;
import org.java.pojo.inter.IFly;

public class Eagle extends Animal implements IFly{
	
	private String species;

	public Eagle(String className,String nutritionType, String species) {
		super(className,nutritionType);
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
		System.out.println("*eagle sound*");
		
	}
	
	@Override
	public void eats(String food) {
		System.out.print("this " + this.getSpecies()+" ");
		super.eats(food);
	}

	@Override
	public void fly() {
		System.out.println("this "+getSpecies()+" is flying");
		
	}


}
