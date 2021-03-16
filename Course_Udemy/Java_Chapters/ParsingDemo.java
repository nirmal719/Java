import java.io.*;

public class ParsingDemo{
	public static void main(String [] args) throws IOException{
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		String str;
		int i;
		int sum = 0;
		System.out.println("enter number 0 to quit: ");
		do{
			str = br.readLine();
			try{
				i = Integer.parseInt(str);
			}catch(NumberFormatException nfe){
				System.out.print("Invalid format ");
				i = 0;
			}
			sum += i;
			System.out.println("current sum is: "+sum);
		}while(i != 0);
	}
}