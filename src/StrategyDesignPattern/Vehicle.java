package StrategyDesignPattern;

public class Vehicle {
	DriveStrategy driveobj;
	
	//Constructor Injection
	Vehicle(DriveStrategy driveobj){
		this.driveobj = driveobj; 
	}
	public void drive() {
		driveobj.drive();
	}
}
