package org.java.pojo.abs;

import org.java.pojo.inter.IFly;
import org.java.pojo.inter.ISwim;

public abstract class MainFunction {
	
	public static void makeFly(IFly animal) {
		animal.fly();
	}
	
	public static void makeSwim(ISwim animal) {
		animal.swim();
	}

}
