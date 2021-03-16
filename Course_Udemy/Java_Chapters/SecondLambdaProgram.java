interface Second{
	void display(int n, int i);
}
public class SecondLambdaProgram{
	public static void main(String [] args){
		Second second;
		second = (a,b)-> {
			a = 30;
			b = 40;
			System.out.println("values : "+a + " " +b);
			System.out.println("void type interface");
		};
		second.display(20,10);
		System.out.println("ok");
	}
}