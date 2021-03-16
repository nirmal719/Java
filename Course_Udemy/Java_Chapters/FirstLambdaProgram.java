interface First{
	void print();
}
public class FirstLambdaProgram{
	public static void main(String [] args){
		First first;
		first = () -> System.out.print("first");
		first.print();
	}
}