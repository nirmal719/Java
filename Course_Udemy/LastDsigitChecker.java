public class LastDsigitChecker{
	public static boolean hasSameLastDigit(int a, int b, int c){
		if((a >= 10) && (a <= 1000) && (b >= 10) && (b <= 1000) && (c >= 10) && (c <= 1000)){
			int temp = a % 10;
			int temp1 = b % 10;
			int temp2 = c % 10;
			if((temp == temp1) || (temp == temp2) || (temp1 == temp2)){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
	public static void main(String [] args){
		System.out.println(hasSameLastDigit(123,234,345));
		System.out.println(hasSameLastDigit(23,32,42));
		System.out.println(hasSameLastDigit(41,22,71));
		System.out.println(hasSameLastDigit(9,99,999));
	}
}