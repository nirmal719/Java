import java.util.Scanner;

public class EnteringString{
	public static void main(String [] args){
		input();
	}
	public static void input(){
		Scanner sc = new Scanner(System.in);
		String num1 = null;
		String num2 = null;
		String op = null;
		int t1 = 0;
		int t2 = 0;
		while(true){
			num1 = sc.nextLine();
			op = sc.next();
				if((op.equals("+") || (op == "-") || (op == "*")||(op == "/")){
					t1 = Integer.parseInt(num1);
					num2 = sc.nextLine();
					t2 = Integer.parseInt(num2);
					doCalculate(t1, t2, op);
					break;
				}
		}
	}
	public static void doCalculate(int a, int b, String str){
		do{
			switch(str){
				case "+": int sum = a + b;
						 System.out.println(sum);
				case "-": int diff = a - b;
							System.out.println(diff);
				case "*": int product = a*b;
							System.out.println(product);
				case "/": if(b != 0){
								int quotient = a/b;
								System.out.println(quotient);
							}else{
								System.out.println("Divide by zero error");
								break;
							}
				default: System.out.println("Enter the correct operator");
						break;
			}
		}while(str != null);
	}
}