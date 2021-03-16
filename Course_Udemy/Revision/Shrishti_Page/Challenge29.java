abstract class Atom{
	Atom(){
		System.out.print("Atom ");
	}
	Atom(String type){
		System.out.print(type);
	}
}
class Rock extends Atom{
	Rock(){
		System.out.print("Rock ");
	}
	Rock(String type){
		System.out.print(type);
	}
}
class Mountain extends Rock{
	Mountain(){
		// super();
		super("Granite ");
		System.out.print("Mountain ");
	}	
}
public class Challenge29{
	public static void main(String [] args){
		new Mountain();
	}
}
