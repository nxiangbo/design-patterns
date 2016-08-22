package com.nxiangbo.iterator;

public class MenuTest {
	public static void main(String[] args) {
		Menu pancakeHouseMenu = new PancakeHouseMenu();
		Menu dinnerMenu = new DinnerMenu();
		Waitress waitress = new Waitress(pancakeHouseMenu, dinnerMenu);
		waitress.printMenu();
	}
}
