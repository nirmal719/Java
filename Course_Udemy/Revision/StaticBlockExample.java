class Test{
	static int i;
	int j;
	static{
		System.out.println("static block called");
		i = 10;
		System.out.println("static block called");
	}
}
public class StaticBlockExample{
	public static void main(String [] args){
		// new Test();
		// Test tt;
		System.out.println(Test.i);
	}
}
