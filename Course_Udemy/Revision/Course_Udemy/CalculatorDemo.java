import java.util.Scanner;
import java.io.*;

public class CalculatorDemo{
	public static void main(String [] args) throws Exception{
		System.setIn(new FileInputStream(new File("Input.txt")));
		Scanner sc = new Scanner(System.in);
		long num1 = 0;
		long num2 = 0;
		String c1 = '\u0000';
		int t = sc.nextInt();
		
		
		while(t-- != 0){
			num1 = sc.nextLong();
			num2 = sc.nextLong();
			c1 = sc.nextLine();
			switch(c1){
				case "+": long result = sum(num1, num2);
							System.out.println(result);
							break;
				case "-": long diff = subtract(num1, num2);
							System.out.println(diff);
							break;
				case "*": long product = multiply(num1, num2);
							System.out.println(product);
							break;
				case "/": long quotient = divide(num1, num2);
							System.out.println(quotient);
							break;
				default: break;
			}
		
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
		return (num1 / num2) ;
	}
	
}