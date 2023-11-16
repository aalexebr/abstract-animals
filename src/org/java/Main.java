package org.java;

import org.java.pojo.Dog;
import org.java.pojo.Dolphin;
import org.java.pojo.Eagle;
import org.java.pojo.Pigeon;
import org.java.pojo.Shark;
import org.java.pojo.abs.Animal;
import org.java.pojo.inter.IFly;
import org.java.pojo.inter.ISwim;

public class Main {
	public static void main(String[] args) {
		
		Dog dog = new Dog("mammal", "mammal", "dog");
//		dog.eats("what owner gives him");
//		dog.makeSound();
				
		Dolphin d = new Dolphin("mammal","mammal","dolphin");
//		d.makeSound();
//		d.sleep();
//		d.eats("small fish and plastic");
//		System.out.println(d);
				
		Eagle e = new Eagle("bird","carnivore","eagle");
//		e.makeSound();
//		e.eats("babies");
//		e.fly();
		
		Pigeon p = new Pigeon("bird", "insectivorous", "pigeon");
//		p.eats("garbage");
		
		Shark shark1 = new Shark("Fish", "carivore", "shark");
//		shark1.eats("seals");
//		
//		e.makeFly(e);
		
		final int LENGTH = 2;
		
		IFly[] BirdArray = new IFly[LENGTH];
		BirdArray[0] = e;
		BirdArray[1] = p;
		
		ISwim[] MarineArray = new ISwim[LENGTH];
		MarineArray[0] = d;
		MarineArray[1] = shark1;
		
		
		for(int x =0 ; x<LENGTH; x++) {
			IFly bird = BirdArray[x];
			makeFly(bird);
			
			ISwim waterAnimal = MarineArray[x];
			makeSwim(waterAnimal);
		}
		
		
	}
	
	public static void makeFly(IFly animal) {
		animal.fly();
	}
	
	public static void makeSwim(ISwim animal) {
		animal.swim();
	}

}
