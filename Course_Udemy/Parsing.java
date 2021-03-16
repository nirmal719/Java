import java.util.Scanner;

public class Parsing{
	public static void main(String [] args){
		input();
	}
	public static void input(){
		Scanner sc = new Scanner(System.in);
		String op = sc.nextLine();
		String n1 = sc.nextLine();
		String n2 = sc.nextLine();
		int t1 = 0;
		int t2 = 0;
		// System.out.println(op);
		// System.out.print(n1 + " " +n2);
			if((op == "+") ||(op == "-" )|| (op == "*")|| (op == "/")){
				doCalculate(n1, n2, op);
			}
	}
	public static void doCalculate(String t1, String t2,String str){
		System.out.print(t1 + " " +t2);
		int a = Integer.parseInt(t1);
		int b = Integer.parseInt(t2);
		System.out.print(a + " " +b);
		if(str == "+"){
			int sum = a+b;
			System.out.println(sum);
		}
			switch(str){
				case "+": int sum = a + b;
						 System.out.println(sum);
						 break;
				case "-": int diff = a - b;
							System.out.println(diff);
							break;
				case "*": int product = a*b;
							System.out.println(product);
							break;
				case "/": if(b != 0){
								int quotient = a/b;
								System.out.println(quotient);
							}else{
								System.out.println("Divide by zero error");
							}
							break;
				case ",": System.out.println("Enter the correct operator");
						break;		
			}
	}
}