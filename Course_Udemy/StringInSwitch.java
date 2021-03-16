import java.util.Scanner;

public class StringInSwitch{
	public static void main(String [] args){
		input();
	}
	public static void input() {
		Scanner sc = new Scanner(System.in);
			String op = sc.nextLine();
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
		do{
			switch(op){
				case "+": int sum = num1 + num2;
						 System.out.println(sum);
						 break;
				case "-": int diff = num1 - num2;
							System.out.println(diff);
							break;
				case "*": int product = num1*num2;
							System.out.println(product);
							break;
				case "/": if(num2 != 0){
								int quotient = num1/num2;
								System.out.println(quotient);
							}else{
								System.out.println("Divide by zero error");
							}
							break;
				case ",": System.out.println("Enter the correct operator");
						break;	
			}
		}while(op == ",");
		
		
	}
}