class SuperClass{
	public static void foo(){
		System.out.println("In the superclass static method");
	}
	public void add(){
		System.out.println("In the superclass non-static method");
	}
}
class ChildClass extends SuperClass{
	public static void foo(){
		System.out.println("In the childclass static method");
	}
	public void add(){
		System.out.println("In the childclass non-static method");
	}
}
public class StaticOverriding{
	public static void main(String [] args){
		SuperClass sc = new ChildClass();
		// ChildClass cc = new ChildClass();
		sc.foo();
		sc.add();
		// cc.foo();
		// cc.add();
	}
}