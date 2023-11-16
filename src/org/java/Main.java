package org.java;

import org.java.pojo.Dolphin;
import org.java.pojo.Eagle;
import org.java.pojo.Pigeon;
import org.java.pojo.Shark;
import org.java.pojo.abs.Animal;
import org.java.pojo.inter.IFly;

public class Main {
	public static void main(String[] args) {
				
		Dolphin d = new Dolphin("mammal","carnivore","dolphin");
//		d.makeSound();
//		d.sleep();
//		d.eats("crill");
//		System.out.println(d);
		
		
		Eagle e = new Eagle("bird","carnivore","eagle");
//		e.makeSound();
//		e.eats("babies");
//		e.fly();
		Pigeon p = new Pigeon("bird", "insectivorous", "pigeon");
		
		Shark shark1 = new Shark("Fish", "carivore", "shark");
//		shark1.eats("seals");
//		
//		e.makeFly(e);
		
		IFly[] BirdArray = new IFly[2];
		BirdArray[0] = e;
		BirdArray[1] = p;
		
		for(int x =0 ; x<BirdArray.length; x++) {
			IFly bird = BirdArray[x];
			bird.makeFly(bird);
			
		}
		
		
	}

}
