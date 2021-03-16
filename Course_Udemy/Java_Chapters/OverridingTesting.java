class AutoRicksaw{
	static void mileage(){
		System.out.println("In Ricksaw");
	}
}

class Truck extends AutoRicksaw{
	static void mileage(){
		System.out.println("In Truck");
	}
}

/* class Normal{
	static void print(){
		System.out.println("testing");
	}
}

class Second{
	// Normal nr = new Normal();
	void write(){
		// nr.print();
		Normal.print();
	}
} */

public class OverridingTesting{
	public static void main(String [] args){
		// AutoRicksaw auto = new Truck();
		AutoRicksaw auto = new AutoRicksaw();
		auto.mileage();
		Truck truck = (Truck)auto;
		truck.mileage();
		/* Normal norm = new Normal();
		norm.print(); */
		// Normal.print();
		/* Second sc = new Second();
		sc.write(); */
		// Second.write();
	}
}
