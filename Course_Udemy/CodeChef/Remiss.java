import java.util.Scanner;

public class Remiss{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T --> 0){
			int A = sc.nextInt();
			int B = sc.nextInt();
			if(A > B){
				System.out.println(A + " " + (A+B));
			}else if (A < B){
				System.out.println(B + " " + (A+B));
			}else {
				System.out.println(A + " " + (A+B));
			}
		}
	}
}