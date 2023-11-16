package org.java.pojo;

import org.java.pojo.abs.Animal;
import org.java.pojo.inter.ISwim;

public class Dolphin extends Animal implements ISwim{
	
	private String species;

	public Dolphin(String className, String nutritionType, String species) {
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
	public void eats(String food) {
		System.out.print("this " + this.getSpecies()+" ");
		super.eats(food);
	}

	@Override
	public void makeSound() {
		System.out.println("*sonar*");
		
	}
	
	
	@Override
	public void swim() {
		System.out.println("swimming");
		
	}

}
