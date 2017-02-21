package com.colinhegarty.classes;

public class Van extends Vehicle implements Crushable{
	
	public Van(String make, String model, int year, int numberOfDoors, int numberOfOwners, int milage, String location, boolean isManual, boolean isRoadworthy){
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

	public boolean scrapage(int year, boolean CRW){
		if(CRW)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}