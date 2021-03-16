public class LocalVariableExample{
	public static void main(String [] args){
		int a = 10;
		int b = ++a + ++a;
		// int b = a++;
		int c = ++a;
		System.out.println(b + " " +c);
		
	}
}