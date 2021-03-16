class A{
	Object print(String ta){
		System.out.println("In the base class");
		return null;
	}
}
class B extends A{
	public String print(String name){
		super.print("Bar");
		System.out.println("In the child class");
		return null;
	}
}
public class CoVariantExample{
	public static void main(String [] main){
		// A obj1 = new A();
		//obj1.print();
		
		//A obj3 = new B();
		//CoVariantExample = obj3.print("Car");
		
		A obj2 = new B();
		String d = (String)obj2.print("Car");
		System.out.println(d);
		
		/* int i = obj2.print("200");
		System.out.println(i); */
	}
}