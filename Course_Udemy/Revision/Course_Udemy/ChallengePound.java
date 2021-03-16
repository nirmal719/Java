import java.util.Scanner;

public class ChallengePound{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int occurences = sc.nextInt();
		for(int i = 0; i < occurences; i++){
			double pound = sc.nextDouble();
			double result = pound * 0.45359237;
			System.out.println(result);
		}
	}
}