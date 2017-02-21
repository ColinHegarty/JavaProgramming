package com.colinhegarty.classes;

import java.util.ArrayList;

public class CarMenu{
//	int index = 0;
//	ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();

	public static void main(String[] args){
/*		

		boolean continueMenu = true;
		System.out.println("1. First Vehicle\n 2. Previous Vehicle \n3. Next Vehicle \n4. Last Vehicle \n5. New Vehicle 
					\n6. Sort by \n7. Exit");
		do{
			Scanner sc = new Scanner();
			int userInput = sc.nextInt();
			switch(userInput){
				case 1: index=0; populate(); break;
				case 2: --index; populate(); break;
				case 3: ++index; populate(); break;
				case 4: index = vehicleList.count(); populate(); break;
				case 5: newVehicle(); break;
				case 6: sortBy(); break;
				case 7: continueMenu = false; break;
				default: System.out.println("Invalid Option"); break;
			}
		}while(continueMenu);

*/
		Car c = new Car("Volkswagen", "Bora", 2005, 4, 3, 136582, "Dublin", true, true);
		System.out.println("Make of Car: " + c.getMake());
		System.out.println("Miles in Kilometres: " + ((int)c.toKilometres(136582)));
		Vehicle c2 = new Car("Ford", "Fiesta", 2012, 5, 2, 18491, "Cork", true, false);
		System.out.println("Is this car worth seeing: " + ((Car)c2).scrapage(c2.getYear(), c2.getIsRoadworthy()));
	}

/*
	public void populate(){
		Vehicle mv = vehicleList.get(index);
		System.out.Printf("Make: %s \nModel: %s \nYear: %d \nNumber of Doors: %d \nMilage: %d \nLocation %s \nManual: %b 
				\nWorth Viewing: %b", mv.getMake(), mv.getModel(), mv.getYear(), mv.getDoors(), mv.getMilage(), mv.getLocation(), mv.getManual());
	}
*/

	
}