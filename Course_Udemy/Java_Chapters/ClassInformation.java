class A{
	int i;
	int j;
}
class B extends A{
	String name;
	byte age;
}
public class ClassInformation{
	public static void main(String [] args){
		A a = new A();
		B b = new B();
		Class<?> obj;
		obj = a.getClass();
		System.out.println("A is object of type: "+obj.getName());
		obj = b.getClass();
		System.out.println("B is object of type: "+obj.getName());
		obj = obj.getSuperclass();
		System.out.println("Superclass of class B is: "+obj.getName());	
	}
}