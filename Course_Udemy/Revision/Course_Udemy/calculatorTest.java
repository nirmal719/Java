import java.io.*;

public class CalculatorTest{
	public static void main(String [] args){
		try(BufferedReader buf = new BufferedReader(new InputStreamReader(System.in))){
			long number1 = 0;
			long number2 = 0;
			char ch;
			do{
				System.out.println("enter the operator: ");
				ch = (char) buf.read();
				System.out.println("enter the numbers: ");
				number1 = Long.parseLong(buf.readLine());
				number2 = Long.parseLong(buf.readLine());
				switch(ch){
					case '+': long sumValues = sum(number1, number2);
							   System.out.println(sumValues);
							   break;
					case '-': long diff = subtract(number1, number2);
							   System.out.println(diff);
							   break;
					case '*': long product = multiply(number1, number2);
							  System.out.println(product);
							  break;
					case '/': long quotient = divide(number1, number2);
								System.out.println(quotient);
								break;
					default:  System.out.println(ch+ " operator is not available in this calculator");
								break;
				}
			}while(ch != '.');
		}catch(IOException ie){
			System.out.println(ie+ " exception caught");
		}
	}
	private static long sum(long num1, long num2){
		return (num1 + num2) ;
	}
	private static long subtract(long num1, long num2){
		return (num1 - num2) ;
	}
	private static long multiply(long num1, long num2){
		return (num1 * num2) ;
	}
	private static long divide(long num1, long num2){
		if(num2 == 0){
			return -1;
		}else{
			return (num1 / num2) ;
		}
	}
}