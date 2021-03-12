import java.io.*;

public class StandardCalculator{
	public static long add(int num1, int num2){
		long result = (long) (num1 + num2);
		return result;
	}
	public static int difference(int num1, int num2){
		int diff = num1 - num2;
		return diff;
	}
	public static long multiply(int num1, int num2){
		long product = (long)(num1 * num2);
		return product;
	}
	public static double divide(int num1, int num2){
		double div = (double) (num1/num2);
		return div;
	}
	public static void main(String [] args){
		try(BufferedReader buf = new BufferedReader(new InputStreamReader(System.in)))
		{
					int num1 = Integer.parseInt(buf.readLine());
					int num2 = Integer.parseInt(buf.readLine());
					char ch = (char)buf.read();
						if(ch == '+'){
							long res = add(num1, num2);
							System.out.println(res);
						}else if(ch == '-'){
							int diff = difference(num1, num2);
							System.out.println(diff);
						}else if(ch == '*'){
							long pro = multiply(num1, num2);
							System.out.println(pro);
						}else if(ch == '/'){
							double di = divide(num1, num2);
							System.out.println(di);
						}else{
							System.out.println("Wrong entry");
							return;
						}
		}catch(NumberFormatException nfe){
			System.out.println("Not a number: "+nfe);
		}catch(IOException ie){
			System.out.println("Exception caught: "+ie);
		}
	}
}