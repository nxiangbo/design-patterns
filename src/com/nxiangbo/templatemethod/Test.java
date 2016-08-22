package com.nxiangbo.templatemethod;

public class Test {
	public static void main(String[] args) {
		Tea tea = new Tea();
		System.out.println("TEA:\n----------");
		tea.prepareRecipe();
		
		System.out.println();
		
		Coffee coffee = new Coffee();
		System.out.println("COFFEE:\n----------");
		coffee.prepareRecipe();
	}
}
