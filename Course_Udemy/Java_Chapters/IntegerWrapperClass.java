public class IntegerWrapperClass{
	public static void main(String [] main){
		long number = 1982;
		System.out.println(number +" in binary: "+Long.toBinaryString(number));
		System.out.println(number +" in Octal: "+Long.toOctalString(number));
		System.out.println(number +" in hexadecimal: "+Long.toHexString(number));
	}
}