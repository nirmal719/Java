public class SharedDigit{
	public static boolean hasSharedDigit(int a, int b){
		int temp = 0;
		int demo = 0;
		int temp1 = 0;
		int demo1 = 0;
		if((a >= 10) && (a <= 99) && (b >= 10) && (b <= 99)){
			temp = a % 10;
			demo = b % 10;
			temp1 = a/10;
			demo1 = b/10;
				if((temp == demo) || (temp == demo1) || (temp1 == demo)||(temp1 == demo1)){
					return true;
				}
		}
			return false;
		}
	public static void main(String [] args){
		boolean value = hasSharedDigit(12,23); 
		System.out.println(value);
		boolean val1 = hasSharedDigit(9,99);
		System.out.println(val1);
		System.out.println(hasSharedDigit(15,55));
	}
}