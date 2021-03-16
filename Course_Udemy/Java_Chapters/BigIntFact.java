import java.util.Scanner;
import java.math.BigInteger;

public class BigIntFact{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		BigInteger result = BigInteger.ONE;
		if(i == 0 || i == 1){
			System.out.println("factorial = " +BigInteger.ONE);
		}else{
			while(i > 1){
				result = result.multiply(BigInteger.valueOf(i));
				i--;
			}
			System.out.println("factorial = " +result);
		}
	}

}