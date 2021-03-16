public class ExceptionHandling{
	public static void main(String [] args){
		try{
			int i = 10;
			int j = 10/0;
			System.out.println(j);
		} catch(ArithmeticException e){
			System.out.println("Arithmetic Expression is : " +e);
		}
	}
}