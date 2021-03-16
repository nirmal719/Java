class Details{
	static int x;
	static {
		System.out.println("Welcome");
		x = 100;
	}
	static void printVal(){
		System.out.println(x);
	}
}
public class StaticExample{
	static void print(){
		System.out.println("Hello ");
	}
	public static void main(String [] args){
		print();
		Details.printVal();
	}

}