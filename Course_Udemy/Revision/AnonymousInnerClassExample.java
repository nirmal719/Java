import java.util.Scanner;

class Outer4{
	Scanner sc = new Scanner(System.in);
	int num;
	Outer4(int a){
		num = a;
	}
	void anonymousClassMethod(){
		do{
			System.out.println("Enter 0-3 for calculator: ");
			value = sc.nextInt();
			switch(value){
				case 0: add(int a, int b){
							int result = 0;
								public void sum(){
									result = a+b;
									System.out.println(result);
								}
							};
						break;
				default: break;
			}
		}while(value <= 3);	
	}
}
public class AnonymousInnerClassExample{
	public static void main(String [] args){
		Outer4 out4 = new Outer4(10);
		out4.anonymousClassMethod();
	}
}