import java.util.Scanner;

public class PowRecursion{
	public static void main(String [] args){
		Scanner sc = new Scanner (System.in);
		int number = sc.nextInt();
		int exponent = sc.nextInt();
		
		int result = pow(number, exponent);
		System.out.println(result);
	}
	
	public static int pow(int a, int b){
		/* if(b == 0){
			return 1;
		} */
		
		if(b == 1){
			return a;
		}
		else{
			return pow(a*a, (b-1));
		}
	}
}

		