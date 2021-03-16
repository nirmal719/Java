import java.util.Scanner;

public class SimplePalindrome{
	public void palindromeCheck(int a){
		int temp = a;
		int demo = 0;
		int reversedNumber = 0;
		
		while(temp != 0){
			demo = temp %10;
			reversedNumber = (reversedNumber * 10) + demo;
			temp /= 10;
		}
		if (reversedNumber == a){
			System.out.println("Number is palindrome ");
		}
		else{
			System.out.println("Number is not palindrome ");
		}
		
	}
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int numberToBeChecked = sc.nextInt();
		
		palindromeCheck(numberToBeChecked);
	
	}

}