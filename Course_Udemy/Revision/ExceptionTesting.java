public class ExceptionTesting{
	public static void main(String [] args){
		int i = 10;
		try{
			int result = 10/0;
			System.out.println(result);
		}catch(ArithmeticException ae){
			System.out.println("Exception caught is: " +ae);
		}
	}
}