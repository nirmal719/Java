abstract class Atom {
	Atom(){
		System.out.println("Atom");
	}
	Atom(String type){
		System.out.println(type);
	}
}

class Rock extends Atom{
	Rock(){
		System.out.println("Rock");
	}
	Rock(String type){
		System.out.println(type);
	}
}

class Mountain extends Rock{
	Mountain(){
		super("Granite");
		System.out.println("Mountain");
	}
}

public class OopsExample{
	public static void main(String [] args){
		new Mountain();
	}
}
