package com.nxiangbo.iterator;

import java.util.Iterator;

public class Waitress {
	Menu pancakeHouseMenu;
	Menu dinnerMenu;
	
	public Waitress(Menu pancakeHouseMenu, Menu dinnerMenu){
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinnerMenu = dinnerMenu;
	}
	
	public void printMenu(){
		Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator dinnerIterator = dinnerMenu.createIterator();
		System.out.println("MENU\n-----\nBREAKFAST");
		printMenu(pancakeIterator);
		System.out.println("MENU\n-----\nLAUNCH");
		printMenu(dinnerIterator);
	}
	
	private void printMenu(Iterator iterator){
		while(iterator.hasNext()){
			MenuItem item = (MenuItem) iterator.next();
			System.out.print(item.getName()+", ");
			System.out.print(item.getPrice()+"---");
			System.out.println(item.getDescription());
		}
	}
}
