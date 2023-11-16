package org.java.pojo.abs;

public abstract class Animal {
	
	private String nourishment;
	
	public Animal(String nourishment) {
		
		setNourishment(nourishment);
	}
	
	public abstract void makeSound();

	public String getNourishment() {
		return nourishment;
	}

	public void setNourishment(String nourishment) {
		this.nourishment = nourishment;
	}
	
	public void  sleep() {
			
		System.out.println("ZzZ");
	}
	
	public void eats() {
		
		System.out.println(getNourishment());
	}
	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return ;
//	}

}
