class Vehicle{
	public void getMileage(){
		System.out.print("miles ");
	}
}
class Car extends Vehicle{
	public void getMileage() throws RuntimeException{
		super.getMileage();
		if(true)
			throw new RuntimeException();
		System.out.println("12 miles");
		
	}
}
public class Challenge37{
	public static void main(String [] args){
		new Car().getMileage();
	}
}
