package day17;

	

 class Vehicle {
		void startEngine() {
			System.out.println("Vehicle engine started..");
		}
	}
	
	 class Car extends Vehicle  {
		void drive() {
			System.out.println("Car is driving..");
		}
	}
	 class ElectricCar extends Car{
		void chargeBattery() {
			System.out.println("Electric Car is charging ");
		}
	}
	 class Bike extends Vehicle {
		void KickStart() {
			System.out.println("Vehicle engine started ");
		}
	}
	

	public class VehicleManagement {
	public static void main(String[] args) {
		Vehicle V = new Vehicle ();
		V.startEngine();
		
		Car C = new Car();
		C.drive();
		
		ElectricCar E = new ElectricCar();
		E.chargeBattery();
	    //inheritance of car class
		E.startEngine();
		
		System.out.println("Bike is Kick started..");
		
		
		
		
	}

}
