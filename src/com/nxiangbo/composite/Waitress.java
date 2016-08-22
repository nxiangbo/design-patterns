package com.nxiangbo.composite;

public class Waitress {
	MenuComponent allMenu;
	
	public Waitress(MenuComponent allMenus) {
		this.allMenu = allMenus;
	}
	
	public void printMenu(){
		allMenu.print();
	}
}
