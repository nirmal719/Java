class Details{
	static int x;
	static {
		System.out.print("Welcome");
		x = 100;
	}
	static void printVal(){
		System.out.println(x);
	}
}
public class Challenge25{
	static void print(){
		System.out.print("Hello ");
	}
	public static void main(String [] args){
		print();
		Details.printVal();
	}
}