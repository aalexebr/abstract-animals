package org.java;

import org.java.pojo.Dolphin;
import org.java.pojo.Eagle;

public class Main {
	public static void main(String[] args) {
				
		Dolphin d = new Dolphin("crill");
		d.makeSound();
		d.eats();
		
		Eagle e = new Eagle("babies");
		e.makeSound();
		e.eats();
		
		
	}

}
