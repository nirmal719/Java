public class NumberWrapper{
	public static void main(String [] args){
		Double d1 = new Double(3.14159);
		Double d2 = new Double("3.14159E-5");
		System.out.println(d1 + " = " + d2 + " -> "+d1.equals(d2)); 
	}
}