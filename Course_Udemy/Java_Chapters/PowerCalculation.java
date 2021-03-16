import java.util.Scanner;
import java.math.BigInteger;

public class PowerCalculation{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		long number = sc.nextLong();
		int power = sc.nextInt();
		BigInteger result = BigInteger.ONE;
			
			for(int i = power; i > 0 ;i--){
				result = result.multiply(BigInteger.valueOf(number));
			}
			System.out.println(result);	
	}
}