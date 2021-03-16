interface Simpler{
	static void meet(){
		System.out.println("Good Day");
	}
}
public class Challenge34 implements Simpler{
	static void meet(){
		System.out.println("Hello ");
	}
	public static void main(String [] args){
		/* Simpler obj = new Challenge34();
		obj.meet(); */
		// Simpler obj1;
		// obj1.meet();
		Simpler.meet();
		Challenge34.meet();
	}
}