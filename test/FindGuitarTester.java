package com.core.src;

import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		//Guitar whatErinLikes = new Guitar("",0,Builder.FENDER,"Stratocastor", Type.ELECTRIC, Wood.ALDER,Wood.ALDER);
		Guitar whatErinLikes = new Guitar(null,0,Builder.MARTIN,"Stratocastor", Type.ACOUSTIC, Wood.MAHAGONY,Wood.ADIRONDACK);
		List<Guitar> guitarlist = inventory.search(whatErinLikes);
		
		if(!guitarlist.isEmpty()) {
			System.out.println("Erin, You Might Like These guitars \n");
					for(Iterator<Guitar> i = guitarlist.iterator(); i.hasNext();) {
						Guitar guitar = i.next();
						GuitarSpec guitarSpec = guitar.getSpec();
						
						System.out.println(
						guitar.getBuilder() + " " + guitar.getModel() +" " +
								guitar.getType()+ " guitar:\n" +
					 guitar.getBackWood() + "back and sides,\n" +
								guitar.getTopWood()+ "top. \nyou can have it for only  $" +
					 guitar.getPrice()+"!"			
								);
					}
		}
		else {
			System.out.println("Sorry. Erin, we have nothing for you.");
		}
		
		
		
	}

	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("V95693", 1499.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
		inventory.addGuitar("V9512", 1599.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
	}

}
