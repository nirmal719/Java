class StaticExample{
	static int a = 10;
	static int b;
	
	static void sum(int i){
		System.out.println(" i : " +i);
		System.out.println(" a : " +a);
		System.out.println(" b : " +b);
	}
	static{
		System.out.println("in static block ");
		b = a * 6;
	}
}

public class UseStatic{
	public static void main(String [] args){
		StaticExample.sum(10);
	}
}
