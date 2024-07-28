package StrategyDesignPattern;
public class OffRoadVehicle extends Vehicle{
	public OffRoadVehicle() {
		super(new SportsDrive());
	}
}
