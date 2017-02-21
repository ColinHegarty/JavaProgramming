package com.colinhegarty.classes;

import java.util.Calendar;	

public class Car extends Vehicle implements Crushable{

	public Car(String make, String model, int year, int numberOfDoors, int numberOfOwners, int milage, String location, boolean isManual, boolean isRoadworthy){
		setMake(make);
		setModel(model);
		setYear(year);
		setNumDoors(numberOfDoors);
		setNumOwners(numberOfOwners);
		setMilage(milage);
		setLocation(location);
		setIsManual(isManual);
		setIsRoadworthy(isRoadworthy);
	}

	public boolean scrapage(int year, boolean NCT){
		Calendar can = Calendar.getInstance();
		int age, milagePerYear;
		age = can.get(Calendar.YEAR) - year;
		milagePerYear = ((int)(this.getMilage()/age));

		if(age < 6 || age < 10 && NCT)
		{
			return true;
		}
		else if(age > 9 && milagePerYear > 15000)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}