package org.java.pojo;

import org.java.pojo.abs.Animal;
import org.java.pojo.inter.ISwim;

public class Shark extends Animal implements ISwim{
	
	private String species;

	public Shark(String className, String nutritionType,  String species) {
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
	public void eats(String food) {
		System.out.print("this " + this.getSpecies()+" ");
		super.eats(food);
	}

	@Override
	public void makeSound() {
		System.out.println("sharks dont make sounds.They are silent killers");
		
	}
	

	
	@Override
	public void swim() {
		System.out.println("this "+getSpecies()+" is swimming");
		
	}

}
