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
	
	//钩子函数，可以用来控制算法的执行流程
	public boolean customerWantsCondiments(){
		return true;
	}
}
