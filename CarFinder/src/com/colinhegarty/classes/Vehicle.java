package com.colinhegarty.classes;

public abstract class Vehicle{
	private String make;
	private String model;
	private int year;
	private int numberOfDoors;
	private int numberOfOwners;
	private int milage;
	private String location;
	private boolean isManual;
	private boolean isRoadworthy;
	
	public void setMake(String make){
		this.make = make;
	}

	public String getMake(){
		return make;
	}

	public void setModel(String model){
		this.model = model;
	}

	public String getModel(){
		return model;
	}

	public void setYear(int year){
		this.year = year;
	}

	public int getYear(){
		return year;
	}

	public void setNumDoors(int numberOfDoors){
		this.numberOfDoors = numberOfDoors;
	}

	public int getNumDoors(){
		return numberOfDoors;
	}


	public void setNumOwners(int numberOfOwners){
		this.numberOfOwners = numberOfOwners;
	}

	public int getNumOwners(){
		return numberOfOwners;
	}

	public void setMilage(int milage){
		this.milage = milage;
	}

	public int getMilage(){
		return milage;
	}


	public void setLocation(String location){
		this.location = location;
	}

	public String getLocation(){
		return location;
	}


	public void setIsManual(boolean isManual){
		this.isManual = isManual;
	}

	public boolean getIsManual(){
		return isManual;
	}

	public void setIsRoadworthy(boolean isRoadworthy){
		this.isRoadworthy = isRoadworthy;
	}

	public boolean getIsRoadworthy(){
		return isRoadworthy;
	}

	public double toKilometres(int m){
		return m/0.62137119;
	}
}