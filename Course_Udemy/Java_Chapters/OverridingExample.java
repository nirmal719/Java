class Vehicle{
	String print(){
		return "Vehicle";
	}
}

class Car extends Vehicle{
	String print(){
		return "Audi";
	}
}

class Bike extends Vehicle{
	String print(){
		return "Harley";
	}
}
public class OverridingExample{
	public static void main(String [] args){
		Vehicle vehicle = new Car();
		Car car = (Car)vehicle;
		System.out.println(car.print());
		Bike bike = (Bike)vehicle;
		System.out.println(bike.print());
	}
}

