class Vehicle{
	Vehicle getVehicleById(int id){
		 return new Vehicle();
	}
	
	int mileage = 45;
	String print(){return "Vehicle";}
}

class Bike extends Vehicle{
	int mileage = 55;
	String print(){return "Harley";}
	 public Object getVehicleById(int id){
		System.out.println("In super class");
		 return null;
	 }
}
class Car extends Bike{
	public String getVehicleById(int id){
		System.out.println("In sub class");
		 return null;
	 }
	int mileage = 65;
	String print(){return "Audi";}
}

public class Challenge21{
	public static void main(String [] args){
		Object obj;
		String str;
		 obj = new Bike().getVehicleById(10);
		 str = new Vehicle().getVehicleById(10);
		//Bike obj1 = new Car();
		//Vehicle vehicle = (Vehicle)obj1;
		//System.out.println(vehicle.print());
		//System.out.println(vehicle.mileage);
		//System.out.println(obj1.mileage);
		//Bike bike = (Bike)obj1;
		//System.out.println(bike.print());
		
		//Vehicle obj2 = new Bike();
		//System.out.println(obj2.print());
		
		
	}
}