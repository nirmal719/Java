import java.io.*;

public class SimpleCalculator{
	public static void main(String [] args){
		try(BufferedReader buf = new BufferedReader(new InputStreamReader(System.in))){
			int choice;
			int num1;
			int num2;
			do{
				System.out.println("Enter your choice: 0 to exit else 1 to add, 2 to subtract, 3 to multiply, 4 to divide, 5 for percentage, 6 for exponent value - ");
				choice = Integer.parseInt(buf.readLine());
				switch(choice){
					case 1: num1 = Integer.parseInt(buf.readLine());
							num2 = Integer.parseInt(buf.readLine());
							int result = num1 + num2;
							System.out.println("sum: "+result);
							break;
							
					case 2: num1 = Integer.parseInt(buf.readLine());
							num2 = Integer.parseInt(buf.readLine());
							int difference = num1 - num2;
							System.out.println("difference: "+difference);
							break;
					
					case 3: num1 = Integer.parseInt(buf.readLine());
							num2 = Integer.parseInt(buf.readLine());
							int product = num1 * num2;
							System.out.println("product: "+product);
							break;
						
					case 4: num1 = Integer.parseInt(buf.readLine());
							num2 = Integer.parseInt(buf.readLine());
							double quotient = (double)num1 / num2;
							System.out.println("quotient: "+quotient);
							break;
					
					case 5: num1 = Integer.parseInt(buf.readLine());
							num2 = Integer.parseInt(buf.readLine());
							double percentage = (double)(num1 / num2) * 100;
							System.out.println("% value: "+percentage+" %");
							break;
							
					case 6: num1 = Integer.parseInt(buf.readLine());
							num2 = Integer.parseInt(buf.readLine());
							long value = 1;
							for(int i = 0; i < num2; i++){
								value *= num1;
							}
							System.out.println("outcome: "+value);
							break;
							
					default: break;		
				}	
			}while(choice != 0);
		}catch(IOException ie){
			System.out.println("Exception: "+ie);
		}
	}
}