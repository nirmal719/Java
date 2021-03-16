class Vehicle{
	public Vehicle(){ System.out.print("A"); }
}
class FourWheeler extends Vehicle{
	public FourWheeler(){
		System.out.print("B");
	}
}
class Car extends FourWheeler{
	public Car(){ System.out.print("C"); }
}
public class Trial{
	public static void main(String [] a){
		new Car();
		new FourWheeler();
	}
}