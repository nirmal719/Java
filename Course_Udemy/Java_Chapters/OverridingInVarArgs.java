class VarArgs{
	void calculator(int ... sum){
		System.out.println("Contents in superclass: ");
		for (int x:sum){
			System.out.println(x);
		}
	}
}
class B extends VarArgs{
	void calculator(int ... a){
		super.calculator(1023,45,6);
		System.out.println("Contents in subclass: ");
		for (int y:a){
			System.out.println(y);
		}
	}
}
public class OverridingInVarArgs{
	public static void main(String [] args){
		VarArgs obj = new B();
		obj.calculator(10);
		obj.calculator(20,30,90);
	}
}
