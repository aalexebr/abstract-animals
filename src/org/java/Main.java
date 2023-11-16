package org.java;

import org.java.pojo.Dolphin;
import org.java.pojo.Eagle;
import org.java.pojo.Pigeon;
import org.java.pojo.Shark;
import org.java.pojo.abs.Animal;
import org.java.pojo.inter.IFly;
import org.java.pojo.inter.ISwim;

public class Main {
	public static void main(String[] args) {
				
		Dolphin d = new Dolphin("mammal","carnivore","dolphin");
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
		
		IFly[] BirdArray = new IFly[2];
		BirdArray[0] = e;
		BirdArray[1] = p;
		
		for(int x =0 ; x<BirdArray.length; x++) {
			IFly bird = BirdArray[x];
			makeFly(bird);
		}
		
		
	}
	
	public static void makeFly(IFly animal) {
		animal.fly();
	}

}
