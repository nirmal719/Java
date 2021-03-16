interface Greeter{
	default void greet(){
		System.out.println("welcome");
	}
}
interface Sampler{
	default void greet(){
		System.out.println("Good Day");
	}
}
public class Challenge33 implements Greeter,Sampler{
	public void greet(){
		System.out.println("Good Morning");
	}
	public static void main(String [] args){
		Challenge33 trial = new Challenge33();
		trial.greet();
	}
}
