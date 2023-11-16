package org.java.pojo.abs;

public abstract class Animal {
	
	private String nutritionType;
	private String className;
	
	public Animal(String className, String nutritionType) {
		
		setNutritionType(nutritionType);
		setClassName(className);
	}
	
	public abstract void makeSound();
	
	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}


	public String getNutritionType() {
		return nutritionType;
	}

	public void setNutritionType(String nutritionType) {
		this.nutritionType = nutritionType;
	}
	
	public void  sleep() {
			
		System.out.println("ZzZ");
	}
	
	public void eats(String food) {
		
		System.out.println("eats: "+food);
	}
	
	@Override
	public String toString() {
		
		return "Animal: \n"
				+"class: "+getClassName()+"\n"
				+"nutrition type: "+getNutritionType();
				
	}

}
