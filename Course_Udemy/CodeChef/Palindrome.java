import java.util.Scanner;

public class Palindrome{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int temp = 0;
		int demo = i;
		int reverse = 0;
		
		while(i > 0){
			temp = i % 10;
			reverse = (reverse * 10) + temp;
			i /= 10;
			
		}
		System.out.println(reverse);
	}

}