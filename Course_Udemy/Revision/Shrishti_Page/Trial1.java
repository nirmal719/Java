class Vehicle{
	protected void mileage(){}
}
class Car extends Vehicle{
	// public void mileage(){}
	int mileage(String type){return 0;}
}
public class Trial1{
	public static void main(String [] args){
		new Car();
	}
}