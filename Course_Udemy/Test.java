import java.util.Scanner;

public class Test{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		long pow = 1;
		if(b == 0){
			pow = a;
		}
		else if(b == 1){
			pow = a;
		}
		else{
			while(b >= 1){
				pow *= a;
				b -= 1;
			}
			/* for (int i = b;i>=1;i--){
				pow = pow * a;
			} */
		}
		System.out.println(pow);
		}
	}