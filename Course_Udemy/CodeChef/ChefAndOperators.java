import java.util.Scanner;

public class ChefAndOperators{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T --> 0){
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if(A < B){
				System.out.println("<");
			}else if(A > B){
				System.out.println(">");
			}else{
				System.out.println("=");
			}
		}
	
	}

}