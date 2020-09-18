

import java.util.Iterator;
import java.util.List;
import Inventory;

public class FindGuitarTester {

	public static void main(final String[] args) {
		final Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		final GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER,"Stratocastor", Type.ELECTRIC, Wood.ALDER,Wood.ALDER);
		//Guitar whatErinLikes = new Guitar(null,0,Builder.MARTIN,"Stratocastor", Type.ACOUSTIC, Wood.MAHAGONY,Wood.ADIRONDACK);
		final List<Guitar> guitarlist = inventory.search(whatErinLikes);
		
		if(!guitarlist.isEmpty()) {
			System.out.println("Erin, You Might Like These guitars \n");
					for(final Iterator<Guitar> i = guitarlist.iterator(); i.hasNext();) {
						final Guitar guitar = i.next();
					//	GuitarSpec guitarSpec = guitar.getSpec();
						
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

	private static void initializeInventory(final Inventory inventory) {
		inventory.addGuitar("V95693", 1499.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
		inventory.addGuitar("V9512", 1599.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
	}

}
