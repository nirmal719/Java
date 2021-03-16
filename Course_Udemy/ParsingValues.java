import java.util.Scanner;

public class ParsingValues{
	Scanner sc = new Scanner(System.in);
	public static void main(String [] args){
		
		takeInput(
		parsing
	}
	private static void parsing(String num1,String op, String num2){
		do{
			switch(op){
				case "+": 	int sum = num1+num2;
							System.out.println(sum);
							break;
				case "-":	int diff = num1 - num2;
							System.out.println(diff);
							break;
				default: break;
			}
		}while(op != .);
	}
	private static void takeInput(String num1, String op, String num2){
		String num1 = sc.nextLine();
		String op = sc.nextLine();
		String ch = null;
		if(num1 != null){
			int t = Integer.parseInt(num1);
		}else if((op == "+") || (op == "-") || (op == "*")||(op == "/")){
			ch = op;
		}else if((num1 != null) && (op == null)){
			num1 = num1 + Integer.parseInt(num1);
		}else{
			num2 = sc.nextLine();
			parsing(n1,op, n2);
		}
		
	}
}