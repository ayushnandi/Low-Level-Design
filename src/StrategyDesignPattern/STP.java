package StrategyDesignPattern;

public class STP {
	public static void main(String[] args) {
		Vehicle car1 = new FamilyVehicle();
		car1.drive();
		Vehicle car2 = new OffRoadVehicle();
		car2.drive();
	}
}
