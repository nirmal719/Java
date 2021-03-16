public class StaticOverloading{
	public static void foo(){
		System.out.println("In static method");
	}
	public void foo(int a){
		System.out.println("In non-static method");
	}
	public static void main(String [] args){
		StaticOverloading sto = new StaticOverloading();
		sto.foo(10);
		foo();
	}
}