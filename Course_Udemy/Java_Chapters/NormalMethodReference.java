interface Normal{
	void print(String msg);
}
class NormalClass{
	public void output(String msg1){
		System.out.print("msg is: "+msg1);
	}
}

public class NormalMethodReference{
	public void outcome(Normal nm, String msg2){
		nm.print(msg2);
	}
	public static void main(String [] args){
		String str1 = "A wonderland";
		NormalMethodReference nmr = new NormalMethodReference();
		NormalClass nmc = new NormalClass();
		nmr.outcome(nmc::output,str1);
	}
}
