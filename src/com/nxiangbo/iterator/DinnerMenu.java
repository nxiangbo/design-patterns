package com.nxiangbo.iterator;

import java.util.Iterator;

public class DinnerMenu implements Menu{
	
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
  
	public DinnerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
 
		addItem("Vegetarian BLT",
			"(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
		addItem("BLT",
			"Bacon with lettuce & tomato on whole wheat", false, 2.99);
		addItem("Soup of the day",
			"Soup of the day, with a side of potato salad", false, 3.29);
		addItem("Hotdog",
			"A hot dog, with saurkraut, relish, onions, topped with cheese",
			false, 3.05);
		addItem("Steamed Veggies and Brown Rice",
			"Steamed vegetables over brown rice", true, 3.99);
		addItem("Pasta",
			"Spaghetti with Marinara Sauce, and a slice of sourdough bread",
			true, 3.89);
	}
  
	public void addItem(String name, String description, 
	                     boolean vegetarian, double price) 
	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, menu is full!  Can't add item to menu");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}
	}
 
	public MenuItem[] getMenuItems() {
		return menuItems;
	}
  

	@Override
	public Iterator<MenuItem> createIterator() {
		return new DinnerMenuIterator(menuItems);
	}	
	
	class DinnerMenuIterator implements Iterator<MenuItem>{
		MenuItem[] list;
		int position = 0;
		
		public DinnerMenuIterator(MenuItem[] list) {
			this.list = list;
		}
		
		@Override
		public boolean hasNext() {
			if(position>=list.length || list[position]==null){
				return false;
			} else{
				return true;
			}
		}

		@Override
		public MenuItem next() {
			MenuItem menuItem = list[position];
			position++;
			return menuItem;
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			
		}
		
	}

}
