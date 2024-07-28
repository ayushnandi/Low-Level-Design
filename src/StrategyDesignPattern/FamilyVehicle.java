package StrategyDesignPattern;

public class FamilyVehicle extends Vehicle{
	public FamilyVehicle() {
			super(new SafeDrive());
	}
}