import java.lang.ArithmeticException;

interface Demo{
	int divide(int a, int b)throws ArithmeticException;
}
/* class DivideByZeroException {
	DivideByZeroException(){
		super("Division exception");
	}
} */
public class LocalVariableInLambda{
	static int i = 10;
	public static void main(String [] args) throws ArithmeticException{
		final int j = 9;
		Demo dim = (a,b)->{
						if(b == 0)
							throw new ArithmeticException();
						else
							i+=1;
							// j += 3;
							return (a/b);
					};
			i += 2;
		System.out.println(i+ " " +j);
		System.out.println(dim.divide(10,0));
	}
}