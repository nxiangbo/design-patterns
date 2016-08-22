package com.nxiangbo.templatemethod;

public abstract class CaffeineBeverage {
	public final void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		if(customerWantsCondiments()){
			addCondiments();
		}
	}
	
	public void boilWater(){
		System.out.println("Boiling Water");
	}
	
	public void pourInCup(){
		System.out.println("Pouring in Cup");
	}
	
	public abstract void brew();
	
	public abstract void addCondiments();
	
	//���Ӻ������������������㷨��ִ������
	public boolean customerWantsCondiments(){
		return true;
	}
}
